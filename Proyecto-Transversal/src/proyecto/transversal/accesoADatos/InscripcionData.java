
package proyecto.transversal.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyecto.transversal.entidades.Alumno;
import proyecto.transversal.entidades.Inscripcion;
import proyecto.transversal.entidades.Materia;

public class InscripcionData {
    
    private Connection con = null;
    private final MateriaData md = new MateriaData(); 
    private final AlumnoData ad = new AlumnoData(); 

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void GuardarInscripcion(Inscripcion insc) {
        try {
            String sql = "INSERT INTO inscripcion(nota, idAlumno, idMataria) VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdIncripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion exitosa");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }
    }
   
     public List<Inscripcion> ObtenerInscripcionesPorAlumno(int idAlumno){
        List<Inscripcion> cursada = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet resultado = ps.executeQuery();
                 while(resultado.next()){
                      Inscripcion insc = new  Inscripcion();
                      insc.setIdIncripcion(resultado.getInt("idInscripto"));
                      Alumno alu = ad.buscarAlumnoPorID(resultado.getInt("idAlumno"));
                      Materia mat = md.buscarMateria(resultado.getInt("idMateria"));
                      insc.setAlumno(alu);
                      insc.setMateria(mat);
                      insc.setNota(resultado.getInt("nota"));
                      cursada.add(insc);
                 }
                 ps.close();
            } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }
        return cursada; 
        }
 
   public void ActualizarNota(int idAlumno,int idMateria, double nota){
     String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMataria = ?";
      try {
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setDouble(1, nota);
          ps.setInt(2, idAlumno);
          ps.setInt(3, idMateria);
          int rs = ps.executeUpdate();
          if(rs > 0){
              JOptionPane.showMessageDialog(null, "Se actualizo la nota correctamente");
          } else {
              JOptionPane.showMessageDialog(null, "No se encontro resultado");
          }
          ps.close();
      } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }
    
 }
   
     public void BorrarInscripcionMateriaAlumno(int idAlumno , int idMateria){
     String sql = "DELETE FROM `inscripcion` WHERE idAlumno = ? AND idMataria = ?";
     try {
         PreparedStatement ps = con.prepareStatement(sql); 
         ps.setInt(1, idAlumno);
         ps.setInt(2, idMateria);
         int rs = ps.executeUpdate();
          if(rs == 1){
              JOptionPane.showMessageDialog(null, "Se elimino la Inscripcion");
          } else {
              JOptionPane.showMessageDialog(null, "No se encontro registros");
          }
          ps.close();
     }  catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }

 }
 
   public List<Materia> ObtenerMateriasCursadas(int idAlumno){
         ArrayList<Materia> materias = new ArrayList<>();
         String sql = "SELECT inscripcion.idMataria , nombre , año FROM inscripcion , "
           + "materia WHERE inscripcion.idMataria = materia.idMateria AND inscripcion.idAlumno = ?";
         try {
           PreparedStatement ps = con.prepareStatement(sql);    
           ps.setInt(1, idAlumno);
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
             Materia materia = new Materia();
             materia.setIdMateria(rs.getInt("idMateria"));
             materia.setNombre(rs.getString("nombre"));
             materia.setAnioMateria(rs.getInt("año"));
             materias.add(materia);
           }
           ps.close();
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }
     return materias;
     }
    
   public List<Materia> ObtenerMateriasNoCursadas(int idAlumno){
         ArrayList<Materia> materias = new ArrayList<>();
         String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria not in "
                 + "(SELECT idMatria FROM inscripcion WHERE idAlumno = ?)";
       try {
           PreparedStatement ps = con.prepareStatement(sql);    
           ps.setInt(1, idAlumno);
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
             Materia materia = new Materia();
             materia.setIdMateria(rs.getInt("idMateria"));
             materia.setNombre(rs.getString("nombre"));
             materia.setAnioMateria(rs.getInt("año"));
             materias.add(materia);
           }
           ps.close();
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }
     return materias;
     } 
    
    public List<Alumno> ObtenerAlumnoXMateria(int idMateria){
    ArrayList<Alumno> alumnosMateria = new ArrayList<>();
    String sql = "SELECT a.idAlumno,dni,nombre,apellido,fechaNacimiento,estado "
            + "FROM inscripcion i , alumno a WHERE i.idAlumno = a.idAlumno AND idMateria = ? AND a.estado = 1 ";
        try {  
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria); 
            ResultSet rs = ps.executeQuery();
             while(rs.next()){
             Alumno alumno = new Alumno();
             alumno.setIdAlumno(rs.getInt("idAlumno"));
             alumno.setApellido(rs.getString("apellido"));
             alumno.setNombre(rs.getString("nombre"));
             alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
             alumno.setActivo(rs.getBoolean("estado"));
             alumnosMateria.add(alumno);
           }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }
   return alumnosMateria;  
        }
}

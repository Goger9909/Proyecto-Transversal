
package proyecto.transversal.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyecto.transversal.entidades.Inscripcion;

public class InscripcionData {
    
      private Connection con = null;
    private MateriaData matdata; 
    private AlumnoData aludata; 

    public InscripcionData() {
        con = Conexion.getConexion();
        this.matdata =  matdata;
        this.aludata =  aludata;
    }

    public void GuardarAlumno(Inscripcion insc) {
        try {
            String sql = "INSERT INTO inscripcion(nota, idAlumno, idMataria) VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno());
            ps.setInt(3, insc.getMateria());
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
   
     public List<Inscripcion> ObtenerInscripcionesPorAlumno(int id){
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ? ";
        List<Inscripcion> inscriptos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Inscripcion ins = new Inscripcion();
                ins.setIdIncripcion(rs.getInt("idInscripto"));
                ins.setNota(rs.getInt("nota"));
                inscriptos.add(ins);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());
        }
        
        return inscriptos;
 }
 
    public void ActualizarNota(int idAlumno,int idMateria, double nota){
     
     String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMataria = ?";
      try {
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setDouble(1, nota);
          ps.setInt(2, idAlumno);
          ps.setInt(3, idMateria);
          
          int rs = ps.executeUpdate();
          if(rs == 1){
              JOptionPane.showMessageDialog(null, "Se actualizo la nota correctamente");
          } else {
              JOptionPane.showMessageDialog(null, "No se actualizo la nota");
          }
          ps.close();
      } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }
    
 }
 
}


package proyecto.transversal.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto.transversal.entidades.Materia;


public class MateriaData {
    
    private Connection con = null;

    public MateriaData(){
    
        con = Conexion.getConexion();
    }

    public void guardarMateria(Materia materia){
        
        String sql = "INSERT INTO materia (nombre, año, estado)" 
                    +"VALUES (?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2,materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
            
                materia.setIdMateria(rs.getInt(1)); // es la primer columna la del id
                JOptionPane.showMessageDialog(null, "La Materia se guardo con exito");
           }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la la tabla Materia" + ex);
        }
    }
    
       
        public void modificarMateria(Materia materia){
        
            String sql = "UPDATE materia SET nombre= ?, año= ? "
                    +"WHERE idMateria = ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2,materia.getAnioMateria());
            int exito = ps.executeUpdate();
            if(exito == 1){
                
            JOptionPane.showMessageDialog(null, "Materia modificada");
            
            }
                    
            } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Materia" + ex);
        }
        
        }
        
        public void eliminarMateria(int id){
        
        String sql = "UPDATE materia SET estado=0 WHERE idMateria=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Materia Eliminada");
            }
            
                   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        }
        
        public Materia buscarMateria(int id){
        
            String sql = "SELECT nombre, año, estado FROM materia WHERE idMateria=?";
            Materia materia = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(true);
            } else{
            JOptionPane.showMessageDialog(null, "No existe una materia con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
           return materia;        
        }
    
   
}


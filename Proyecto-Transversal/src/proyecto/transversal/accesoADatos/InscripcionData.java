
package proyecto.transversal.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
   
}


package proyecto.transversal.vista;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.transversal.accesoADatos.AlumnoData;
import proyecto.transversal.accesoADatos.InscripcionData;
import proyecto.transversal.entidades.Alumno;
import proyecto.transversal.entidades.Inscripcion;


public class CargaDeNotas extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int filas, int columnas) {
            return false;
        }
    };

    public CargaDeNotas() {
        initComponents();
        cargarModelo();
        cargaAlumno();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcAlumnos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(479, 354));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Selecciona un alumno");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 49, 134, -1));

        jcAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcAlumnosItemStateChanged(evt);
            }
        });
        jPanel1.add(jcAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 44, 184, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cargar de Notas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 6, 147, -1));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 114, 385, 117));

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 291, -1, -1));

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 291, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
                   this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcAlumnosItemStateChanged
        try {
            borraFila();
            InscripcionData is = new InscripcionData();
            Alumno al = (Alumno) jcAlumnos.getSelectedItem();
            int id = al.getIdAlumno();
            for (Inscripcion inscripcion : is.ObtenerInscripcionesPorAlumno(id)) {
                modelo.addRow(new Object[]{inscripcion.getIdIncripcion(), inscripcion.getMateria(), inscripcion.getNota()});
            }
        } catch (NullPointerException e) {
        }
    }//GEN-LAST:event_jcAlumnosItemStateChanged

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        try {

            int filaSeleccionada = Tabla.getSelectedRow(); // Obtener la fila seleccionada

            if (filaSeleccionada != -1) { // Asegurarse de que se haya seleccionado una fila
                String name = JOptionPane.showInputDialog("Coloque la nota");
                double nota = Double.parseDouble(name);// Obtener la nota
                Alumno al = (Alumno) jcAlumnos.getSelectedItem();
                int id = al.getIdAlumno();
                InscripcionData is = new InscripcionData();
                ArrayList<Inscripcion> inscripciones = (ArrayList<Inscripcion>) is.ObtenerInscripcionesPorAlumno(id);
                Inscripcion inscripcion = inscripciones.get(filaSeleccionada);
                int idm = inscripcion.getMateria().getIdMateria();
                if (nota <= 10 && nota >= 0) {
                    is.ActualizarNota(id, idm, nota);
                } else {
                    JOptionPane.showMessageDialog(null, "La nota no puede ser superior a 10 ni menor de 0");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No selecciono ninguna materia.");
            }
            borraFila();
            InscripcionData is = new InscripcionData();
            Alumno al = (Alumno) jcAlumnos.getSelectedItem();
            int id = al.getIdAlumno();
            for (Inscripcion materia : is.ObtenerInscripcionesPorAlumno(id)) {
                modelo.addRow(new Object[]{materia.getIdIncripcion(), materia.getMateria(), materia.getNota()});
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número válido");
        } catch (NullPointerException e) {
        }
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcAlumnos;
    // End of variables declaration//GEN-END:variables
public void cargarModelo() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");
        Tabla.setModel(modelo);
    }

public void cargaAlumno() {
        AlumnoData al = new AlumnoData();
        jcAlumnos.addItem(jcAlumnos.getItemAt(-1));
        for (Alumno alumno : al.listaAlumnos()) {
            jcAlumnos.addItem(alumno);
        }
    }

private void borraFila() {
        int fila = Tabla.getRowCount() - 1;

        for (int f = fila; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}

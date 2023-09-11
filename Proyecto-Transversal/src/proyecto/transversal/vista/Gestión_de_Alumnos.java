package proyecto.transversal.vista;

import java.time.LocalDate;
import java.util.Date;
import proyecto.transversal.accesoADatos.AlumnoData;
import proyecto.transversal.entidades.Alumno;

public class Gestión_de_Alumnos extends javax.swing.JInternalFrame {

    public Gestión_de_Alumnos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        DNI = new javax.swing.JLabel();
        jtDNI = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        Estado = new javax.swing.JLabel();
        FechaNac = new javax.swing.JLabel();
        jtEstado = new javax.swing.JRadioButton();
        jBuscar = new javax.swing.JButton();
        jtFechaNac = new com.toedter.calendar.JDateChooser();
        jNuevo = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jGuardar = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Gestión de Alumnos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 6, -1, -1));

        DNI.setText("DNI: ");
        DNI.setEnabled(false);
        jPanel1.add(DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 49, -1, -1));

        jtDNI.setEnabled(false);
        jPanel1.add(jtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 45, 125, -1));

        Nombre.setText("Nombre: ");
        Nombre.setEnabled(false);
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 131, -1, -1));

        Apellido.setText("Apellido: ");
        Apellido.setEnabled(false);
        jPanel1.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 90, -1, -1));

        jtApellido.setEnabled(false);
        jPanel1.add(jtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 86, 125, -1));

        jtNombre.setEnabled(false);
        jPanel1.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 127, 125, -1));

        Estado.setText("Estado: ");
        Estado.setEnabled(false);
        jPanel1.add(Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 168, -1, -1));

        FechaNac.setText("Fecha de Nacimiento: ");
        FechaNac.setEnabled(false);
        jPanel1.add(FechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 205, -1, -1));

        jtEstado.setEnabled(false);
        jPanel1.add(jtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 168, -1, -1));

        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 45, -1, -1));

        jtFechaNac.setEnabled(false);
        jPanel1.add(jtFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 205, 125, -1));

        jNuevo.setText("Nuevo");
        jNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 299, -1, -1));

        jEliminar.setText("Eliminar");
        jEliminar.setEnabled(false);
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 299, -1, -1));

        jGuardar.setText("Guardar");
        jGuardar.setEnabled(false);
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 299, -1, -1));

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 299, -1, -1));

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

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        DNI.setEnabled(true);
        Nombre.setEnabled(true);
        Apellido.setEnabled(true);
        Estado.setEnabled(true);
        FechaNac.setEnabled(true);
        jtDNI.setEnabled(true);
        jtApellido.setEnabled(true);
        jtNombre.setEnabled(true);
        jtEstado.setEnabled(true);
        jtFechaNac.setEnabled(true);
        jEliminar.setEnabled(true);
        jGuardar.setEnabled(true);


    }//GEN-LAST:event_jBuscarActionPerformed

    private void jNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevoActionPerformed
        DNI.setEnabled(true);
        Nombre.setEnabled(true);
        Apellido.setEnabled(true);
        Estado.setEnabled(true);
        FechaNac.setEnabled(true);
        jtDNI.setEnabled(true);
        jtApellido.setEnabled(true);
        jtNombre.setEnabled(true);
        jtEstado.setEnabled(true);
        jtFechaNac.setEnabled(true);
        jEliminar.setEnabled(true);
        jGuardar.setEnabled(true);


    }//GEN-LAST:event_jNuevoActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed

        DNI.setEnabled(false);
        Nombre.setEnabled(false);
        Apellido.setEnabled(false);
        Estado.setEnabled(false);
        FechaNac.setEnabled(false);
        jtDNI.setEnabled(false);
        jtApellido.setEnabled(false);
        jtNombre.setEnabled(false);
        jtEstado.setEnabled(false);
        jtFechaNac.setEnabled(false);
        jEliminar.setEnabled(false);
        jGuardar.setEnabled(false);
    }//GEN-LAST:event_jEliminarActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed

        //(dni, apellido, nombre, fechaNacimiento, estado
        int dni = Integer.parseInt(jtDNI.getText());
        String apellido = jtApellido.getText();
        String nombre = jtNombre.getText();
        LocalDate fechaNac = jtFechaNac.getLocalDate();
        boolean activo = jtEstado.isSelected();

        AlumnoData ad = new AlumnoData();

        // Crear una instancia de Persona
        Alumno alumno = new Alumno(dni, apellido, nombre, fechaNac, activo);
        // Agregar la persona a la AlumnoData
        ad.agregarAlumno(alumno);

        DNI.setEnabled(false);
        Nombre.setEnabled(false);
        Apellido.setEnabled(false);
        Estado.setEnabled(false);
        FechaNac.setEnabled(false);
        jtDNI.setEnabled(false);
        jtApellido.setEnabled(false);
        jtNombre.setEnabled(false);
        jtEstado.setEnabled(false);
        jtFechaNac.setEnabled(false);
        jEliminar.setEnabled(false);
        jGuardar.setEnabled(false);
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed

    }//GEN-LAST:event_jSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel DNI;
    private javax.swing.JLabel Estado;
    private javax.swing.JLabel FechaNac;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton jBuscar;
    private javax.swing.JButton jEliminar;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jNuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JButton jSalir;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JRadioButton jtEstado;
    private com.toedter.calendar.JDateChooser jtFechaNac;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}

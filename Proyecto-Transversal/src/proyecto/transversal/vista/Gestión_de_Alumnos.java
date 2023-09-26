package proyecto.transversal.vista;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.JOptionPane;
import proyecto.transversal.accesoADatos.AlumnoData;
import proyecto.transversal.entidades.Alumno;

public class Gestión_de_Alumnos extends javax.swing.JInternalFrame {

    public Gestión_de_Alumnos() {
        initComponents();
        this.setSize(487, 455);
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

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText(" Alumnos");

        DNI.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DNI.setText("DNI: ");

        jtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDNIKeyTyped(evt);
            }
        });

        Nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Nombre.setText("Nombre: ");

        Apellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Apellido.setText("Apellido: ");

        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });

        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });

        Estado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Estado.setText("Estado: ");

        FechaNac.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FechaNac.setText("Fecha de Nacimiento: ");

        jBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar.jpg"))); // NOI18N
        jBuscar.setText("Buscar");
        jBuscar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alumnoo.jpg"))); // NOI18N
        jNuevo.setText("Nuevo");
        jNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevoActionPerformed(evt);
            }
        });

        jEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.jpg"))); // NOI18N
        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar.jpg"))); // NOI18N
        jGuardar.setText("Guardar");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        jSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.jpg"))); // NOI18N
        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Apellido)
                            .addComponent(DNI)
                            .addComponent(Nombre)
                            .addComponent(Estado)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FechaNac)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(jEliminar)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtEstado)
                    .addComponent(jtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                        .addComponent(jtDNI, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jGuardar)
                .addGap(18, 18, 18)
                .addComponent(jSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DNI)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apellido)
                    .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Estado)
                    .addComponent(jtEstado))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FechaNac, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtFechaNac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNuevo)
                    .addComponent(jEliminar)
                    .addComponent(jGuardar)
                    .addComponent(jSalir))
                .addGap(28, 28, 28))
        );

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

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        try {
            //corrobora que todos los campos estan llenos
            if (jtDNI.getText().isEmpty() || jtApellido.getText().isEmpty() || jtNombre.getText().isEmpty() || jtEstado.isSelected() == false || jtFechaNac.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Todos los campo deben estar llenos");
            } else {
                if (modificar == false) {
                    int dni = Integer.parseInt(jtDNI.getText());
                    String apellido = jtApellido.getText().trim().substring(0, 1).toUpperCase() + jtApellido.getText().trim().substring(1).toLowerCase();
                    String nombre = jtNombre.getText().trim().substring(0, 1).toUpperCase() + jtNombre.getText().trim().substring(1).toLowerCase();
                    java.util.Date fechaNacimientoUtil = jtFechaNac.getDate();
                    Instant instant = fechaNacimientoUtil.toInstant();
                    LocalDate fechaNac = instant.atZone(ZoneId.systemDefault()).toLocalDate();
                    Date fecha = new Date();
                    LocalDate fechaHoy = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    long diferenciaAn = ChronoUnit.YEARS.between(fechaNac, fechaHoy);
                    boolean activo = jtEstado.isSelected();
                    //<<<<<<<compueba si el DNI esta repetido>>>>>>>>>>//
                    boolean bus = false;
                    for (Alumno busqueda : ad.listaAlumnos()) {
                        int dniComprobacion = busqueda.getDni();
                        if (dniComprobacion == dni) {
                            JOptionPane.showMessageDialog(null, "DNI repetido");
                            bus = true;
                        }
                    }
                    if (bus == false && diferenciaAn >= 17) {
                        // Crear una instancia de Persona
                        Alumno alumno = new Alumno(dni, apellido, nombre, fechaNac, activo);
                        // Agregar la persona a la AlumnoData
                        ad.agregarAlumno(alumno);
                        jtDNI.setText("");
                        jtApellido.setText("");
                        jtNombre.setText("");
                        jtFechaNac.setDate(null);
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe ser mayor de 17 años");
                    }

                } else {
                    int dni = Integer.parseInt(jtDNI.getText());
                    String apellido = jtApellido.getText().trim().substring(0, 1).toUpperCase() + jtApellido.getText().trim().substring(1).toLowerCase();
                    String nombre = jtNombre.getText().trim().substring(0, 1).toUpperCase() + jtNombre.getText().trim().substring(1).toLowerCase();

                    java.util.Date fechaNacimientoUtil = jtFechaNac.getDate();
                    Instant instant = fechaNacimientoUtil.toInstant();
                    LocalDate fechaNac = instant.atZone(ZoneId.systemDefault()).toLocalDate();
                    boolean activo = jtEstado.isSelected();

                    // Crear una instancia de Alumno
                    Alumno alumno = new Alumno(id, dni, apellido, nombre, fechaNac, activo);
                    // Agregar un alumno a AlumnoData
                    ad.modificarAlumno(alumno);
                    modificar = false;
                      //Borramos los valores y limpiamos la tabla
                jtDNI.setText("");
                jtApellido.setText("");
                jtNombre.setText("");
                jtFechaNac.setDate(null);
                jtEstado.setSelected(false);
                }
              
            }
        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Algunos de los campos fueron mal ingresados");
        }

    }//GEN-LAST:event_jGuardarActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        ad.eliminarAlumno(id);
        //Borramos los valores y limpiamos la tabla
        jtDNI.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jtFechaNac.setDate(null);
        jtEstado.setSelected(false);
    }//GEN-LAST:event_jEliminarActionPerformed

    private void jNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevoActionPerformed
        //Borramos los valores y limpiamos la tabla
        jtDNI.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jtFechaNac.setDate(null);
        jtEstado.setSelected(false);
    }//GEN-LAST:event_jNuevoActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        try {
            int dni = Integer.parseInt(jtDNI.getText());
        Alumno alumno = ad.buscarAlumnoPorDni(dni);
        id = alumno.getIdAlumno();
        String apellido = alumno.getApellido();
        String nombre = alumno.getNombre();
        LocalDate fechaNac = alumno.getFechaNac();
        Date fechaNacimiento;
        if (fechaNac != null) {
            fechaNacimiento = Date.from(fechaNac.atStartOfDay(ZoneId.systemDefault()).toInstant());
            // Continuar con el código
        } else {
            fechaNacimiento = (null);
        }
        //Rellenamos tabla, con los valores de la base de datos
        jtApellido.setText(apellido);
        jtNombre.setText(nombre);
        jtFechaNac.setDate(fechaNacimiento);
        jtEstado.setSelected(true);
        //Ponemos en true 'modificar', para especificar en el boton 'eliminar' y en 'guardar' para poder modificar los valores existentes
        modificar = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dato mal ingresado");
        }
        
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
        // solo permite letras
                int key = evt.getKeyChar();
    boolean letrasMin = key >= 97 && key <=122  ;
    boolean letrasMay = key >= 65 && key <= 90;
    if(!(letrasMin || letrasMay)){
        evt.consume();
    }
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        // solo permite letras
               int key = evt.getKeyChar();
    boolean letrasMin = key >= 97 && key <=122  ;
    boolean letrasMay = key >= 65 && key <= 90;
    if(!(letrasMin || letrasMay)){
        evt.consume();
    }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDNIKeyTyped
        // TODO add your handling code here:
                   int key = evt.getKeyChar();
    boolean numeros = key >= 48 && key <=57;
    if(!numeros){
        evt.consume();
    }
    jtDNI.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent evt){
            if(jtDNI.getText().length() >= 8){
                evt.consume();
            }
        }
});
    }//GEN-LAST:event_jtDNIKeyTyped
    //Instanciamos la clase AlumnoData como ad
    AlumnoData ad = new AlumnoData();

    private boolean modificar = false;
    int id;


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
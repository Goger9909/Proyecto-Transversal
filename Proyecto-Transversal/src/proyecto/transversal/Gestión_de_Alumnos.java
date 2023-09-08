package proyecto.transversal;

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

        jLabel2.setText("Gestión de Alumnos");

        DNI.setText("DNI: ");
        DNI.setEnabled(false);

        jtDNI.setEnabled(false);

        Nombre.setText("Nombre: ");
        Nombre.setEnabled(false);

        Apellido.setText("Apellido: ");
        Apellido.setEnabled(false);

        jtApellido.setEnabled(false);

        jtNombre.setEnabled(false);

        Estado.setText("Estado: ");
        Estado.setEnabled(false);

        FechaNac.setText("Fecha de Nacimiento: ");
        FechaNac.setEnabled(false);

        jtEstado.setEnabled(false);

        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jtFechaNac.setEnabled(false);

        jNuevo.setText("Nuevo");
        jNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevoActionPerformed(evt);
            }
        });

        jEliminar.setText("Eliminar");
        jEliminar.setEnabled(false);
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jGuardar.setText("Guardar");
        jGuardar.setEnabled(false);
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        jSalir.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre)
                    .addComponent(DNI)
                    .addComponent(Apellido)
                    .addComponent(FechaNac)
                    .addComponent(Estado)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jEliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtEstado)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jGuardar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtFechaNac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtDNI)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSalir)))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DNI)
                    .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Estado)
                    .addComponent(jtEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FechaNac)
                    .addComponent(jtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNuevo)
                    .addComponent(jEliminar)
                    .addComponent(jGuardar)
                    .addComponent(jSalir))
                .addContainerGap())
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

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        DNI.setEnabled(true);Nombre.setEnabled(true);Apellido.setEnabled(true);Estado.setEnabled(true);FechaNac.setEnabled(true);
        jtDNI.setEnabled(true);jtApellido.setEnabled(true);jtNombre.setEnabled(true);jtEstado.setEnabled(true);jtFechaNac.setEnabled(true);
        jEliminar.setEnabled(true);jGuardar.setEnabled(true);
        
        
        
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevoActionPerformed
        DNI.setEnabled(true);Nombre.setEnabled(true);Apellido.setEnabled(true);Estado.setEnabled(true);FechaNac.setEnabled(true);
        jtDNI.setEnabled(true);jtApellido.setEnabled(true);jtNombre.setEnabled(true);jtEstado.setEnabled(true);jtFechaNac.setEnabled(true);
        jEliminar.setEnabled(true);jGuardar.setEnabled(true);
        
        
        
        
        
    }//GEN-LAST:event_jNuevoActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        
        
        
        
        DNI.setEnabled(false);Nombre.setEnabled(false);Apellido.setEnabled(false);Estado.setEnabled(false);FechaNac.setEnabled(false);
        jtDNI.setEnabled(false);jtApellido.setEnabled(false);jtNombre.setEnabled(false);jtEstado.setEnabled(false);jtFechaNac.setEnabled(false);
        jEliminar.setEnabled(false);jGuardar.setEnabled(false);
    }//GEN-LAST:event_jEliminarActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        
        
        
        
        DNI.setEnabled(false);Nombre.setEnabled(false);Apellido.setEnabled(false);Estado.setEnabled(false);FechaNac.setEnabled(false);
        jtDNI.setEnabled(false);jtApellido.setEnabled(false);jtNombre.setEnabled(false);jtEstado.setEnabled(false);jtFechaNac.setEnabled(false);
        jEliminar.setEnabled(false);jGuardar.setEnabled(false);
    }//GEN-LAST:event_jGuardarActionPerformed


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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.transversal.vista;

import javax.swing.JOptionPane;
import proyecto.transversal.accesoADatos.MateriaData;
import proyecto.transversal.entidades.Materia;

/**
 *
 * @author Usuario
 */
public class Vista_Materia extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_Materia
     */
    public Vista_Materia() {
        initComponents();

        jbEliminar.setEnabled(false);
        jbGuardar.setEnabled(false);
        jtfNombre.setEnabled(false);
        jtfAnio.setEnabled(false);
        jrbEstado.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpVistaMateria = new javax.swing.JPanel();
        jlTituloMateria = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlCodigo = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlAnio = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jtfCodigo = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfAnio = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));
        setToolTipText("");
        setVisible(true);

        jlTituloMateria.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlTituloMateria.setText("MATERIA");

        jlCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlCodigo.setText("Codigo:");

        jlNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlNombre.setText("Nombre:");

        jlAnio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlAnio.setText("Año:");

        jlEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlEstado.setText("Estado:");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.setMaximumSize(new java.awt.Dimension(79, 25));
        jbNuevo.setMinimumSize(new java.awt.Dimension(79, 25));
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.setMaximumSize(new java.awt.Dimension(79, 25));
        jbSalir.setMinimumSize(new java.awt.Dimension(79, 25));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpVistaMateriaLayout = new javax.swing.GroupLayout(jpVistaMateria);
        jpVistaMateria.setLayout(jpVistaMateriaLayout);
        jpVistaMateriaLayout.setHorizontalGroup(
            jpVistaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                .addGroup(jpVistaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jlTituloMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jlCodigo)
                        .addGap(35, 35, 35)
                        .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(jbBuscar))
                    .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jlAnio)
                        .addGap(53, 53, 53)
                        .addComponent(jtfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jpVistaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jpVistaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                                    .addComponent(jlEstado)
                                    .addGap(36, 36, 36)
                                    .addComponent(jrbEstado))
                                .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(jbGuardar)
                                    .addGap(54, 54, 54)
                                    .addComponent(jbEliminar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                                .addComponent(jlNombre)
                                .addGap(31, 31, 31)
                                .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(107, 107, 107))
        );
        jpVistaMateriaLayout.setVerticalGroup(
            jpVistaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jlTituloMateria)
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jpVistaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jlCodigo))
                    .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbBuscar))
                .addGap(58, 58, 58)
                .addGroup(jpVistaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jlNombre))
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jpVistaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jlAnio))
                    .addComponent(jtfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jpVistaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jlEstado))
                    .addComponent(jrbEstado))
                .addGap(43, 43, 43)
                .addGroup(jpVistaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardar)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpVistaMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpVistaMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    MateriaData md = new MateriaData();
//    private boolean modificar=false;
    private int id;
    private String nombre = null;
    private int anioMat;
    boolean activo = false;

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        if(jbBuscar.getText().equals("Atras")){
            jbEliminar.setEnabled(false);
            jbGuardar.setEnabled(false);
            jbBuscar.setText("Buscar");
            jtfCodigo.setEnabled(true);
            jtfNombre.setText("");
            jtfNombre.setEnabled(false);
            jtfAnio.setEnabled(false);
            jrbEstado.setEnabled(false);
            jtfAnio.setText(null);
            
                       
        } else {
            
        
        try {
            id = Integer.parseInt(jtfCodigo.getText());
            Materia mate = md.buscarMateria(id);
            nombre = mate.getNombre();
            anioMat = mate.getAnioMateria();
            activo = mate.isActivo();
            
            jtfNombre.setEnabled(true);
            jtfAnio.setEnabled(true);
            jrbEstado.setEnabled(true);
            
            jtfNombre.setText(nombre);
            jtfAnio.setText(anioMat + "");
            jrbEstado.setSelected(activo);
            
            if (activo == true) {
                jbEliminar.setEnabled(true);
                jbGuardar.setEnabled(true);
                
                
            } else {
                jbEliminar.setEnabled(false);
                jbGuardar.setEnabled(true);
                
            }

//            modificar=true;
        } catch (NullPointerException ex) {
      // no la manejo aqui con JOP, ya que el mismo metodo de "buscarMateria(int id)" en MateriaData me tira el mensaje...

            jtfNombre.setText(null);
            jtfAnio.setText(null);
            jrbEstado.setSelected(false);
            activo = false;
            
            jtfNombre.setEnabled(false);
            jtfAnio.setEnabled(false);
            jrbEstado.setEnabled(false);
            jbEliminar.setEnabled(false);
            jbGuardar.setEnabled(false);
  
        } catch (NumberFormatException ex) {
            // en caso de que el usuario ingrese letras
            JOptionPane.showMessageDialog(null, "El campo solo acepta numeros");
            jtfNombre.setText(null);
            jtfAnio.setText(null);
            jrbEstado.setSelected(false);
            activo = false;
            jbEliminar.setEnabled(false);
            jtfNombre.setEnabled(false);
            jtfAnio.setEnabled(false);
            jrbEstado.setEnabled(false);
            jbEliminar.setEnabled(false);
            jbGuardar.setEnabled(false);
                    
        }
        
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        boolean decision = false;
        try {
            id = Integer.parseInt(jtfCodigo.getText());
            if (id == md.buscarMateria(id).getIdMateria()) {
                decision = true;
            }
        } catch (NullPointerException | NumberFormatException ex) {
            decision = false;
        }
        
//PARA EDITAR LA MATERIA CORRECTAMENTE
        if (decision == true) {
            
            try {
                nombre = jtfNombre.getText();
                anioMat = Integer.parseInt(jtfAnio.getText());
                activo = jrbEstado.isSelected();
                Materia mat = new Materia(id, nombre, anioMat, activo);
                md.modificarMateria(mat);

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(null, "Debe agregar solo números en año");
                jtfAnio.setText(null);

            } catch (NullPointerException ex) {

                JOptionPane.showMessageDialog(null, "No debe haber campos vacios");
            } 
// PARA GUARDAR UNA MATERIA NUEVA
        } else if (decision == false) {
            boolean re = false;
            try{
            nombre = jtfNombre.getText();
            anioMat = Integer.parseInt(jtfAnio.getText());
            }catch(NullPointerException | NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Complete los campos correctamente");
                nombre="";
                anioMat=0;
                re = true;
            }
            activo = jrbEstado.isSelected();
            MateriaData mD = new MateriaData();
            String nombreMateria;
            // en este caso llamamos al listado nuevo de BuscarTodasMaterias() para ver las eliminadas que coinciten en nombre para dar opcion de activarlas nuevamente...
            for (Materia bus : mD.listarTodasMaterias()) {
                nombreMateria = bus.getNombre();
                
                if (nombreMateria.equalsIgnoreCase(nombre)) {
                    int idmat = bus.getIdMateria();
                    JOptionPane.showMessageDialog(null, "Materia repetida, ID: "+idmat);
                    re = true;
                }
            }
            if (re == false) { 
                if(nombre.equals("")){
                    JOptionPane.showMessageDialog(null,"Debe ingresar un nombre");
                } else {
                    Materia mat = new Materia(nombre, anioMat, activo);
                    md.guardarMateria(mat);
                }
            }          
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
//        try{
        id = Integer.parseInt(jtfCodigo.getText());
        activo = jrbEstado.isSelected();
        if (activo == true) {
            md.eliminarMateria(id);
            jrbEstado.isSelected();
        }
//        }catch (NullPointerException ex){
//        JOptionPane.showMessageDialog(null, "Debe Seleccionar una materia para eliminar");
//        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        jbGuardar.setEnabled(true);
        jtfNombre.setEnabled(true);
        jtfAnio.setEnabled(true);
        jrbEstado.setEnabled(true);
        jtfCodigo.setEnabled(false); // Se desactiva codigo por que solo sirve para la busqueda
        jtfCodigo.setText("");
        
        jtfNombre.setText("");
        jtfAnio.setText(null);
        jbBuscar.setText("Atras");
        
    }//GEN-LAST:event_jbNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlAnio;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlTituloMateria;
    private javax.swing.JPanel jpVistaMateria;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtfAnio;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}

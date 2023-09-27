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
        this.setSize(487, 455);
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

        jpVistaMateria.setBackground(new java.awt.Color(0, 102, 255));

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

        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreKeyTyped(evt);
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
                        .addGap(42, 42, 42)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jlTituloMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jpVistaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                                .addComponent(jlNombre)
                                .addGap(28, 28, 28)
                                .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                                .addGroup(jpVistaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCodigo)
                                    .addComponent(jlAnio)
                                    .addComponent(jlEstado))
                                .addGap(40, 40, 40)
                                .addGroup(jpVistaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                                        .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(85, 85, 85)
                                        .addComponent(jbBuscar))
                                    .addComponent(jrbEstado)))
                            .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                                .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jbGuardar)
                                .addGap(38, 38, 38)
                                .addComponent(jbEliminar)
                                .addGap(33, 33, 33)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jpVistaMateriaLayout.setVerticalGroup(
            jpVistaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jlTituloMateria)
                .addGroup(jpVistaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                        .addGroup(jpVistaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(jpVistaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbBuscar)))
                            .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jlCodigo)))
                        .addGap(46, 46, 46)
                        .addGroup(jpVistaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlNombre)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jpVistaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlAnio)
                            .addComponent(jtfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jlEstado))
                    .addGroup(jpVistaMateriaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbEstado)))
                .addGap(63, 63, 63)
                .addGroup(jpVistaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardar)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpVistaMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpVistaMateria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
        // para que ingrese solo letras
                int key = evt.getKeyChar();
    boolean letrasMin = key >= 97 && key <=122  ;
    boolean letrasMay = key >= 65 && key <= 90;
    if(!(letrasMin || letrasMay)){
        evt.consume();
    }
    }//GEN-LAST:event_jtfNombreKeyTyped


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

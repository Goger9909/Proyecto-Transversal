
package proyecto.transversal.vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.transversal.accesoADatos.AlumnoData;
import proyecto.transversal.accesoADatos.InscripcionData;
import proyecto.transversal.accesoADatos.MateriaData;
import proyecto.transversal.entidades.Alumno;
import proyecto.transversal.entidades.Inscripcion;
import proyecto.transversal.entidades.Materia;

/**
 *
 * @author yamiilaalejandra
 */
public final class Inscripciones extends javax.swing.JInternalFrame {
  private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int filas, int columnas) {
            return false;
        }
    };

    public Inscripciones() {
        initComponents();
        CargarCombo();
        ArmarCabezera();
        this.setLocation(100,100);
        this.setSize(487, 455);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Nombre = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCBAlumno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        MateriasInscriptas = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        MateriasNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        AnularInscripcion = new javax.swing.JButton();
        Inscribir = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jToggleButton1.setText("jToggleButton1");

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 230, 22));

        jCBAlumno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBAlumnoItemStateChanged(evt);
            }
        });
        jPanel1.add(jCBAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 240, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione un alumno:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 200, 26));

        MateriasInscriptas.setText("Materias Inscriptas");
        MateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MateriasInscriptasActionPerformed(evt);
            }
        });
        jPanel1.add(MateriasInscriptas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 163, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText(" Listado de Materias");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 150, 28));

        MateriasNoInscriptas.setText("Materias no Inscriptas");
        MateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MateriasNoInscriptasActionPerformed(evt);
            }
        });
        jPanel1.add(MateriasNoInscriptas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, 30));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 450, 210));

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, -1, -1));

        AnularInscripcion.setText("Anular Inscripcion");
        AnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnularInscripcionActionPerformed(evt);
            }
        });
        jPanel1.add(AnularInscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        Inscribir.setText("Inscribir");
        Inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscribirActionPerformed(evt);
            }
        });
        jPanel1.add(Inscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MateriasNoInscriptasActionPerformed
         MateriasNoInscriptas.setSelected(true); 
         MateriasInscriptas.setSelected(false);
         AnularInscripcion.setEnabled(false);
         Inscribir.setEnabled(true);
        
         try{
        Alumno alumno = (Alumno) jCBAlumno.getSelectedItem();
        int idA = alumno.getIdAlumno();
        InscripcionData insc = new InscripcionData();
        BorrarFilas();
            for (Materia ins : insc.ObtenerMateriasNoCursadas(idA)) {
                modelo.addRow(new Object[]{ins.getIdMateria(), ins.getNombre(), ins.getAnioMateria()});
            }
         }catch (NullPointerException ex){
         JOptionPane.showMessageDialog(null, "Seleccione un alumno");
         BorrarFilas();
         }    
    }//GEN-LAST:event_MateriasNoInscriptasActionPerformed

    private void jCBAlumnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBAlumnoItemStateChanged
      try{
        Alumno alumno = (Alumno) jCBAlumno.getSelectedItem();
        int idA = alumno.getIdAlumno();
        InscripcionData insc = new InscripcionData();
        boolean activo  = MateriasNoInscriptas.isSelected();
        boolean activo1 = MateriasInscriptas.isSelected();
        if (activo == true) { 
            BorrarFilas();
            for (Materia ins : insc.ObtenerMateriasNoCursadas(idA)) {
                modelo.addRow(new Object[]{ins.getIdMateria(), ins.getNombre(), ins.getAnioMateria()});
            }
        } else if (activo1 == true) {
            BorrarFilas();
            for (Materia ins : insc.ObtenerMateriasCursadas(idA)) {
                modelo.addRow(new Object[]{ins.getIdMateria(), ins.getNombre(), ins.getAnioMateria()});
            }
        }
      }catch(NullPointerException ex){ 
          JOptionPane.showMessageDialog(null, "Seleccione un alumno");
          BorrarFilas();
        }
    }//GEN-LAST:event_jCBAlumnoItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void MateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MateriasInscriptasActionPerformed
       MateriasNoInscriptas.setSelected(false); 
       MateriasInscriptas.setSelected(true);
       Inscribir.setEnabled(false);
       AnularInscripcion.setEnabled(true);
       
       try{
        Alumno alumno = (Alumno) jCBAlumno.getSelectedItem();
        int idA = alumno.getIdAlumno();
        InscripcionData insc = new InscripcionData();
         BorrarFilas();
            for (Materia ins : insc.ObtenerMateriasCursadas(idA)) {
                modelo.addRow(new Object[]{ins.getIdMateria(), ins.getNombre(), ins.getAnioMateria()});   
            }
       }catch (NullPointerException ex){
         JOptionPane.showMessageDialog(null, "Seleccione un alumno");
         BorrarFilas();
         } 
    }//GEN-LAST:event_MateriasInscriptasActionPerformed

    private void InscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscribirActionPerformed
        try{
        MateriaData md = new MateriaData();
        Alumno alumno = (Alumno) jCBAlumno.getSelectedItem();
        //Para obtener los índices de fila.
        int filaSeleccionada  =  jTable.getSelectedRow();
        int id = (int) jTable.getValueAt(filaSeleccionada , 0);//accedemos al valor de la primera fila y la primera columna seleccionada.
        Materia materia = md.buscarMateria(id);
        Inscripcion insci = new Inscripcion(alumno, materia, 0); //le pasamos por parametro una nota 0; 
        InscripcionData insc = new InscripcionData();
        insc.GuardarInscripcion(insci);
         BorrarFilas();
         for (Materia ins : insc.ObtenerMateriasNoCursadas(alumno.getIdAlumno())) {
                modelo.addRow(new Object[]{ins.getIdMateria(), ins.getNombre(), ins.getAnioMateria()});
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Usted no ha seleccionado una materia");
        }
    }//GEN-LAST:event_InscribirActionPerformed

    private void AnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnularInscripcionActionPerformed
       try {
        Alumno alumno = (Alumno) jCBAlumno.getSelectedItem();
        int idA = alumno.getIdAlumno();
       //Para obtener los índices de fila.
        int  filaSeleccionada = jTable.getSelectedRow();
        int idM = (int) jTable.getValueAt(filaSeleccionada,0);
        InscripcionData insc = new InscripcionData();
        insc.BorrarInscripcionMateriaAlumno(idA, idM); //Eliminamos una Inscripcion 
        BorrarFilas();
            for (Materia ins : insc.ObtenerMateriasCursadas(idA)) {
                modelo.addRow(new Object[]{ins.getIdMateria(), ins.getNombre(), ins.getAnioMateria()});
            }
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Usted no ha seleccionado una materia");
       }
    }//GEN-LAST:event_AnularInscripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnularInscripcion;
    private javax.swing.JButton Inscribir;
    private javax.swing.JRadioButton MateriasInscriptas;
    private javax.swing.JRadioButton MateriasNoInscriptas;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<Alumno> jCBAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

 public void CargarCombo(){
  AlumnoData Ad = new AlumnoData();
  jCBAlumno.addItem(jCBAlumno.getItemAt(-1));
 for ( Alumno alumno : Ad.listaAlumnos()){
     jCBAlumno.addItem(alumno);
 }
}
 
 private void ArmarCabezera(){
     modelo.addColumn("ID");
     modelo.addColumn("Nombre");
     modelo.addColumn("Año");
     jTable.setModel(modelo);
 }
 
 private void BorrarFilas(){
        int filas = jTable.getRowCount()-1;
        for(int f = filas; f >= 0 ; f--){
            modelo.removeRow(f);
        }
        
    }
}

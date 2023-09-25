
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
        jLabel1 = new javax.swing.JLabel();
        jCBAlumno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MateriasNoInscriptas = new javax.swing.JRadioButton();
        MateriasInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        Inscribir = new javax.swing.JButton();
        AnularInscripcion = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 240, 22));

        jCBAlumno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBAlumnoItemStateChanged(evt);
            }
        });
        getContentPane().add(jCBAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 40, 230, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione un alumno:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 170, 26));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText(" Listado de Materias");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 150, 28));

        MateriasNoInscriptas.setText("Materias no Inscriptas");
        MateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MateriasNoInscriptasActionPerformed(evt);
            }
        });
        getContentPane().add(MateriasNoInscriptas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        MateriasInscriptas.setText("Materias Inscriptas");
        MateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MateriasInscriptasActionPerformed(evt);
            }
        });
        getContentPane().add(MateriasInscriptas, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 118, 163, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 152, 450, 200));

        Inscribir.setText("Inscribir");
        Inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscribirActionPerformed(evt);
            }
        });
        getContentPane().add(Inscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        AnularInscripcion.setText("Anular Inscripcion");
        AnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnularInscripcionActionPerformed(evt);
            }
        });
        getContentPane().add(AnularInscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MateriasNoInscriptasActionPerformed
         MateriasNoInscriptas.setSelected(true); 
         MateriasInscriptas.setSelected(false);
         AnularInscripcion.setEnabled(false);
         Inscribir.setEnabled(true);
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
      }catch(Exception ex){
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
    }//GEN-LAST:event_MateriasInscriptasActionPerformed

    private void InscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscribirActionPerformed
        try{
        MateriaData md = new MateriaData();
        Alumno alumno = (Alumno) jCBAlumno.getSelectedItem();
        //Para obtener los índices de fila.
        int selectedRows =  jTable.getSelectedRow();
        //int[] selectedColumns = jTable.getSelectedColumns();
//      if (selectedRows.length > 0 && selectedColumns.length > 0) {
//      int filaSeleccionada = selectedRows[0];
//      int columnaSeleccionada = selectedColumns[0];
//      if (filaSeleccionada < jTable.getRowCount() && columnaSeleccionada < jTable.getColumnCount()) {
        int id = (int) jTable.getValueAt(selectedRows, 0);//accedemos al valor de la primera fila y la primera columna seleccionada.
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
//        int[] selectedColumns = jTable.getSelectedColumns();
//        if (selectedRows.length > 0 && selectedColumns.length > 0) {
//        int filaSeleccionada = selectedRows[0];
//        int columnaSeleccionada = selectedColumns[0];
//        if (filaSeleccionada < jTable.getRowCount() && columnaSeleccionada < jTable.getColumnCount()) {
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
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

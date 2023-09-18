
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

        jLabel1.setText("Formulario de Inscripcion");

        jCBAlumno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBAlumnoItemStateChanged(evt);
            }
        });

        jLabel2.setText("Seleccione un alumno:");

        jLabel3.setText(" Listado de Materias");

        MateriasNoInscriptas.setText("Materias no Inscriptas");
        MateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MateriasNoInscriptasActionPerformed(evt);
            }
        });

        MateriasInscriptas.setText("Materias Inscriptas");
        MateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MateriasInscriptasActionPerformed(evt);
            }
        });

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

        Inscribir.setText("Inscribir");
        Inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscribirActionPerformed(evt);
            }
        });

        AnularInscripcion.setText("Anular Inscripcion");
        AnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnularInscripcionActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(MateriasInscriptas, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MateriasNoInscriptas)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(143, 143, 143))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Inscribir)
                        .addGap(46, 46, 46)
                        .addComponent(AnularInscripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCBAlumno)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MateriasNoInscriptas)
                    .addComponent(MateriasInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Inscribir)
                    .addComponent(AnularInscripcion)
                    .addComponent(jButton3))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MateriasNoInscriptasActionPerformed
         MateriasNoInscriptas.setSelected(true); 
         MateriasInscriptas.setSelected(false);
    }//GEN-LAST:event_MateriasNoInscriptasActionPerformed

    private void jCBAlumnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBAlumnoItemStateChanged
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
    }//GEN-LAST:event_jCBAlumnoItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void MateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MateriasInscriptasActionPerformed
       MateriasNoInscriptas.setSelected(false); 
       MateriasInscriptas.setSelected(true);
    }//GEN-LAST:event_MateriasInscriptasActionPerformed

    private void InscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscribirActionPerformed
        try{
        MateriaData md = new MateriaData();
        Alumno alumno = (Alumno) jCBAlumno.getSelectedItem();
        int id = 0;
        //Para obtener los índices de fila y columna seleccionada.
        int[] selectedRows = jTable.getSelectedRows();
        int[] selectedColumns = jTable.getSelectedColumns();

        if (selectedRows.length > 0 && selectedColumns.length > 0) {
            int filaSeleccionada = selectedRows[0];
            int columnaSeleccionada = selectedColumns[0];
        //verificamos que haya al menos una fila y una columna seleccionadas antes de intentar acceder a los valores de la tabla.
            if (filaSeleccionada < jTable.getRowCount() && columnaSeleccionada < jTable.getColumnCount()) {
                int valor = (int) jTable.getValueAt(filaSeleccionada, columnaSeleccionada);//accedemos al valor de la primera fila y la primera columna seleccionada.
                id = valor;//asignamos el valor a la variable.
            }
        }
        Materia materia = md.buscarMateria(id);
        Inscripcion ins = new Inscripcion(alumno, materia, 0); //le pasamos por parametro una nota 0; 
        InscripcionData insc = new InscripcionData();
        insc.GuardarInscripcion(ins);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error en los datos" + ex.getMessage());
        }
    }//GEN-LAST:event_InscribirActionPerformed

    private void AnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnularInscripcionActionPerformed
       try {
        Alumno alumno = (Alumno) jCBAlumno.getSelectedItem();
        int idA = alumno.getIdAlumno();
        int idM = 0;
       //Para obtener los índices de fila y columna seleccionada.
        int[] selectedRows = jTable.getSelectedRows();
        int[] selectedColumns = jTable.getSelectedColumns();

        if (selectedRows.length > 0 && selectedColumns.length > 0) {
            int filaSeleccionada = selectedRows[0];
            int columnaSeleccionada = selectedColumns[0];

            if (filaSeleccionada < jTable.getRowCount() && columnaSeleccionada < jTable.getColumnCount()) {
                int valor = (int) jTable.getValueAt(filaSeleccionada, columnaSeleccionada);
                idM = valor;
            }
        }
        InscripcionData insc = new InscripcionData();
        insc.BorrarInscripcionMateriaAlumno(idA, idM); //Eliminamos una Inscripcion 
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Error en los datos" + ex.getMessage());
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

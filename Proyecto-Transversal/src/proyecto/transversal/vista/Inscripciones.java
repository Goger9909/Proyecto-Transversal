
package proyecto.transversal.vista;

import javax.swing.table.DefaultTableModel;
import proyecto.transversal.accesoADatos.AlumnoData;
import proyecto.transversal.accesoADatos.InscripcionData;
import proyecto.transversal.accesoADatos.MateriaData;
import proyecto.transversal.entidades.Alumno;
import proyecto.transversal.entidades.Materia;

/**
 *
 * @author 
 */
public class Inscripciones extends javax.swing.JInternalFrame {
private DefaultTableModel modelo = new DefaultTableModel(); 
   
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
        jLabel1 = new javax.swing.JLabel();
        jCBAlumno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MateriasNoInscriptas = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel1.setText("Formulario de Inscripcion");

        jCBAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAlumnoActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione un alumno:");

        jLabel3.setText(" Listado de Materias");

        MateriasNoInscriptas.setText("Materias no Inscriptas");
        MateriasNoInscriptas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MateriasNoInscriptasMouseClicked(evt);
            }
        });
        MateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MateriasNoInscriptasActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Materias Inscriptas");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Inscribir");

        jButton2.setText("Anular Inscripcion");

        jButton3.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jButton1)
                        .addGap(46, 46, 46)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MateriasNoInscriptas)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBAlumnoActionPerformed

    private void MateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MateriasNoInscriptasActionPerformed
       
      
       
    }//GEN-LAST:event_MateriasNoInscriptasActionPerformed

    private void MateriasNoInscriptasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MateriasNoInscriptasMouseClicked
        // TODO add your handling code here:
        int alu = jCBAlumno.getSelectedIndex();
        InscripcionData insc= new InscripcionData();
        for (Materia ins : insc.ObtenerMateriasNoCursadas(alu)){
           modelo.addRow(new Object[]{ins.getIdMateria(),ins.getNombre(),ins.getAnioMateria()});
        }
      
    }//GEN-LAST:event_MateriasNoInscriptasMouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        // TODO add your handling code here:
        int alu = jCBAlumno.getSelectedIndex();
        InscripcionData insc = new InscripcionData();
        for (Materia ins : insc.ObtenerMateriasCursadas(alu)){
           modelo.addRow(new Object[]{ins.getIdMateria(),ins.getNombre(),ins.getAnioMateria()});
        }
      
    }//GEN-LAST:event_jRadioButton2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton MateriasNoInscriptas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCBAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

public void CargarCombo(){
  AlumnoData da = new AlumnoData();
 for ( Alumno alu : da.listaAlumnos()){
     jCBAlumno.addItem("id "+alu.getIdAlumno()+" "+alu.getApellido()+" "+alu.getNombre()+" Dni:"+alu.getDni());
 
 }
}
 
 private void ArmarCabezera(){
     modelo.addColumn("ID");
     modelo.addColumn("Nombre");
     modelo.addColumn("Año");
     jTable1.setModel(modelo);
 }
 
 private void BorrarFilas(){
        
        int filas = jTable1.getRowCount()-1;
        for(int f = filas; f >= 0 ; f--){
            
            modelo.removeRow(f);
        }
        
    }
}
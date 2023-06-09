/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import javax.swing.table.DefaultTableModel;
import java.awt.HeadlessException;
import Persistencia.cConnection;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Xeride
 */
public class frmFiltroContactos extends javax.swing.JFrame {

    /**
     * Creates new form frmFiltroContactos
     */
    public frmFiltroContactos() {
        initComponents();
        setLocationRelativeTo(null); //Para que aparezca en centro de la pantalla
        MostrarDatos(); //llama la funcion MostrarDatos
        MostrarRegistroTabla(); //llama la funcion MostrarRegistroTabla
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblFiltro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnVarones = new javax.swing.JButton();
        btnMujeres = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        tbnRegresar = new javax.swing.JButton();
        btnMostrarTodo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblFiltro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jScrollPane1.setViewportView(tblFiltro);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Filtrar Contactos");

        btnVarones.setText("Masculino");
        btnVarones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaronesActionPerformed(evt);
            }
        });

        btnMujeres.setText("Femenino");
        btnMujeres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMujeresActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione el género que desea filtrar");

        btnLimpiar.setText("Limpiar tabla");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tbnRegresar.setText("Regresar");
        tbnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnRegresarActionPerformed(evt);
            }
        });

        btnMostrarTodo.setText("Mostrar todos los datos");
        btnMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(btnVarones)
                .addGap(192, 192, 192)
                .addComponent(btnMujeres)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMostrarTodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbnRegresar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(246, 246, 246)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMujeres, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVarones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(tbnRegresar)
                    .addComponent(btnMostrarTodo))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVaronesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaronesActionPerformed
        Limpiesa();//limpia la tabla antes de ejecutar el resto de codigo
        try{
            Connection conex = null; //llama la conexion
            DefaultTableModel dTabla = (DefaultTableModel)tblFiltro.getModel();
            cConnection conectando = new cConnection(); //llama la clase cConnection
            conex = conectando.getConnection();//retorna conexion
            String Registro[] = new String[10]; //aca el numero lo modificas segun la cantidad de columnas
            String SQL = "Select * from datos where Genero = 'M'"; //sentencia sql para llamar los registros
            Statement sentencia = conex.createStatement(); //crea la sentencia sql
            ResultSet rst = sentencia.executeQuery(SQL); //ejecuta la consulta de la sentencia sql
            while(rst.next()){
                Registro[0] = rst.getString("DNI"); //el numero y el nombre que esta en tu BD, en este caso access, se comienza desde cero
                Registro[1] = rst.getString("Nombre"); 
                Registro[2] = rst.getString("ApellidoPaterno");
                Registro[3] = rst.getString("ApellidoMaterno");
                Registro[4] = rst.getString("Genero"); 
                Registro[5] = rst.getString("Telefono");
                Registro[6] = rst.getString("Correo");
                Registro[7] = rst.getString("FechaNacimiento");
                Registro[8] = rst.getString("Direccion");
                dTabla.addRow(Registro); //Agrega a cada columna
            }
            tblFiltro.setModel(dTabla); //para llamar nuestra tabla
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha producido un error al cargar los datos - " + e);//mensaje de error y el problema a resolver
        }
    }//GEN-LAST:event_btnVaronesActionPerformed

    private void btnMujeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMujeresActionPerformed
        Limpiesa();//limpia la tabla antes de ejecutar el resto de codigo
        try{
            Connection conex = null; //llama la conexion
            DefaultTableModel dTabla = (DefaultTableModel)tblFiltro.getModel();
            cConnection conectando = new cConnection(); //llama la clase cConnection
            conex = conectando.getConnection();//retorna conexion
            String Registro[] = new String[10]; //aca el numero lo modificas segun la cantidad de columnas
            String SQL = "Select * from datos where Genero = 'F'"; //sentencia sql para llamar los registros
            Statement sentencia = conex.createStatement(); //crea la sentencia sql
            ResultSet rst = sentencia.executeQuery(SQL); //ejecuta la consulta de la sentencia sql
            while(rst.next()){
                Registro[0] = rst.getString("DNI"); //el numero y el nombre que esta en tu BD, en este caso access, se comienza desde cero
                Registro[1] = rst.getString("Nombre"); 
                Registro[2] = rst.getString("ApellidoPaterno");
                Registro[3] = rst.getString("ApellidoMaterno");
                Registro[4] = rst.getString("Genero"); 
                Registro[5] = rst.getString("Telefono");
                Registro[6] = rst.getString("Correo");
                Registro[7] = rst.getString("FechaNacimiento");
                Registro[8] = rst.getString("Direccion");
                dTabla.addRow(Registro); //Agrega a cada columna
            }
            tblFiltro.setModel(dTabla); //para llamar nuestra tabla
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha producido un error al cargar los datos - " + e);//mensaje de error y el problema a resolver
        }
    }//GEN-LAST:event_btnMujeresActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiesa();//limpia la tabla
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tbnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnRegresarActionPerformed
        this.setVisible(false);//cierra esta ventana
        new frmMenuPrincipal().setVisible(true);//abre la ventana del menú principal
    }//GEN-LAST:event_tbnRegresarActionPerformed

    private void btnMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodoActionPerformed
        Limpiesa();//limpia la tabla antes de ejecutarse el codigo de Mostrar()
        Mostrar();//muestra todos los datos en la tabla
    }//GEN-LAST:event_btnMostrarTodoActionPerformed
    public void MostrarDatos(){ //Para que no edites los nombre de cada columna de la tabla, si no tienes pereza, editalo tu mismo
        DefaultTableModel MiTabla = (DefaultTableModel)tblFiltro.getModel();
        String EncabezadoTabla[]={"DNI","Nombre","Apellido Paterno","Apellido Materno","Género","Telefono","Correo","Fecha de nacimiento","Dirección"}; //para cambiar los nombres de la tabla que estan por defecto
        MiTabla = new DefaultTableModel(null,EncabezadoTabla);
        tblFiltro.setModel(MiTabla);
    }
    
    public void MostrarRegistroTabla(){ //Para que muestre los registros
        Mostrar();//muestra todos los datos en la tabla
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmFiltroContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFiltroContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFiltroContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFiltroContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFiltroContactos().setVisible(true);
            }
        });
    }
    private void Limpiesa(){//se encarga de borrar los datos que aparecen en la tabla pero no los datos guardados
        DefaultTableModel temp = (DefaultTableModel) tblFiltro.getModel();
        int filas = tblFiltro.getRowCount();

        for (int a = 0; filas > a; a++) {
            temp.removeRow(0);//borra los datos que esten en cada fila de la tabla pero no de la base de datos
        }
    }
    
    private void Mostrar(){
        try{
            Connection conex = null; //llama la conexion
            DefaultTableModel dTabla = (DefaultTableModel)tblFiltro.getModel();
            cConnection conectando = new cConnection(); //llama la clase cConnection
            conex = conectando.getConnection();//retorna conexion
            String Registro[] = new String[10]; //aca el numero lo modificas segun la cantidad de columnas
            String SQL = "Select * from datos"; //sentencia sql para llamar los registros
            Statement sentencia = conex.createStatement(); //crea la sentencia sql
            ResultSet rst = sentencia.executeQuery(SQL); //ejecuta la consulta de la sentencia sql
            while(rst.next()){
                Registro[0] = rst.getString("DNI"); //el numero y el nombre que esta en tu BD, en este caso access, se comienza desde cero
                Registro[1] = rst.getString("Nombre"); 
                Registro[2] = rst.getString("ApellidoPaterno");
                Registro[3] = rst.getString("ApellidoMaterno");
                Registro[4] = rst.getString("Genero"); 
                Registro[5] = rst.getString("Telefono");
                Registro[6] = rst.getString("Correo");
                Registro[7] = rst.getString("FechaNacimiento");
                Registro[8] = rst.getString("Direccion");
                dTabla.addRow(Registro); //Agrega a cada columna
            }
            tblFiltro.setModel(dTabla); //para llamar nuestra tabla
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha producido un error al cargar los datos - " + e);//mensaje de error y el problema a resolver
        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrarTodo;
    private javax.swing.JButton btnMujeres;
    private javax.swing.JButton btnVarones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFiltro;
    private javax.swing.JButton tbnRegresar;
    // End of variables declaration//GEN-END:variables
}

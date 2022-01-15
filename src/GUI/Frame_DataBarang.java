/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Frame_DataBarang extends javax.swing.JFrame {

    /**
     * Creates new form Frame_DataBarang
     */
    display dis = new display();
    public Frame_DataBarang() {
        initComponents();
        this.setLocationRelativeTo(null);
        dis.Display_dataBarang(tab_dataBarang1);
        tab_dataBarang1.getTableHeader().setOpaque(false);
        tab_dataBarang1.getTableHeader().setBackground(new Color(110, 217, 161));
        inp_id.setEnabled(false);
        inp_namaBarang.setEnabled(false);
        inp_kategori.setEnabled(false);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tab_dataBarang1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        inp_id = new javax.swing.JTextField();
        inp_namaBarang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inp_kategori = new javax.swing.JTextField();
        inp_hargaJual = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inp_hargaBeli = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(41, 54, 53));

        tab_dataBarang1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nama_Produk", "kategori", "harga_Jual","harga_beli"
            }
        )
        {
            public boolean isCellEditable(int row,int column){
                return false;
            }
        }
    );
    tab_dataBarang1.setFocusable(false);
    tab_dataBarang1.setShowHorizontalLines(false);
    tab_dataBarang1.setShowVerticalLines(false);
    tab_dataBarang1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tab_dataBarang1MouseClicked(evt);
        }
    });
    jScrollPane3.setViewportView(tab_dataBarang1);

    jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(255, 255, 255));
    jLabel8.setText("Daftar Produk");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(34, 34, 34)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel8)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(37, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(32, 32, 32)
            .addComponent(jLabel8)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(35, Short.MAX_VALUE))
    );

    jPanel3.setBackground(new java.awt.Color(59, 166, 110));
    jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
    jLabel3.setText("ID Barang");
    jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

    inp_id.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            inp_idActionPerformed(evt);
        }
    });
    jPanel3.add(inp_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 131, -1));
    jPanel3.add(inp_namaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 131, -1));

    jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
    jLabel4.setText("Nama Barang");
    jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 90, -1));

    jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
    jLabel5.setText("Kategori");
    jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 60, -1));
    jPanel3.add(inp_kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 131, -1));
    jPanel3.add(inp_hargaJual, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 131, -1));

    jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
    jLabel6.setText("Harga Jual");
    jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

    jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
    jLabel7.setText("Harga Beli");
    jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
    jPanel3.add(inp_hargaBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 131, -1));

    Update.setText("Update");
    Update.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            UpdateActionPerformed(evt);
        }
    });
    jPanel3.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 90, -1));

    delete.setText("Delete");
    delete.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            deleteActionPerformed(evt);
        }
    });
    jPanel3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 90, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        dis.update_Barang(inp_id.getText(), inp_hargaJual.getText(), inp_hargaBeli.getText());
//        dis.Display_dataBarang(tab_dataBarang1);
    }//GEN-LAST:event_UpdateActionPerformed

    private void tab_dataBarang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_dataBarang1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) tab_dataBarang1.getModel();
        
        String tbl_ID = (String) tblModel.getValueAt(tab_dataBarang1.getSelectedRow(),0);
        String tbl_namaProduk = (String) tblModel.getValueAt(tab_dataBarang1.getSelectedRow(),1);
        String tbl_kategori = (String) tblModel.getValueAt(tab_dataBarang1.getSelectedRow(),2);
        String tbl_hargaJual = (String) tblModel.getValueAt(tab_dataBarang1.getSelectedRow(),3);
        String tbl_hargaBeli = (String) tblModel.getValueAt(tab_dataBarang1.getSelectedRow(),4);
        inp_id.setText(tbl_ID);
        inp_namaBarang.setText(tbl_namaProduk);
        inp_kategori.setText(tbl_kategori);   
        inp_hargaJual.setText(tbl_hargaJual);
        inp_hargaBeli.setText(tbl_hargaBeli);
    }//GEN-LAST:event_tab_dataBarang1MouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        dis.delete_Barang(inp_id.getText());
//        dis.Display_detailBelanja(tab_dataBarang1);
        inp_id.setText("");
        inp_namaBarang.setText("");
        inp_kategori.setText("");
        inp_hargaJual.setText("");
    }//GEN-LAST:event_deleteActionPerformed

    private void inp_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inp_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inp_idActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_DataBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JButton delete;
    private javax.swing.JTextField inp_hargaBeli;
    private javax.swing.JTextField inp_hargaJual;
    private javax.swing.JTextField inp_id;
    private javax.swing.JTextField inp_kategori;
    private javax.swing.JTextField inp_namaBarang;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tab_dataBarang1;
    // End of variables declaration//GEN-END:variables
}

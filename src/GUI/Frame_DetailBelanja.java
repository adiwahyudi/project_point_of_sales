/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Frame_DetailBelanja extends javax.swing.JFrame {

    /**
     * Creates new form Frame_DetailBelanja
     */
    
    display dis = new display();
    public Frame_DetailBelanja() {
        initComponents();
        this.setLocationRelativeTo(null);
        inp_id.setEnabled(false);
        inp_namaBarang.setEnabled(false);
        inp_kategori.setEnabled(false);
        inp_hargaJual.setEnabled(false);
        dis.Display_dataBarang(tab_dataBarang);
        dis.Display_detailBelanja(tab_detailBelanja);
        Tsum.setText(Integer.toString(getSumHarga()));
        Tsum.setEnabled(false);
    }
    
    public int getSumHarga(){
        int rowsCount = tab_detailBelanja.getRowCount();
        int sum = 0;
        for(int i = 0; i <rowsCount ; i++){
            sum = sum + Integer.parseInt(tab_detailBelanja.getValueAt(i, 5).toString());
        }
        return sum;
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
        tab_dataBarang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        add_keranjang = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_detailBelanja = new javax.swing.JTable();
        inp_id = new javax.swing.JTextField();
        inp_namaBarang = new javax.swing.JTextField();
        inp_hargaJual = new javax.swing.JTextField();
        inp_kategori = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inp_jumlah = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Tsum = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tab_dataBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nama_Produk", "kategori", "harga_Jual"
            }
        ));
        tab_dataBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_dataBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab_dataBarang);

        jLabel1.setText("Daftar Produk");

        jLabel2.setText("Keranjang");

        add_keranjang.setText("Tambah ke keranjang");
        add_keranjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_keranjangActionPerformed(evt);
            }
        });

        tab_detailBelanja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nama_Produk", "kategori", "harga_Jual", "Jumlah", "Harga"
            }
        ));
        tab_detailBelanja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_detailBelanjaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tab_detailBelanja);

        jLabel3.setText("ID Barang");

        jLabel4.setText("Nama Barang");

        jLabel5.setText("Kategori");

        jLabel6.setText("Harga Jual");

        jLabel7.setText("Jumlah Barang");

        jLabel8.setText("Total Harga");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inp_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inp_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(17, 17, 17)
                                .addComponent(inp_hargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(inp_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(add_keranjang))
                        .addContainerGap(79, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jLabel1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Tsum, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(242, 242, 242))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inp_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inp_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(inp_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(inp_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inp_hargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(add_keranjang))))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tsum, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_keranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_keranjangActionPerformed
        // TODO add your handling code here:
        if(add_keranjang.getText() == "Tambah ke keranjang"){
            dis.add_Keranjang(inp_id.getText(), inp_namaBarang.getText(), inp_kategori.getText(),inp_hargaJual.getText(),inp_jumlah.getText());
            dis.Display_detailBelanja(tab_detailBelanja);
            Tsum.setText(Integer.toString(getSumHarga()));
        }else if (add_keranjang.getText() == "Update keranjang"){
            dis.update_Keranjang(inp_id.getText(),inp_hargaJual.getText(),inp_jumlah.getText());
            dis.Display_detailBelanja(tab_detailBelanja);
            Tsum.setText(Integer.toString(getSumHarga()));
        }
        
    }//GEN-LAST:event_add_keranjangActionPerformed

    private void tab_dataBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_dataBarangMouseClicked
        // TODO add your handling code here:
        add_keranjang.setText("Tambah ke keranjang");
        DefaultTableModel tblModel = (DefaultTableModel) tab_dataBarang.getModel();
        
        String tbl_ID = (String) tblModel.getValueAt(tab_dataBarang.getSelectedRow(),0);
        String tbl_namaProduk = (String) tblModel.getValueAt(tab_dataBarang.getSelectedRow(),1);
        String tbl_kategori = (String) tblModel.getValueAt(tab_dataBarang.getSelectedRow(),2);
        String tbl_hargaJual = (String) tblModel.getValueAt(tab_dataBarang.getSelectedRow(),3);
        
        inp_id.setText(tbl_ID);
        inp_namaBarang.setText(tbl_namaProduk);
        inp_kategori.setText(tbl_kategori);   
        inp_hargaJual.setText(tbl_hargaJual);
        inp_jumlah.setText("");
    }//GEN-LAST:event_tab_dataBarangMouseClicked

    private void tab_detailBelanjaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_detailBelanjaMouseClicked
        // TODO add your handling code here:
        add_keranjang.setText("Update keranjang");
        DefaultTableModel tblModel = (DefaultTableModel) tab_detailBelanja.getModel();
        
        String tbl_ID = (String) tblModel.getValueAt(tab_detailBelanja.getSelectedRow(),0);
        String tbl_namaProduk = (String) tblModel.getValueAt(tab_detailBelanja.getSelectedRow(),1);
        String tbl_kategori = (String) tblModel.getValueAt(tab_detailBelanja.getSelectedRow(),2);
        String tbl_hargaJual = (String) tblModel.getValueAt(tab_detailBelanja.getSelectedRow(),3);
        String tbl_total = (String) tblModel.getValueAt(tab_detailBelanja.getSelectedRow(),4);
        
        inp_id.setText(tbl_ID);
        inp_namaBarang.setText(tbl_namaProduk);
        inp_kategori.setText(tbl_kategori);   
        inp_hargaJual.setText(tbl_hargaJual);
        inp_jumlah.setText(tbl_total);
    }//GEN-LAST:event_tab_detailBelanjaMouseClicked

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
            java.util.logging.Logger.getLogger(Frame_DetailBelanja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_DetailBelanja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_DetailBelanja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_DetailBelanja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_DetailBelanja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Tsum;
    private javax.swing.JButton add_keranjang;
    private javax.swing.JTextField inp_hargaJual;
    private javax.swing.JTextField inp_id;
    private javax.swing.JTextField inp_jumlah;
    private javax.swing.JTextField inp_kategori;
    private javax.swing.JTextField inp_namaBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tab_dataBarang;
    private javax.swing.JTable tab_detailBelanja;
    // End of variables declaration//GEN-END:variables
}

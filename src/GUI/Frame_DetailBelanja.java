/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
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
        delete_keranjang.setVisible(false);
        inp_id.setEnabled(false);
        inp_namaBarang.setEnabled(false);
        inp_kategori.setEnabled(false);
        inp_hargaJual.setEnabled(false);
        dis.Display_dataBarang(tab_dataBarang);
        tab_dataBarang.getTableHeader().setOpaque(false);
        tab_dataBarang.getTableHeader().setBackground(new Color(110, 217, 161));
        dis.Display_detailBelanja(tab_detailBelanja);
        tab_detailBelanja.getTableHeader().setOpaque(false);
        tab_detailBelanja.getTableHeader().setBackground(new Color(110, 217, 161));
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_dataBarang = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_detailBelanja = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Tsum = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        delete_keranjang = new javax.swing.JButton();
        add_keranjang = new javax.swing.JButton();
        inp_jumlah = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inp_kategori = new javax.swing.JTextField();
        inp_hargaJual = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inp_namaBarang = new javax.swing.JTextField();
        inp_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(41, 54, 53));

        tab_dataBarang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tab_dataBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nama_Produk", "kategori", "harga_Jual"
            }
        )
        {
            public boolean isCellEditable(int row,int column){
                return false;
            }
        }
    );
    tab_dataBarang.setFocusable(false);
    tab_dataBarang.setGridColor(new java.awt.Color(255, 255, 255));
    tab_dataBarang.setIntercellSpacing(new java.awt.Dimension(0, 0));
    tab_dataBarang.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tab_dataBarangMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tab_dataBarang);

    tab_detailBelanja.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "id", "nama_Produk", "kategori", "harga_Jual", "Jumlah", "Harga"
        }
    )
    {
        public boolean isCellEditable(int row,int column){
            return false;
        }
    }
    );
    tab_detailBelanja.setFocusable(false);
    tab_detailBelanja.setGridColor(new java.awt.Color(255, 255, 255));
    tab_detailBelanja.setIntercellSpacing(new java.awt.Dimension(0, 0));
    tab_detailBelanja.setShowVerticalLines(false);
    tab_detailBelanja.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tab_detailBelanjaMouseClicked(evt);
        }
    });
    jScrollPane2.setViewportView(tab_detailBelanja);

    jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("Keranjang");

    jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Daftar Produk");

    jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(255, 255, 255));
    jLabel8.setText("Total Harga");

    jPanel2.setBackground(new java.awt.Color(59, 166, 110));

    delete_keranjang.setText("Hapus Barang");
    delete_keranjang.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            delete_keranjangActionPerformed(evt);
        }
    });

    add_keranjang.setText("Tambah ke keranjang");
    add_keranjang.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            add_keranjangActionPerformed(evt);
        }
    });

    jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
    jLabel7.setText("Jumlah Barang");

    jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
    jLabel5.setText("Kategori");

    jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
    jLabel6.setText("Harga Jual");

    jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
    jLabel3.setText("ID Barang");

    jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
    jLabel4.setText("Nama Barang");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(39, 39, 39)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(905, 905, 905)
                    .addComponent(delete_keranjang))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(inp_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inp_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(17, 17, 17)
                            .addComponent(inp_hargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(42, 42, 42)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(inp_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(add_keranjang))))
            .addGap(42, 42, 42))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addContainerGap(35, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inp_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(inp_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inp_hargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addComponent(add_keranjang)))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inp_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(13, 13, 13)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inp_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(delete_keranjang)
            .addGap(20, 20, 20))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(37, 37, 37)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tsum, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel2))
            .addGap(44, 44, 44))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(jLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(11, 11, 11)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Tsum, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(39, Short.MAX_VALUE))
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
        delete_keranjang.setVisible(false);
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
        System.out.print(tab_detailBelanja.isEditing());
        add_keranjang.setText("Update keranjang");
        delete_keranjang.setVisible(true);
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

    private void delete_keranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_keranjangActionPerformed
        // TODO add your handling code here:
        dis.delete_Keranjang(inp_id.getText());
        dis.Display_detailBelanja(tab_detailBelanja);
        Tsum.setText(Integer.toString(getSumHarga()));
    }//GEN-LAST:event_delete_keranjangActionPerformed

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
    private javax.swing.JButton delete_keranjang;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tab_dataBarang;
    private javax.swing.JTable tab_detailBelanja;
    // End of variables declaration//GEN-END:variables
}

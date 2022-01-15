/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.HeadlessException;
import project_point_of_sales.Cashier;
/**
 *
 * @author User
 */
public class Frame_Cashier_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Frame_Cashier_Menu
     */
    private Cashier cashier_info;

    public Frame_Cashier_Menu() {
        initComponents();
    }
    
    public Frame_Cashier_Menu(Cashier cashier_info) {
        this.cashier_info = cashier_info;
        initComponents();
        cashier_nama.setText(cashier_info.getNama());
        cashier_kode.setText(cashier_info.getKode());
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        button_trans = new javax.swing.JButton();
        button_add_member1 = new javax.swing.JButton();
        button_input_barang = new javax.swing.JButton();
        button_trans1 = new javax.swing.JButton();
        button_list_member = new javax.swing.JButton();
        cashier_nama = new javax.swing.JLabel();
        lavel_nama = new javax.swing.JLabel();
        label_kode = new javax.swing.JLabel();
        cashier_kode = new javax.swing.JLabel();
        button_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU");

        button_trans.setText("Transaksi");
        button_trans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_transActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(41, 54, 53));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        button_trans.setBackground(new java.awt.Color(255, 255, 255));
        button_trans.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        button_trans.setForeground(new java.awt.Color(51, 51, 51));
        button_trans.setText("Transaksi");
        button_trans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_transActionPerformed(evt);
            }
        });

        button_add_member1.setBackground(new java.awt.Color(255, 255, 255));
        button_add_member1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        button_add_member1.setForeground(new java.awt.Color(51, 51, 51));
        button_add_member1.setText("Add Member");
        button_add_member1.setToolTipText("");
        button_add_member1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_add_member1ActionPerformed(evt);
            }
        });

        button_input_barang.setBackground(new java.awt.Color(255, 255, 255));
        button_input_barang.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        button_input_barang.setForeground(new java.awt.Color(51, 51, 51));
        button_input_barang.setText("Input Barang");
        button_input_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_input_barangActionPerformed(evt);
            }
        });

        button_trans1.setBackground(new java.awt.Color(255, 255, 255));
        button_trans1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        button_trans1.setForeground(new java.awt.Color(51, 51, 51));
        button_trans1.setText("History Transaksi");
        button_trans1.setToolTipText("");

        button_list_member.setBackground(new java.awt.Color(255, 255, 255));
        button_list_member.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        button_list_member.setForeground(new java.awt.Color(51, 51, 51));
        button_list_member.setText("List Member");
        button_list_member.setToolTipText("");
        button_list_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_list_memberActionPerformed(evt);
            }
        });

        cashier_nama.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        cashier_nama.setForeground(new java.awt.Color(255, 255, 255));

        lavel_nama.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lavel_nama.setForeground(new java.awt.Color(255, 255, 255));
        lavel_nama.setText("Nama");

        label_kode.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        label_kode.setForeground(new java.awt.Color(255, 255, 255));
        label_kode.setText("Kode");

        cashier_kode.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        cashier_kode.setForeground(new java.awt.Color(255, 255, 255));

        button_logout.setBackground(new java.awt.Color(255, 102, 102));
        button_logout.setText("LOGOUT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(button_add_member1)
                        .addGap(44, 44, 44)
                        .addComponent(button_trans, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(button_input_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(button_logout)))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(label_kode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lavel_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cashier_kode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cashier_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(button_list_member, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(button_trans1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_trans, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_input_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_add_member1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_list_member, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_trans1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cashier_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lavel_nama))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_kode)
                    .addComponent(cashier_kode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(button_logout)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_add_member1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_add_member1ActionPerformed
        // TODO add your handling code here:
        Frame_Create_Customer buat_cust = new Frame_Create_Customer();
        buat_cust.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_add_member1ActionPerformed


    private void button_transActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_transActionPerformed
        // TODO add your handling code here:
        new Frame_Transaksi(cashier_info).setVisible(true);
        this.dispose();
        

    }//GEN-LAST:event_button_transActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_Cashier_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Cashier_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Cashier_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Cashier_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Cashier_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_add_member1;
    private javax.swing.JButton button_input_barang;
    private javax.swing.JButton button_list_member;
    private javax.swing.JButton button_logout;
    private javax.swing.JButton button_trans;
    private javax.swing.JButton button_trans1;
    private javax.swing.JLabel cashier_kode;
    private javax.swing.JLabel cashier_nama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_kode;
    private javax.swing.JLabel lavel_nama;
    // End of variables declaration//GEN-END:variables
}

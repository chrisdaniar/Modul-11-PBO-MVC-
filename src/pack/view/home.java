/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
import java.util.List; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JButton; 
import javax.swing.JComboBox; 
import javax.swing.JOptionPane; 
import javax.swing.JTable; 
import javax.swing.JTextField; 
import javax.swing.table.DefaultTableModel; 
import pack.control.c_koneksi; 
import pack.control.controllerToko; 
import pack.model.m_toko; 
/**
 *
 * @author Chrisdaniar
 */
public class home extends javax.swing.JFrame {
controllerToko ctoko;
List<m_toko>listdata = new ArrayList<>();
String user;
    /**
     * Creates new form home
     */
    public home(String u) {
        initComponents();
        ctoko = new controllerToko (this);
        ctoko.isiTable();
        user = u;
        tfNama.setText(u);
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
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfKodeBarang = new javax.swing.JTextField();
        tfNamaBarang = new javax.swing.JTextField();
        tfHarga = new javax.swing.JTextField();
        cbKatBar = new javax.swing.JComboBox<>();
        cbPack = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnKeluar = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnBersih = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbKatMakan = new javax.swing.JComboBox<>();
        btnCari = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabel1 = new javax.swing.JTable();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 100, 100);

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Admin Toko : ");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(380, 20, 100, 15);

        tfNama.setEditable(false);
        jPanel3.add(tfNama);
        tfNama.setBounds(490, 20, 120, 20);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 630, 60);

        jPanel4.setBackground(new java.awt.Color(102, 255, 204));
        jPanel4.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(102, 255, 204));
        jPanel5.setLayout(null);
        jPanel4.add(jPanel5);
        jPanel5.setBounds(430, 0, 190, 140);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Kode Barang");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(20, 20, 80, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Nama Barang");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(20, 60, 120, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Kategori Barang");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(20, 100, 100, 14);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Jenis Packaging");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(20, 140, 100, 14);
        jPanel4.add(tfKodeBarang);
        tfKodeBarang.setBounds(120, 10, 310, 30);
        jPanel4.add(tfNamaBarang);
        tfNamaBarang.setBounds(120, 50, 310, 30);

        tfHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHargaActionPerformed(evt);
            }
        });
        jPanel4.add(tfHarga);
        tfHarga.setBounds(120, 170, 310, 30);

        cbKatBar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan" }));
        jPanel4.add(cbKatBar);
        cbKatBar.setBounds(120, 90, 310, 30);

        cbPack.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pack" }));
        jPanel4.add(cbPack);
        cbPack.setBounds(120, 130, 310, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Harga");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(20, 180, 100, 17);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 60, 460, 220);

        jPanel6.setBackground(new java.awt.Color(102, 255, 204));
        jPanel6.setLayout(null);

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        jPanel6.add(btnKeluar);
        btnKeluar.setBounds(20, 180, 110, 23);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel6.add(btnSimpan);
        btnSimpan.setBounds(20, 20, 110, 23);

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        jPanel6.add(btnUbah);
        btnUbah.setBounds(20, 60, 110, 23);

        btnBersih.setText("Bersihkan");
        btnBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihActionPerformed(evt);
            }
        });
        jPanel6.add(btnBersih);
        btnBersih.setBounds(20, 100, 110, 23);

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel6.add(btnHapus);
        btnHapus.setBounds(20, 140, 110, 23);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(470, 60, 150, 220);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Pencarian Berdasarkan Kategori Makanan");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 290, 290, 14);

        cbKatMakan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan" }));
        jPanel1.add(cbKatMakan);
        cbKatMakan.setBounds(300, 290, 130, 20);

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        jPanel1.add(btnCari);
        btnCari.setBounds(440, 290, 110, 23);

        Tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "KodeBarang", "NamaBarang", "Kategori", "Packaging", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabel1);
        if (Tabel1.getColumnModel().getColumnCount() > 0) {
            Tabel1.getColumnModel().getColumn(0).setResizable(false);
            Tabel1.getColumnModel().getColumn(1).setResizable(false);
            Tabel1.getColumnModel().getColumn(2).setResizable(false);
            Tabel1.getColumnModel().getColumn(3).setResizable(false);
            Tabel1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 320, 480, 170);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 630, 500);

        setBounds(0, 0, 643, 542);
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getTxtKode(){         
        return tfKodeBarang;     
    }     
    public JTextField getTxtNama(){         
        return tfNama;     
    }     
    public JTextField getTxtHarga(){         
        return tfHarga;     
    }     
    public JComboBox getCbKategori(){         
        return cbKatBar;     
    }     public JComboBox getCbJenis(){         
        return cbPack;     
    }     
    public JComboBox getCbCariKategori(){         
        return cbKatMakan;     
    }     
    public JButton getButtonHapus(){         
        return btnHapus;     
    }          
    public JButton getButtonBersih(){         
        return btnBersih;     
    }     
    public JButton getButtonSimpan(){         
        return btnSimpan;     
    }     
    public JButton getButtonUbah(){         
        return btnUbah;     
    }     
    public JButton getButtonKeluar(){         
        return btnKeluar;     
    }     
    public JTable getTableData(){         
        return Tabel1;     
    }
    
    private void tfHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHargaActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        ctoko.SimpanData();
        ctoko.isiTable();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        ctoko.Ubah();
        ctoko.isiTable();
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihActionPerformed
        ctoko.Reset();
// TODO add your handling code here:
    }//GEN-LAST:event_btnBersihActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
    ctoko.Hapus();
    ctoko.isiTable();
// TODO add your handling code here:
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
      dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
    ctoko.CariKategori();
    ctoko.isiTable();
// TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel1;
    private javax.swing.JButton btnBersih;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cbKatBar;
    private javax.swing.JComboBox<String> cbKatMakan;
    private javax.swing.JComboBox<String> cbPack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfHarga;
    private javax.swing.JTextField tfKodeBarang;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNamaBarang;
    // End of variables declaration//GEN-END:variables
}

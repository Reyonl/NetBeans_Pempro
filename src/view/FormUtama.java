/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;


/**
 *
 * @author LENOVO
 */
public class FormUtama extends javax.swing.JFrame {

    public static FormKaryawan formKaryawan;
    public static FormPekerjaan formPekerjaan;
    public static FormGaji formGaji;
    /**
     * Creates new form FormUtama
     */
    public FormUtama() {
        initComponents();
        setUkuranLokasiFrame(0.8,true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void setEnableMenu(boolean aktif){
    masterDataMenu.setEnabled(aktif);
    transaksiMenu.setEnabled(aktif);
    laporanMenu.setEnabled(aktif);
}

    private void setUkuranLokasiFrame(double skala, boolean tengah) {
        Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();
        setSize((int)(skala * dimensi.getWidth()), (int)(skala * dimensi.getHeight()));

        if (tengah){
            setLocation((int)((dimensi.getWidth() - getWidth()) / 2),
                        (int)((dimensi.getHeight() - getHeight()) / 2));
        }
    }

     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mdiDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        aplikasiMenu = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        deskripsiMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        loginMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        keluarMenuItem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        masterDataMenu = new javax.swing.JMenu();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        karyawanMenuItem = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        pekerjaanMenuItem = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        transaksiMenu = new javax.swing.JMenu();
        gajiMenuItem = new javax.swing.JMenuItem();
        laporanMenu = new javax.swing.JMenu();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        gajiLaporanMenuItem = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        karyawanLaporanMenuItem = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        pekerjaanLaporanMenuItem = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout mdiDesktopPaneLayout = new javax.swing.GroupLayout(mdiDesktopPane);
        mdiDesktopPane.setLayout(mdiDesktopPaneLayout);
        mdiDesktopPaneLayout.setHorizontalGroup(
            mdiDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        mdiDesktopPaneLayout.setVerticalGroup(
            mdiDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        aplikasiMenu.setText("Aplikasi");
        aplikasiMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplikasiMenuActionPerformed(evt);
            }
        });
        aplikasiMenu.add(jSeparator1);

        deskripsiMenuItem.setText("Description");
        aplikasiMenu.add(deskripsiMenuItem);
        aplikasiMenu.add(jSeparator2);

        loginMenuItem.setText("Login");
        loginMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMenuItemActionPerformed(evt);
            }
        });
        aplikasiMenu.add(loginMenuItem);
        aplikasiMenu.add(jSeparator3);

        keluarMenuItem.setText("Keluar");
        keluarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarMenuItemActionPerformed(evt);
            }
        });
        aplikasiMenu.add(keluarMenuItem);
        aplikasiMenu.add(jSeparator4);

        jMenuBar1.add(aplikasiMenu);

        masterDataMenu.setText("Master Data");
        masterDataMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterDataMenuActionPerformed(evt);
            }
        });
        masterDataMenu.add(jSeparator6);

        karyawanMenuItem.setText("Karyawan");
        karyawanMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karyawanMenuItemActionPerformed(evt);
            }
        });
        masterDataMenu.add(karyawanMenuItem);
        masterDataMenu.add(jSeparator5);

        pekerjaanMenuItem.setText("Pekerjaan");
        pekerjaanMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pekerjaanMenuItemActionPerformed(evt);
            }
        });
        masterDataMenu.add(pekerjaanMenuItem);
        masterDataMenu.add(jSeparator7);

        jMenuBar1.add(masterDataMenu);

        transaksiMenu.setText("Transaksi");

        gajiMenuItem.setText("Gaji");
        gajiMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gajiMenuItemActionPerformed(evt);
            }
        });
        transaksiMenu.add(gajiMenuItem);

        jMenuBar1.add(transaksiMenu);

        laporanMenu.setText("Laporan");
        laporanMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanMenuActionPerformed(evt);
            }
        });
        laporanMenu.add(jSeparator8);

        gajiLaporanMenuItem.setText("Gaji");
        laporanMenu.add(gajiLaporanMenuItem);
        laporanMenu.add(jSeparator9);

        karyawanLaporanMenuItem.setText("Karyawan");
        laporanMenu.add(karyawanLaporanMenuItem);
        laporanMenu.add(jSeparator10);

        pekerjaanLaporanMenuItem.setText("Pekerjaan");
        laporanMenu.add(pekerjaanLaporanMenuItem);
        laporanMenu.add(jSeparator11);

        jMenuBar1.add(laporanMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mdiDesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mdiDesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aplikasiMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplikasiMenuActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_aplikasiMenuActionPerformed

    private void laporanMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laporanMenuActionPerformed

    private void loginMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginMenuItemActionPerformed

    private void pekerjaanMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pekerjaanMenuItemActionPerformed
        // TODO add your handling code here:
          if ((formPekerjaan !=null)&& formPekerjaan.isVisible()){
          try{
              formPekerjaan.setSelected(true);
          }catch(PropertyVetoException ex){}
      }else{
          formPekerjaan = new FormPekerjaan();
          mdiDesktopPane.add(formPekerjaan);
          formPekerjaan.setVisible(true);
          
          Dimension desktopSize = mdiDesktopPane.getSize();
            Dimension jInternalFrameSize = formPekerjaan.getSize();
            int x = (desktopSize.width - jInternalFrameSize.width) / 2;
            int y = (desktopSize.height - jInternalFrameSize.height) / 2;
            formPekerjaan.setLocation(x, y);
      }
    }//GEN-LAST:event_pekerjaanMenuItemActionPerformed

    private void keluarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarMenuItemActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarMenuItemActionPerformed

    private void karyawanMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karyawanMenuItemActionPerformed
        // TODO add your handling
      if ((formKaryawan !=null)&& formKaryawan.isVisible()){
          try{
              formKaryawan.setSelected(true);
          }catch(PropertyVetoException ex){}
      }else{
          formKaryawan = new FormKaryawan();
          mdiDesktopPane.add(formKaryawan);
          formKaryawan.setVisible(true);
          
          Dimension desktopSize = mdiDesktopPane.getSize();
            Dimension jInternalFrameSize = formKaryawan.getSize();
            int x = (desktopSize.width - jInternalFrameSize.width) / 2;
            int y = (desktopSize.height - jInternalFrameSize.height) / 2;
            formKaryawan.setLocation(x, y);
      }
        
//    FormKaryawan formKaryawan = new FormKaryawan();
//    desktopPane.add(formKaryawan);
//    formKaryawan.setVisible(true);
    }//GEN-LAST:event_karyawanMenuItemActionPerformed

    private void masterDataMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterDataMenuActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_masterDataMenuActionPerformed

    private void gajiMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gajiMenuItemActionPerformed
        // TODO add your handling code here:
         if ((formGaji !=null)&& formGaji.isVisible()){
          try{
              formGaji.setSelected(true);
          }catch(PropertyVetoException ex){}
      }else{
          formGaji = new FormGaji();
          mdiDesktopPane.add(formGaji);
          formGaji.setVisible(true);
          
          Dimension desktopSize = mdiDesktopPane.getSize();
            Dimension jInternalFrameSize = formGaji.getSize();
            int x = (desktopSize.width - jInternalFrameSize.width) / 2;
            int y = (desktopSize.height - jInternalFrameSize.height) / 2;
            formGaji.setLocation(x, y);
      }
    }//GEN-LAST:event_gajiMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aplikasiMenu;
    private javax.swing.JMenuItem deskripsiMenuItem;
    private javax.swing.JMenuItem gajiLaporanMenuItem;
    private javax.swing.JMenuItem gajiMenuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuItem karyawanLaporanMenuItem;
    private javax.swing.JMenuItem karyawanMenuItem;
    private javax.swing.JMenuItem keluarMenuItem;
    private javax.swing.JMenu laporanMenu;
    private javax.swing.JMenuItem loginMenuItem;
    private javax.swing.JMenu masterDataMenu;
    private javax.swing.JDesktopPane mdiDesktopPane;
    private javax.swing.JMenuItem pekerjaanLaporanMenuItem;
    private javax.swing.JMenuItem pekerjaanMenuItem;
    private javax.swing.JMenu transaksiMenu;
    // End of variables declaration//GEN-END:variables
}

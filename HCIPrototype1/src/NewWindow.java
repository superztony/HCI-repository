/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kai Tong Teoh
 */
public class NewWindow extends javax.swing.JFrame {

    /**
     * Creates new form NewWindow
     */
    public NewWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Open");
        setMinimumSize(new java.awt.Dimension(640, 480));
        setPreferredSize(new java.awt.Dimension(640, 480));
        getContentPane().setLayout(null);

        jFormattedTextField1.setText("C:/User/Documents/Audacity Projects");
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField1);
        jFormattedTextField1.setBounds(0, 0, 680, 28);

        jFormattedTextField2.setText("Searching...");
        getContentPane().add(jFormattedTextField2);
        jFormattedTextField2.setBounds(680, 0, 110, 28);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(790, 0, 190, 28);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Name\t\tDuration\t\tDate Added\n\nFile One\t\t03:30:00\t\t04/09/2017\nFile O\t\t03:30:01\t\t04/09/2017\nFi One\t\t03:30:02\t\t04/09/2017\nFe ne\t\t03:30:03\t\t04/09/2017\nFe One\t\t03:30:04\t\t04/09/2017\nFil One\t\t03:30:05\t\t04/10/2017\nFile ne\t\t03:30:06\t\t04/09/2017\nFiles One\t\t03:30:07\t\t04/09/2017");
        jScrollPane1.setViewportView(jTextArea1);

        jTabbedPane1.addTab("Favourites", jScrollPane1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Name\t\tDuration\t\tDate Added\n\nFile One\t\t03:30:00\t\t04/09/2017\nFe ne\t\t03:30:03\t\t04/09/2017\nFe One\t\t03:30:04\t\t04/09/2017\nFil One\t\t03:30:05\t\t04/10/2017\nFile ne\t\t03:30:06\t\t04/09/2017\nFiles One\t\t03:30:07\t\t04/09/2017");
        jScrollPane2.setViewportView(jTextArea2);

        jTabbedPane1.addTab("Desktop", jScrollPane2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Name\t\tDuration\t\tDate Added\n\nFile One\t\t03:30:00\t\t04/09/2017\nFile O\t\t03:30:01\t\t04/09/2017\nFi One\t\t03:30:02\t\t04/09/2017\nFe ne\t\t03:30:03\t\t04/09/2017\nFe One\t\t03:30:04\t\t04/09/2017\nFil One\t\t03:30:05\t\t04/10/2017");
        jScrollPane3.setViewportView(jTextArea3);

        jTabbedPane1.addTab("Documents", jScrollPane3);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("Name\t\tDuration\t\tDate Added\n\nFile One\t\t03:30:00\t\t04/09/2017\nFile O\t\t03:30:01\t\t04/09/2017\nFi One\t\t03:30:02\t\t04/09/2017\nFe ne\t\t03:30:03\t\t04/09/2017\nFe One\t\t03:30:04\t\t04/09/2017\nFil One\t\t03:30:05\t\t04/10/2017\nFile ne\t\t03:30:06\t\t04/09/2017\nFiles One\t\t03:30:07\t\t04/09/2017\nFile One\t\t03:30:00\t\t04/09/2017\nFile O\t\t03:30:01\t\t04/09/2017\nFi One\t\t03:30:02\t\t04/09/2017\nFe ne\t\t03:30:03\t\t04/09/2017\nFe One\t\t03:30:04\t\t04/09/2017\nFil One\t\t03:30:05\t\t04/10/2017\nFile ne\t\t03:30:06\t\t04/09/2017\nFiles One\t\t03:30:07\t\t04/09/2017");
        jScrollPane4.setViewportView(jTextArea4);

        jTabbedPane1.addTab("Downloads", jScrollPane4);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setText("Name\t\tDuration\t\tDate Added\n\nFile One\t\t03:30:00\t\t04/09/2017\nFile O\t\t03:30:01\t\t04/09/2017\nFi One\t\t03:30:02\t\t04/09/2017\nFe ne\t\t03:30:03\t\t04/09/2017\nFe One\t\t03:30:04\t\t04/09/2017\nFil One\t\t03:30:05\t\t04/10/2017\nFile ne\t\t03:30:06\t\t04/09/2017\nFiles One\t\t03:30:07\t\t04/09/2017\nFile ne\t\t03:30:06\t\t04/09/2017\nFiles One\t\t03:30:07\t\t04/09/2017");
        jScrollPane5.setViewportView(jTextArea5);

        jTabbedPane1.addTab("Music", jScrollPane5);

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jTextArea6.setText("Name\t\tDuration\t\tDate Added\n\nFile ne\t\t03:30:06\t\t04/09/2017\nFiles One\t\t03:30:07\t\t04/09/2017");
        jScrollPane6.setViewportView(jTextArea6);

        jTabbedPane1.addTab("Videos", jScrollPane6);

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jTextArea7.setText("Name\t\tDuration\t\tDate Added\n\nfile\t\t02:00:05\t\t04/20/1995\nsome file\t\t123:32:3\t\t12/12/1992\n");
        jScrollPane7.setViewportView(jTextArea7);

        jTabbedPane1.addTab("Pictures", jScrollPane7);

        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jTextArea8.setText("Name\t\tDuration\t\tDate Added\n\nProgram Filex86\t\t\t\nProgram File\nDesktop\nDocuments\nWindows\nTemp");
        jScrollPane8.setViewportView(jTextArea8);

        jTabbedPane1.addTab("Local Disk(C:)", jScrollPane8);

        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jTextArea9.setText("Name\t\tDuration\t\tDate Added\n\nbackup \t\t\nsad\nlost backup");
        jScrollPane9.setViewportView(jTextArea9);

        jTabbedPane1.addTab("Local Disk(D:)", jScrollPane9);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 30, 820, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    // End of variables declaration//GEN-END:variables
}

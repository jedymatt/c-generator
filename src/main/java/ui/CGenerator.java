package main.java.ui;

public class CGenerator extends javax.swing.JFrame {

    main.java.util.PropertyLoader loader;

    /**
     * Creates new form CGenerator
     */
    public CGenerator() {
        loader = new main.java.util.PropertyLoader();
        System.out.println(loader.toString());
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

        tab = new javax.swing.JTabbedPane();
        filesTab = new main.java.ui.FilesTab();
        configureTab1 = new main.java.ui.ConfigureTab(loader);
        aboutTab = new main.java.ui.AboutTab();
        buttonGenerate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("C Generator");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/main/res/images/icon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(400, 500));
        setSize(new java.awt.Dimension(400, 500));

        tab.setName(""); // NOI18N
        tab.addTab("Files", filesTab);
        tab.addTab("Configure", configureTab1);
        tab.addTab("About", aboutTab);

        buttonGenerate.setText("Generate");
        buttonGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGenerateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonGenerate))
                    .addComponent(tab))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonGenerate)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGenerateActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == buttonGenerate) {
//            show a Generate JDialog
//            main.java.util.PropertiesLoader.storeUserConfig();
//            System.out.println("userconfig.properties file created");
            boolean isCreated = loader.storeConfig(loader.getUserConfig());
            System.out.println("FileCreated=" + isCreated);
            System.out.println("Path=" + loader.getUserConfig().getAbsolutePath());
        }
    }//GEN-LAST:event_buttonGenerateActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CGenerator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.java.ui.AboutTab aboutTab;
    private javax.swing.JButton buttonGenerate;
    private main.java.ui.ConfigureTab configureTab1;
    private main.java.ui.FilesTab filesTab;
    private javax.swing.JTabbedPane tab;
    // End of variables declaration//GEN-END:variables
}

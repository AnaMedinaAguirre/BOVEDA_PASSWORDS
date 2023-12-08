package Vista;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlblBienvenido = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlblUsuario = new javax.swing.JLabel();
        jlblContraseña = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPassInicio = new javax.swing.JPasswordField();
        jtxtUsuario = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jlblIconLogin = new javax.swing.JLabel();
        jbtnRegistrarse = new javax.swing.JButton();
        jlblIconLogin1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 115, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblBienvenido.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        jlblBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        jlblBienvenido.setText("BIENVENIDO");
        jPanel4.add(jlblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 200, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("------------------------------------");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 220, 20));

        jlblUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jlblUsuario.setText("Usuario : ");
        jPanel4.add(jlblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 170, 30));

        jlblContraseña.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jlblContraseña.setText("Contraseña : ");
        jPanel4.add(jlblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 150, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 115, 255));
        jButton1.setText("INICIAR SESION ");
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 170, 60));
        jPanel4.add(jPassInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 290, 40));
        jPanel4.add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 290, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 510));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jlblIconLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 240, -1));

        jbtnRegistrarse.setBackground(new java.awt.Color(0, 115, 255));
        jbtnRegistrarse.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jbtnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistrarse.setText("REGISTRARSE");
        jbtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarseActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 240, 60));
        jPanel3.add(jlblIconLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 240, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LOGIN.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 250, 310));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 370, 510));

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

    private void jbtnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarseActionPerformed

    }//GEN-LAST:event_jbtnRegistrarseActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPassInicio;
    private javax.swing.JButton jbtnRegistrarse;
    private javax.swing.JLabel jlblBienvenido;
    private javax.swing.JLabel jlblContraseña;
    private javax.swing.JLabel jlblIconLogin;
    private javax.swing.JLabel jlblIconLogin1;
    private javax.swing.JLabel jlblUsuario;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}

package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class SplashScreen extends JFrame {

    private JProgressBar progressBar;
    private JLabel loadingLabel;

    public SplashScreen() {
        setUndecorated(true);
        setSize(700, 350);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Main panel
        JPanel mainPanel = new JPanel(new BorderLayout());
        add(mainPanel);

        // Left panel for image
        JPanel leftPanel = new JPanel();
        leftPanel.setPreferredSize(new Dimension(300, 300));
        leftPanel.setBackground(Color.WHITE);

        try {
            // ✅ Ensure the image exists in: src/ui/images/kkoo.png
            BufferedImage img = ImageIO.read(new File("src/ui/images/Gold and White Modern Grocery Store Promotion Instagram Post .png"));
            Image scaled = img.getScaledInstance(300, 340, Image.SCALE_SMOOTH);
            JLabel imgLabel = new JLabel(new ImageIcon(scaled));
            leftPanel.add(imgLabel);
        } catch (Exception e) {
            System.err.println("Image not found! Check your file path.");
            e.printStackTrace();
        }

        mainPanel.add(leftPanel, BorderLayout.WEST);

        // Right panel for text and progress
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBackground(Color.WHITE);
        rightPanel.setBorder(BorderFactory.createEmptyBorder(50, 30, 50, 30));

        // 🟢 Green theme color
        Color greenTheme = new Color(46, 204, 113); // Nice light green

        JLabel title = new JLabel("Sampath Food City");
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setForeground(greenTheme); // ✅ Green title
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        loadingLabel = new JLabel("Loading, please wait...");
        loadingLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        loadingLabel.setForeground(new Color(100, 100, 100));
        loadingLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setForeground(greenTheme); // ✅ Green progress
        progressBar.setBackground(new Color(230, 230, 230));
        progressBar.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        progressBar.setForeground(greenTheme);
        progressBar.setUI(new javax.swing.plaf.basic.BasicProgressBarUI());

        rightPanel.add(title);
        rightPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        rightPanel.add(loadingLabel);
        rightPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        rightPanel.add(progressBar);

        mainPanel.add(rightPanel, BorderLayout.CENTER);

        setVisible(true);
        fillProgress();
    }

    private void fillProgress() {
        new Thread(() -> {
            try {
                for (int i = 0; i <= 100; i++) {
                    progressBar.setValue(i);
                    Thread.sleep(50);
                }
                dispose();
                // ✅ After splash, open your login window
                new login().setVisible(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }



   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> new SplashScreen().setVisible(true));
    };
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables


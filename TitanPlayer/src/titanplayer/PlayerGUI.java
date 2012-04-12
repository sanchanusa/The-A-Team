/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package titanplayer;
import com.titan.bll.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Brandon
 */
public class PlayerGUI extends javax.swing.JFrame {
    private File file;
    Library myLibray = new Library();
    List playlistCollection = new ArrayList();
    

    public PlayerGUI() {
        
        
        initComponents();
        loginFrame.setVisible(rootPaneCheckingEnabled);
        
        User user = new User();
        user.setUsername(usernameText.getText());
        
        if(user.getUsername().equalsIgnoreCase("TEST")){
            loginFrame.setVisible(false);
        }else{
           // System.exit(0);
        }
        
        System.out.print(user.getUsername());
        //if(verified){
       // }else{
       //     System.exit(0);
       // }
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSongChooser = new javax.swing.JFileChooser();
        loginFrame = new javax.swing.JFrame();
        usernameText = new javax.swing.JTextField();
        loginCancelBtn = new javax.swing.JButton();
        loginLoginBtn = new javax.swing.JButton();
        emailText = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordWindowTitle = new javax.swing.JLabel();
        jPanelMain = new javax.swing.JPanel();
        jPanelControls = new javax.swing.JPanel();
        jButtonStop = new javax.swing.JButton();
        jButtonPlayPause = new javax.swing.JButton();
        jButtonBackward = new javax.swing.JButton();
        jButtonFoward = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollJTree = new javax.swing.JScrollPane();
        jTreeTitanPlayer = new javax.swing.JTree();
        jScrollTable = new javax.swing.JScrollPane();
        jTableSongInfo = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuLoadSong = new javax.swing.JMenuItem();
        jMenuDeleteSong = new javax.swing.JMenuItem();
        jMenuExit = new javax.swing.JMenuItem();
        jMenuPlaylist = new javax.swing.JMenu();
        jMenuPlaylistCreate = new javax.swing.JMenuItem();
        jMenuPlaylistDelete = new javax.swing.JMenuItem();
        jMenuPlaylistAddSong = new javax.swing.JMenuItem();
        jMenuPlayListDeleteSong = new javax.swing.JMenuItem();

        loginFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        loginFrame.setAlwaysOnTop(true);
        loginFrame.setAutoRequestFocus(false);
        loginFrame.setBounds(new java.awt.Rectangle(0, 0, 250, 300));
        loginFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginFrame.setPreferredSize(new java.awt.Dimension(500, 500));
        loginFrame.setResizable(false);

        loginCancelBtn.setText("Cancel");
        loginCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginCancelBtnActionPerformed(evt);
            }
        });

        loginLoginBtn.setText("Login");

        passwordLabel.setText("Password:");

        emailLabel.setText("E-mail:");

        usernameLabel.setText("Username:");

        passwordWindowTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordWindowTitle.setText("TitanPlayer Music Player Login");

        javax.swing.GroupLayout loginFrameLayout = new javax.swing.GroupLayout(loginFrame.getContentPane());
        loginFrame.getContentPane().setLayout(loginFrameLayout);
        loginFrameLayout.setHorizontalGroup(
            loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginFrameLayout.createSequentialGroup()
                        .addComponent(loginCancelBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passwordTextField)
                    .addComponent(emailText)
                    .addComponent(passwordWindowTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(usernameText)
                    .addGroup(loginFrameLayout.createSequentialGroup()
                        .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel)
                            .addComponent(emailLabel)
                            .addComponent(usernameLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        loginFrameLayout.setVerticalGroup(
            loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFrameLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(passwordWindowTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel)
                .addGap(5, 5, 5)
                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginCancelBtn)
                    .addComponent(loginLoginBtn))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButtonStop.setText("Stop");
        jButtonStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStopActionPerformed(evt);
            }
        });

        jButtonPlayPause.setText("Play");
        jButtonPlayPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayPauseActionPerformed(evt);
            }
        });

        jButtonBackward.setText("<");

        jButtonFoward.setText(">");

        javax.swing.GroupLayout jPanelControlsLayout = new javax.swing.GroupLayout(jPanelControls);
        jPanelControls.setLayout(jPanelControlsLayout);
        jPanelControlsLayout.setHorizontalGroup(
            jPanelControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelControlsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBackward, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPlayPause, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonStop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonFoward, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelControlsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonBackward, jButtonFoward, jButtonPlayPause, jButtonStop});

        jPanelControlsLayout.setVerticalGroup(
            jPanelControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelControlsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelControlsLayout.createSequentialGroup()
                        .addComponent(jButtonPlayPause)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonStop)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelControlsLayout.createSequentialGroup()
                        .addComponent(jButtonFoward)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelControlsLayout.createSequentialGroup()
                        .addComponent(jButtonBackward)
                        .addGap(34, 34, 34))))
        );

        jPanelControlsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonBackward, jButtonFoward, jButtonPlayPause, jButtonStop});

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Song Title");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("4:00");

        jLabel3.setText("0:00");

        jScrollJTree.setViewportView(jTreeTitanPlayer);

        jTableSongInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title", "Artist", "Length"
            }
        ));
        jScrollTable.setViewportView(jTableSongInfo);

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(196, 196, 196)
                        .addComponent(jPanelControls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(jScrollJTree, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollJTree, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                    .addComponent(jScrollTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addComponent(jPanelControls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jMenuFile.setText("File");

        jMenuLoadSong.setText("Load Song");
        jMenuLoadSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLoadSongActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuLoadSong);

        jMenuDeleteSong.setText("Delete Song");
        jMenuDeleteSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDeleteSongActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuDeleteSong);

        jMenuExit.setText("Exit");
        jMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExitActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuExit);

        jMenuBar1.add(jMenuFile);

        jMenuPlaylist.setText("Playlist");

        jMenuPlaylistCreate.setText("Create Playlist");
        jMenuPlaylistCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPlaylistCreateActionPerformed(evt);
            }
        });
        jMenuPlaylist.add(jMenuPlaylistCreate);

        jMenuPlaylistDelete.setText("Delete Playlist");
        jMenuPlaylist.add(jMenuPlaylistDelete);

        jMenuPlaylistAddSong.setText("Add Song");
        jMenuPlaylist.add(jMenuPlaylistAddSong);

        jMenuPlayListDeleteSong.setText("Delete Song");
        jMenuPlaylist.add(jMenuPlayListDeleteSong);

        jMenuBar1.add(jMenuPlaylist);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButtonPlayPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayPauseActionPerformed
        Playlist myPlaylist = new Playlist(JOptionPane.showInputDialog("Playlist name?"));
        myPlaylist.addSong(new Song("Rock Star", "John Smith", "/Test.mp3"));
        Player player = new Player();
        player.loadPlaylist(myPlaylist);
        player.playSong();
    }//GEN-LAST:event_jButtonPlayPauseActionPerformed

    private void jButtonStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonStopActionPerformed

    private void jMenuLoadSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLoadSongActionPerformed
                JFileChooser songChooser = new JFileChooser(); 
                songChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int result = songChooser.showOpenDialog(this); 

        if (result != JFileChooser.CANCEL_OPTION) 
            file = songChooser.getSelectedFile(); 
        else 
            file = null; 
    }//GEN-LAST:event_jMenuLoadSongActionPerformed

    private void jMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuExitActionPerformed

    private void jMenuDeleteSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDeleteSongActionPerformed
        
    }//GEN-LAST:event_jMenuDeleteSongActionPerformed

    private void jMenuPlaylistCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPlaylistCreateActionPerformed
        Playlist myPlaylist = new Playlist(JOptionPane.showInputDialog("Playlist name?"));
        myPlaylist.addSong(new Song("Rock Star", "John Smith", "/Test.mp3"));
        Player player = new Player();
        player.loadPlaylist(myPlaylist);
        player.playSong();
    }//GEN-LAST:event_jMenuPlaylistCreateActionPerformed

    private void loginCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginCancelBtnActionPerformed
            System.exit(0);
    }//GEN-LAST:event_loginCancelBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PlayerGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton jButtonBackward;
    private javax.swing.JButton jButtonFoward;
    private javax.swing.JButton jButtonPlayPause;
    private javax.swing.JButton jButtonStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuDeleteSong;
    private javax.swing.JMenuItem jMenuExit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuLoadSong;
    private javax.swing.JMenuItem jMenuPlayListDeleteSong;
    private javax.swing.JMenu jMenuPlaylist;
    private javax.swing.JMenuItem jMenuPlaylistAddSong;
    private javax.swing.JMenuItem jMenuPlaylistCreate;
    private javax.swing.JMenuItem jMenuPlaylistDelete;
    private javax.swing.JPanel jPanelControls;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollJTree;
    private javax.swing.JScrollPane jScrollTable;
    private javax.swing.JFileChooser jSongChooser;
    private javax.swing.JTable jTableSongInfo;
    private javax.swing.JTree jTreeTitanPlayer;
    private javax.swing.JButton loginCancelBtn;
    private javax.swing.JFrame loginFrame;
    private javax.swing.JButton loginLoginBtn;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel passwordWindowTitle;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}

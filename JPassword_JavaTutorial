import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 *@author Vincent
 */
public class JPassword_JavaTutorial {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFrame window = new JFrame("Java Tutorial: JPassword");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel= new JPanel();
        final JPasswordField pw = new JPasswordField(20);
        final JButton logIn = new JButton("Log In");
        logIn.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                JOptionPane.showMessageDialog(null, pw.getPassword()+"\n" + pw.getText());
            }
        });
        KeyListener keyListener = new KeyListener() {
            public void keyPressed(KeyEvent keyEvent) {
                int keyCode = keyEvent.getKeyCode();
                String kt = Character.toString(keyEvent.getKeyChar());
                if (keyEvent.getKeyCode() == KeyEvent.VK_ENTER) {
                    logIn.doClick();
                }
            }

            public void keyReleased(KeyEvent keyEvent) {
            }

            public void keyTyped(KeyEvent keyEvent) {
            }
        };
        pw.addKeyListener(keyListener);
        //pw.setEchoChar('*'); //add if you want to change what the field masks characters as
        mainPanel.add(Box.createHorizontalGlue());
        mainPanel.add(pw);
        mainPanel.add(logIn);
        window.add(mainPanel);
        window.setSize(500, 100);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
}

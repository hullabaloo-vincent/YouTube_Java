import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 *@author Vincent
 */
public class JFileChooser_JavaTutorial {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFrame window = new JFrame("JFileChooser test");
        JPanel topPanel = new JPanel();
        final JButton openFileChooser = new JButton("Open JFileChooser");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JFileChooser fc = new JFileChooser();
        openFileChooser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                fc.setCurrentDirectory(new java.io.File("user.home"));
                fc.setDialogTitle("This is a JFileChooser");
                fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                if (fc.showOpenDialog(openFileChooser) == JFileChooser.APPROVE_OPTION) {
                    JOptionPane.showMessageDialog(null, fc.getSelectedFile().getAbsolutePath());
                }
            }
        });
        window.add(BorderLayout.NORTH, topPanel);
        topPanel.add(openFileChooser);
        window.setSize(500, 500);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
}

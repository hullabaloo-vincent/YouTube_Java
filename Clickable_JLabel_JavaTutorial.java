import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 *@author Vincent
 */
public class clickableJLabel_JavaTutorial {

    public static void main(String[] args) {
        JFrame window = new JFrame("JLabel Button");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel buttonLabel = new JLabel();
        buttonLabel.setText("<html><h1>Click Me!</h1></html");
        JPanel panel_1 = new JPanel();
        buttonLabel.addMouseListener(new MouseListener() {
            public void mouseReleased(MouseEvent e) {
                buttonLabel.setText("<html><h1>Thanks!</h1></html");
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseClicked(MouseEvent e) {
                buttonLabel.setText("<html><h1>Thanks!</h1></html");
            }
        });
        panel_1.add(buttonLabel);
        window.add(BorderLayout.NORTH, panel_1);
        window.setSize(500, 500);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
}

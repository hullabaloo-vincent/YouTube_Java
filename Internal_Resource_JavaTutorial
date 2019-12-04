import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 *@author Vincent
 */
public class InternalResource_JavaTutorial {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, IOException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFrame window = new JFrame("Internal Resource: Java Tutorial");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel_1 = new JPanel();
        BufferedImage img = ImageIO.read(InternalResource_JavaTutorial.class.getResource("bluebert.png"));
        ImageIcon p = new ImageIcon();
        JLabel lbl = new JLabel();
        p.setImage(img);
        lbl.setIcon(p);
        panel_1.add(lbl);
        
        window.add(BorderLayout.CENTER, panel_1);
        window.setSize(500, 300);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
}

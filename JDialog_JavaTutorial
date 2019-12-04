import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author Vincent
 */
public class JDialog_JavaTutorial {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFrame window = new JFrame("JDialog: Java Tutorial");
        final JPanel TopPanel = new JPanel();
        final JButton addButton = new JButton("Add numbers");
        final JTextField answerText = new JTextField(10);
        Font font1 = new Font("SansSerif", Font.BOLD, 48);
        answerText.setFont(font1);
        answerText.setText("Answer");
        answerText.setEditable(false);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String firstNumber = JOptionPane.showInputDialog("Enter first number");
                    String secondNumber = JOptionPane.showInputDialog("Enter second number");
                    int answer = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
                    answerText.setText(Integer.toString(answer));
                    JOptionPane.showMessageDialog(null, firstNumber + " + " + secondNumber + " = " + answer);
                    int confirm = JOptionPane.showOptionDialog(null, "You want to start again?", "Again?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                    /*
                     0 = yes
                     1 = no
                     */
                    if (confirm != 1) {
                        addButton.doClick();
                    } else {
                        //no
                    }
                } catch (Exception ex) {

                }
            }
        });
        TopPanel.add(addButton);
        window.add(BorderLayout.NORTH, TopPanel);
        window.add(BorderLayout.CENTER, answerText);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
}

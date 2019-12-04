import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 *@author Vincent Liink to javax.mail api
 * http://www.oracle.com/technetwork/java/index-138643.html
 *
 */
public class Email_JavaTutorial {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        /*
        *Component setup
        */
        JFrame window = new JFrame("Emailer: Java Tutorial");
        JPanel messageInfo = new JPanel(new BorderLayout());
        JPanel userInfo = new JPanel(new BorderLayout());
        final JButton send = new JButton("Send");
        final JTextField user = new JTextField(10);
        final JPasswordField pw = new JPasswordField(10);
        final JTextField to = new JTextField(10);
        final JTextField subject = new JTextField(10);
        final JTextArea body = new JTextArea(5, 20);
        /*
        *Component properties
        */
      //  pw.setEchoChar('*');
        body.setLineWrap(true);
        body.setWrapStyleWord(false);
        user.setText("username@gmail.com");
        pw.setText("Password");
        to.setText("Someone@gmail.com");
        subject.setText("Subject");
        /*
        *Attach Components
        */
        userInfo.add(user, BorderLayout.NORTH);
        userInfo.add(pw, BorderLayout.CENTER);
        messageInfo.add(to, BorderLayout.NORTH);
        messageInfo.add(subject, BorderLayout.CENTER);
        messageInfo.add(send, BorderLayout.SOUTH);
        final JScrollPane scroll = new JScrollPane(body, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        /*
        *Component Actions
        */
        send.addActionListener((ActionEvent e) -> {
            /*
            Just in case the Lambda expression is just for newer versions of Java
            send.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            */
            final String username = user.getText();
            final String password = pw.getText();
            
            Properties props = new Properties();
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");
            
            Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }
                    });
            
            try {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(user.getText()));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to.getText()));
                message.setSubject(subject.getText());
                message.setText(body.getText());
                Transport.send(message);
                JOptionPane.showMessageDialog(null, "Email sent successfully!");
            } catch (MessagingException ex) {
                JOptionPane.showMessageDialog(null, "Oops something went wrong" + "\n" + ex.getMessage());
            }
        });
        /*
        *Window properties
        */
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(BorderLayout.EAST, userInfo);
        window.add(BorderLayout.NORTH, messageInfo);
        window.add(scroll);
        window.setSize(355, 220);
        window.setMinimumSize(new Dimension(355, 220));
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.JTextArea;

/**
 *
 *@author Vincent
 */

public class ScrollPane {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner user_input = new Scanner(System.in);
        JFrame window = new JFrame("JScrollBar example");
        String all = new Scanner(new File("textExample.txt")).useDelimiter("\\A").next(); 
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JTextArea textArea = new JTextArea(10, 20);
        JScrollPane scroll = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        textArea.setText(all);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        window.add(scroll);
        window.setSize(500, 500);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
}

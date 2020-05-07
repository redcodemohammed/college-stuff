package random_stuff;

import javax.swing.JOptionPane;

/**
 * Dialogs1
 */
public class Dialogs1 {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "What's the first number?"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "What's the second number?"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "What's the third number?"));
        JOptionPane.showMessageDialog(null, "The sum is " + (n1 + n2 + n3));
    }
}

package Lab01;
/*
    Exercise 2.2.6 part 2
 */

import javax.swing.*;

public class LinearSystem {
    public static void main(String[] args) {
        // Handle input

        double a1, b1, c1, a2, b2, c2;
        double d1, d2, d;
        String equation1 = "a1x + b1y = c1\n", equation2 = "a2x + b2y = c2\n";

        a1 = Double.parseDouble(JOptionPane.showInputDialog(null, equation1 + equation2 + "Please input a: "));

        equation1 = String.format("%.2f", a1) + "x + b1y = c1\n";

        b1 = Double.parseDouble(JOptionPane.showInputDialog(null, equation1 + equation2 + "Please input b: "));

        equation1 = String.format("%.2f", a1) + "x + " + String.format("%.2f", b1) + "y = c1\n";

        c1 = Double.parseDouble(JOptionPane.showInputDialog(null, equation1 + equation2 + "Please input c: "));

        equation1 = String.format("%.2f", a1) + "x + " +  String.format("%.2f", b1) + "y = " + String.format("%.2f",c1) + "\n";

        a2 = Double.parseDouble(JOptionPane.showInputDialog(null, equation1 + equation2 + "Please input a: "));

        equation2 = String.format("%.2f", a2) + "x + b1y = c1\n";

        b2 = Double.parseDouble(JOptionPane.showInputDialog(null, equation1 + equation2 + "Please input b: "));

        equation2 = String.format("%.2f", a2) + "x + " + String.format("%.2f", b2) +"y = c1\n";

        c2 = Double.parseDouble(JOptionPane.showInputDialog(null, equation1 + equation2 + "Please input c: "));

        equation2 = String.format("%.2f", a2) + "x + " + String.format("%.2f", b2) +"y = " + String.format("%.2f", c2) + "\n";

        // Handle output
        d = a1 * b2 - a2 * b1;
        d2 = c1 * a2 - c2 * a1;
        d1 = b1 * c2 - b2 * c1;
        if ( d == 0) {
            if ( d2 == 0 && d1 == 0)
                JOptionPane.showMessageDialog(null,  equation1 + equation2 +"Equation above has infinite number of solution!", "Output", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, equation1 + equation2 +"Equation above has no solution!", "Output", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            double x = d1 / d, y = d2 / d;
            JOptionPane.showMessageDialog(null, "Equation: \n" + equation1 + equation2 + "Has solution as follows: x: " + String.format("%.2f", x) + ", y: " + String.format("%.2f", y));
        }
    }
}

package hust.soict.dsai.lab01;
/*
    Exercise 2.2.6 part 3
 */

import javax.swing.*;

public class SecondDegreeEquation {
    public static void main(String[] args) {
        // Handle input
        double aChecker;
        double a, b, c, d, x1, x2;
        while (true) {
            aChecker = Double.parseDouble(JOptionPane.showInputDialog(null, "ax^2 + bx = c\nPlease input a: "));
            if (aChecker != 0) {
                a = aChecker;
                break;
            }
        }
        b = Double.parseDouble(JOptionPane.showInputDialog(null,"ax^2 + bx = c\nPlease input b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog(null,"ax^2 + bx = c\nPlease input c: "));

        d = b*b - 4*a*c;

        if ( d < 0 ) JOptionPane.showMessageDialog(null, "There's no result for this equation!");
        else {
            d = Math.sqrt(d);
            x1 = (-b + d)/(2*a);
            x2 = (-b - d)/(2*a);
            if( x1 == x2)
                JOptionPane.showMessageDialog(null,"Result of this quadratic equation is:\nx1 = x2 =" + String.format("%.2f", x1));
            else
                JOptionPane.showMessageDialog(null,"Result of this quadratic equation is:\nx1 =" + String.format("%.2f", x1) + ", x2 = " + String.format("%.2f", x2));
        }



    }
}

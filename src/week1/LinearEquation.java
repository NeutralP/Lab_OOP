package week1;


import javax.swing.*;

public class LinearEquation {

    public static void main(String[] args) {
        // Handle input
        double aChecker;
        double a, b, c;
        while (true) {
            aChecker = Double.parseDouble(JOptionPane.showInputDialog(null, "ax + b = c\nPlease input a: "));
            if (aChecker != 0) {
                a = aChecker;
                break;
            }
        }
        b = Double.parseDouble(JOptionPane.showInputDialog(null,"ax + b = c\nPlease input b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog(null,"ax + b = c\nPlease input c: "));

        JOptionPane.showMessageDialog(null, "Equation's " + String.format("%.2f", a) + "x + " + String.format("%.2f", b) + " = " + String.format("%.2f", c) + " result is: \n" + String.format("%.2f", (c-b)/a));

    }



//    public void setB(double b) {
//        this.b = b;
//    }
//
//    public void setC(double c) {
//        this.c = c;
//    }

//    public static String prompt(int inputCounter, int a, int b, int c) {
//        String achar = "a", bchar = "b", cchar = "c";
//        String prompt = "\nPlease input ";
//        if (inputCounter == 0) {
//            prompt += "a: ";
//        }
//        if (inputCounter == 1) {
//            prompt+= "b: ";
//            achar = String.format("%.2f", a);
//        }
//        if (inputCounter == 2) {
//            prompt += "c: ";
//            bchar = String.format("%.2f", b);
//        }
//        if (inputCounter == 3) cchar = String.format("%.2f", c);
//
//        return achar + "x +" + bchar + "y = " + cchar + prompt;
//    }

}


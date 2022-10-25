package week1;

import javax.swing.*;
/*
    Exercise 2.2.5
 */
public class Calculator {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double num1, num2;
        double sum, difference, product, quotient;
        String strNotification = "Calculator's result is as follows: ";

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first Number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);

        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);

        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        quotient = num1 / num2;

        strNotification += "\nsum: " + sum + "\ndif: " + difference + "\nproduct: " + product + "\nquotient: " + quotient;

        JOptionPane.showMessageDialog(null, strNotification, "Calculator", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}

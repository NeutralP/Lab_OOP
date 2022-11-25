package hust.soict.dsai.lab01;
/*
    Exercise 6.3
 */
import javax.swing.*;

public class TriangleStars {
    public static void printTriangle(int n) {
        // Handle number of rows
        for (int i = 0; i < n; i++) {
            // Number of spaces before the star
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // Ending line after each row
            System.out.println();
        }
    }

    public static int Input() {
        int i;
        i = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number of rows: "));
        return i;
    }

    public static void main(String[] args) {
        int n;
        n = Input();
        printTriangle(n);
    }
}

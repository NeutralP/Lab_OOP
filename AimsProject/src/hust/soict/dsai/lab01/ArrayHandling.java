package hust.soict.dsai.lab01;
/*
    Exercise 6.5
    Array is a constant
 */
import java.util.Arrays;

public class ArrayHandling {
    public static void main(String[] args) {
        int[] array = {1789, 2035, 1899, 1456, 2013, 2022, 1200, 1334};
        int sum;
        double avg;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        sum = findSumUsingStream(array);
        avg = findAverageUsingStream(array);

        System.out.println("Sum value: " + String.format("%d", sum) + "\nAverage value: " + String.format("%.1f", avg));
    }



    // Calculate sum of array
    // Return int value
    //    public static int arraySum (int[] array) {
    //        int sum = 0;
    //        for (int value : array) {
    //            sum += value;
    //        }
    //        return sum;
    //    }

    public static int findSumUsingStream(int[] array) {
        return Arrays.stream(array).sum();
    }

    // Calculate average value of whole array
    // Return the average in double
    //    public static double averageValue (int[] array) {
    //        int sum = findSumUsingStream(array);
    //        return (double) sum / array.length;
    //    }

    public static double findAverageUsingStream(int[] array) {
        return Arrays.stream(array).average().orElse(Double.NaN);
    }
}

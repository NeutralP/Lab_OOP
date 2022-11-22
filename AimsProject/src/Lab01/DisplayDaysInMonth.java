package Lab01;

import javax.swing.*;

public class DisplayDaysInMonth {
    public static void main(String[] args) {
        int intYear, intMonth, intDays;

        while (true) {
            int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Please input year (format: YYYY): "));
            if(yearFormatChecker(x)) {
                intYear = x;
                break;
            }
        }

        while(true) {
            String y = JOptionPane.showInputDialog(null, "Please input month (full name, abbreviation, 3 letters, or number)");
            if(strMonthToInt(y) != 0) {
                intMonth = strMonthToInt(y);
                break;
            }
        }

       intDays = monthsAndYearToDays(intMonth, intYear);

        JOptionPane.showMessageDialog(null, "Numbers of days in year " + String.format("%d", intYear) + ", month " + String.format("%d", intMonth) + " is: " + String.format("%d", intDays));


    }

    // Handle year format
    // If true then correct format
    public static boolean yearFormatChecker (int intYear) {
        return intYear >= 0;
    }

    // Check whether input is leapYear or not
    public static boolean leapYearChecker (int intYear) {
        return intYear % 4 == 0;
    }

    // Handle Month input
    // Convert to int, if invalid input then value = 0
    public static int strMonthToInt(String strMonth) {
        switch (strMonth) {
            case "January":
            case "Jan.":
            case "Jan":
            case "1":
                return 1;
            case "February":
            case "Feb.":
            case "Feb":
            case "2":
                return 2;
            case "March":
            case "Mar.":
            case "Mar":
            case "3":
                return 3;
            case "April":
            case "Apr.":
            case "Apr":
            case "4":
                return 4;
            case "May":
            case "5":
                return 5;
            case "June":
            case "Jun.":
            case "Jun":
            case "6":
                return 6;
            case "July":
            case "Jul.":
            case "Jul":
            case "7":
                return 7;
            case "August":
            case "Aug.":
            case "Aug":
            case "8":
                return 8;
            case "September":
            case "Sep.":
            case "Sep":
            case "9":
                return 9;
            case "October":
            case "Oct.":
            case "Oct":
            case "10":
                return 10;
            case "November":
            case "Nov.":
            case "Nov":
            case "11":
                return 11;
            case "December":
            case "Dec.":
            case "Dec":
            case "12":
                return 12;
            default:
                return 0;
        }
    }

    // Convert Year and Month to Days
    // If incorrect input then return 0
    public static int monthsAndYearToDays(int intMonth, int intYear) {
        int intDays;
        // We will handle days in month by separating the exception (February)
        switch (intMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                intDays = 31;
                break;
            case 2:
                if (leapYearChecker(intYear)) intDays = 29;
                else intDays = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                intDays = 30;
                break;
            default:
                intDays = 0;
        }
        return intDays;
    }

}

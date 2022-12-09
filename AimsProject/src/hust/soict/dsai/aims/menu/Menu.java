package hust.soict.dsai.aims.menu;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;

public class Menu {
    public static void showMenu(Store store, Cart cart) {
        //show menu of aims
        while (true) {
            System.out.println("AIMS: ");
            System.out.println("--------------------------------");
            System.out.println("1. View Store");
            System.out.println("2. Update store");
            System.out.println("3. View Cart");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 1-4");
            //get user's choice
            int choice = 5;
            java.util.Scanner keyboard = new java.util.Scanner(System.in);
            choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {
                case 1:
                    storeMenu(store, cart);
                    break;
                case 2:
                    // select item to remove item from store
                    System.out.println("Please enter the ID of the item you want to remove: ");
                    String Searchid = keyboard.next();
                    store.removeMedia(Searchid);
                    break;
                case 3:

                    break;
                case 0:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Please choose a number: 1-4");
                    break;
            }
        }
    }

    public static void storeMenu(Store store, Cart cart) {
        while (true) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media’s details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");
            int choice = 5;
            java.util.Scanner keyboard = new java.util.Scanner(System.in);
            choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 0:
                    return;
                default:
                    System.out.println("Please choose a number: 0-4");
            }
        }
    }
}

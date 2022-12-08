package hust.soict.dsai.aims.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class CartTest {
    public static void main(String[] args) {
        // Creating a new instance of the Cart class.
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        cart.addMedia(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

        // Test the print method
        System.out.print("\n\n");
        System.out.println("TEST PRINT/ADD FUNCTION");
        cart.print();

        // Test different add function
        System.out.print("\n\n");
        Media[] mediaList = new Media[] {dvd1, dvd3};
        cart.addMedia(mediaList);
        System.out.println("TEST ANOTHER ADD FUNCTION");
        cart.print();

        // Test the remove method
        System.out.print("\n\n");
        cart.removeMedia(dvd4);
        cart.print();

        // To-do: Test the search methods here, should return 1 3
        if (cart.SearchByID(2))
            System.out.print("1 ");
        if (false)
            System.out.print("2 ");
        if (cart.SearchByString("Aladdin"))
            System.out.print("3 ");
        if (cart.SearchByString("Aladin"))
            System.out.print("4 ");
    }
}

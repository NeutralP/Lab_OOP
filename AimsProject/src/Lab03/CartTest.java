package Lab03;

import Lab02.Cart;
import Lab02.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        // Creating a new instance of the Cart class.
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        // Test the print method
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

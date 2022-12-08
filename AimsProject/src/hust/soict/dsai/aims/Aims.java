package hust.soict.dsai.aims;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.Cart;

public class Aims {
    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder = new Cart();

        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("TENET", "Thriller", "Christopher Nolan", 129, 19.92f);
        anOrder.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Dune", "Sci-fi", "Villeanuve", 150, 20.05f);
        anOrder.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Back To the Future", "Scifi", "Dunno", 120, 20);
        anOrder.addMedia(dvd3);

        System.out.println("The total cost is: ");
        System.out.printf("%.2f%n", anOrder.cost());
//        anOrder.displayCart();

//        anOrder.removeDigitalVideoDisc(dvd1);
        anOrder.print();
    }
}

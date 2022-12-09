package hust.soict.dsai.aims.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addMedia(dvd1);
        store.addMedia(dvd1); // Test override method

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        store.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        store.addMedia(dvd3);

        // Test print and add function
        System.out.println();
        System.out.println();
        System.out.println("TEST ADD FUNCTION");
        store.print();


        // Test remove function
        System.out.println();
        System.out.println();
        System.out.println("TEST REMOVE FUNCTION");
        store.removeMedia(dvd2);
        store.print();
    }
}

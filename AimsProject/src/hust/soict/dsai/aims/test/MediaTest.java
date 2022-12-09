package hust.soict.dsai.aims.test;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class MediaTest {
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();
        List<String> authors = new ArrayList<>();
        authors.add("George R.R Martin");

        // Add
        DigitalVideoDisc a = new DigitalVideoDisc("Kratos");
        Book b = new Book(1,"A Song of Ice and Fire", "Epic fantasy", 99.99f, authors);
        mediae.add(a);
        mediae.add(b);

        for (Media m : mediae) {
            System.out.println(m.toString());
        }
    }
}

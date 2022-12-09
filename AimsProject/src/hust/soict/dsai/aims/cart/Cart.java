package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Cart {
//    private int qtyOrdered = 0;
    private static final int MAX_NUMBER_ORDERED = 20;
//    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private List<Media> itemsOrdered = new ArrayList<>();

//    public int getQtyOrdered() {
//        return qtyOrdered;
//    }

//    private void setQtyOrdered(int qtyOrdered) {
//        this.qtyOrdered = qtyOrdered;
//    }


//    public void addDigitalVideoDisc (DigitalVideoDisc disc) {
//        if (qtyOrdered < MAX_NUMBER_ORDERED) {
//            itemsOrdered[qtyOrdered++] = disc;
//            if (qtyOrdered == MAX_NUMBER_ORDERED) System.out.println("The cart is almost full");
//            System.out.println("The disc" + disc.getTitle() + "has been added");
//        }
//        else System.out.println("The cart is full");
//    }
    /**
     * If the cart is not full, add the media to the cart and print a message. If the cart is full, print a message
     *
     * @param e the media that is being added to the cart
     */
    public void addMedia(Media e) {
        if (itemsOrdered.size() < MAX_NUMBER_ORDERED) {
            if (itemsOrdered.contains(e)) {
                System.out.println("Item is already in cart");
                return;
            }
            itemsOrdered.add(e);
            System.out.println("The media " + e.getTitle() + " has been added");
            if (itemsOrdered.size() == MAX_NUMBER_ORDERED) System.out.println("The cart is full, you can't add any more items!");
        }
    }

    public void addMedia(Media[] mediaList) {
        if (itemsOrdered.size() == MAX_NUMBER_ORDERED || itemsOrdered.size() + mediaList.length > MAX_NUMBER_ORDERED)
            System.out.println("The order is full.");
        else Collections.addAll(itemsOrdered, mediaList);
    }


//    public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
//        if (getQtyOrdered() == 0) System.out.println("The order is empty, there are no disks to be removed");
//        else {
//            for (int i = 0; i < getQtyOrdered(); i++) {
//                if (itemsOrdered[i].getTitle().compareToIgnoreCase(disc.getTitle()) == 0) { // Compare 2 titles.
//                    {
//                        for(int j=i; j<qtyOrdered-1; j++)
//                            itemsOrdered[j] = itemsOrdered[j+1];
//                        itemsOrdered[qtyOrdered] = null;
//                        qtyOrdered--;
//                        System.out.println("Disc has been removed");
//                        break;
//                    }
//                }
//            }
//        }
//    }
    /**
     * This function removes a media from the order
     *
     * @param e The media to be removed
     */
    public void removeMedia(Media e) {
        int tmp = 0;
        if (itemsOrdered.isEmpty()) System.out.println("The order is empty, there are no disks to be removed");
        else {
            for (Media items : itemsOrdered) {
                if (items.getTitle().compareToIgnoreCase(e.getTitle()) == 0) {
                    {
                        itemsOrdered.remove(items);
                        System.out.println("Media has been removed");
                        tmp = 1;
                        break;
                    }
                }
            }
        }
        if (tmp == 0) System.out.println("Media not found within the order");
    }

    public List<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    /**
     * This function returns the total cost of the order.
     *
     * @return The total cost of the items in the order.
     */
    public float cost() {
        float totalCost = 0;
        for (Media items : itemsOrdered) {
            totalCost += items.getCost();
        }
        return totalCost;
    }

    /**
     * This function prints out the items in the cart, the total cost of the items in the cart, and the total number of
     * items in the cart
     */
    public void print() {
        System.out.println("/////////////");
        System.out.println("Ordered Items:");
        for (Media items : itemsOrdered) {
            System.out.println(items.toString());
        }
        System.out.printf("\nTotal cost: " + cost());
        System.out.println();
        System.out.println("/////////////");
    }

    /**
     * This function searches the itemsOrdered array for a media item with a title that matches the string passed in as a
     * parameter
     *
     * @param string The string to search for
     * @return A boolean value.
     */
    public boolean SearchByString(String string) {
        for (Media item : itemsOrdered) {
            if(item.getTitle().compareToIgnoreCase(string) == 0)
                return true;
        }
        return false;
    }

    /**
     * > This function searches for an item in the itemsOrdered array by its id
     *
     * @param id The id of the item to be searched for.
     * @return A boolean value.
     */
    public boolean SearchByID(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id) return true;
        }
        return false;
    }
}

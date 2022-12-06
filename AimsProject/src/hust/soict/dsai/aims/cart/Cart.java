package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Cart {
    private int qtyOrdered = 0;
    private static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    private void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    /**
     * If the cart is not full, add the disc to the cart and print a message. If the cart is full, print a message
     *
     * @param disc The disc to be added to the cart
     */
    public void addDigitalVideoDisc (DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered++] = disc;
            if (qtyOrdered == MAX_NUMBER_ORDERED) System.out.println("The cart is almost full");
            System.out.println("The disc" + disc.getTitle() + "has been added");
        }
        else System.out.println("The cart is full");
    }

    /**
     * If the order is not empty, then for each item in the order, if the title of the item is the same as the title of the
     * disc to be removed, then for each item after the item to be removed, set the item to the item after it, and then
     * decrement the quantity of items ordered and set the last item to null
     *
     * @param disc The disc to be removed.
     */
    public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
        if (getQtyOrdered() == 0) System.out.println("The order is empty, there are no disks to be removed");
        else {
            for (int i = 0; i < getQtyOrdered(); i++) {
                if (itemsOrdered[i].getTitle().compareToIgnoreCase(disc.getTitle()) == 0) { // Compare 2 titles.
                    {
                        for(int j=i; j<qtyOrdered-1; j++)
                            itemsOrdered[j] = itemsOrdered[j+1];
                        itemsOrdered[qtyOrdered] = null;
                        qtyOrdered--;
                        System.out.println("Disc has been removed");
                        break;
                    }
                }
            }
        }
    }

    /**
     * This function returns the total cost of the order.
     *
     * @return The total cost of the items in the order.
     */
    public float cost() {
        float totalCost = 0;
        for (int i = 0; i < getQtyOrdered(); i++) {
            totalCost += itemsOrdered[i].getCost();
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
        for (int i = 0; i < getQtyOrdered(); i++) {
            System.out.printf(itemsOrdered[i].toString());
        }
        System.out.printf("\nTotal cost: " + cost());
        System.out.println();
        System.out.println("/////////////");
    }

    /**
     * This function searches through the array of itemsOrdered and returns true if the string passed in matches any of the
     * itemsOrdered
     *
     * @param string The string to search for.
     * @return The boolean value of the search.
     */
    public boolean SearchByString(String string) {
        for (int i = 0; i < getQtyOrdered(); i++) {
            if(itemsOrdered[i].isMatch(string))
                return true;
        }
        return false;
    }

    /**
     * > This function searches the array of itemsOrdered for an item with a matching id
     *
     * @param id The id of the item to be searched for
     * @return A boolean value.
     */
    public boolean SearchByID(int id) {
        for (int i = 0; i < getQtyOrdered(); i++) {
            if (itemsOrdered[i].isMatchid(id)) return true;
        }
        return false;
    }
}

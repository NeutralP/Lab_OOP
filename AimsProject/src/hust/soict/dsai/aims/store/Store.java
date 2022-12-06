package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Store {
    public DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBER_DISK];
    private static final int MAX_NUMBER_DISK = 100;
    private int qty = 0;


    /**
     * Add a DVD to the store.
     *
     * @param disc The DVD to add to the store.
     */
    public void addDVD (DigitalVideoDisc disc) {
        if (qty >= MAX_NUMBER_DISK)
            System.out.println("Store is full");
        else {
            itemsInStore[qty++] = disc;
            System.out.println("The disc" + disc.getTitle() + "has been added");
            if (qty == MAX_NUMBER_DISK) // Warning after disc has been added
                System.out.println("System is full");
        }
    }

    /**
     * If the store is not empty, then for each item in the store, if the title of the item is the same as the title of the
     * disc, then for each item after the item, set the item to the item after it, then decrement the quantity of items in
     * the store, then set the last item in the store to null, then print that the disc has been removed, then break out of
     * the loop
     *
     * @param disc The disc to be removed.
     */
    public void removeDVD (DigitalVideoDisc disc) {
        if (getQty() == 0) System.out.println("The store is empty, there are no disks to be removed");
        else {
            for (int i = 0; i < getQty(); i++) {
                if (itemsInStore[i].getTitle().compareToIgnoreCase(disc.getTitle()) == 0) { // Compare 2 titles.
                    {
                        for(int j=i; j<qty-1; j++)
                            itemsInStore[j] = itemsInStore[j+1];
                        itemsInStore[qty] = null;
                        qty--;
                        System.out.println("Disc " + disc.getTitle() + " has been removed");
                        break;
                    }
                }
            }
        }
    }

    public void print() {
        System.out.println("/////////////");
        System.out.println("Ordered Items:");
        for (int i = 0; i < getQty(); i++) {
            System.out.printf(itemsInStore[i].toString());
        }
        System.out.println();
        System.out.println("/////////////");
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}

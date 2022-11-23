package Lab02;

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
     * If the cart is not full, add the disc to the cart and print a message.
     *
     * @param dvdList the array of DigitalVideoDisc objects
     */
    public void addDigitalVideoDisc (DigitalVideoDisc [] dvdList) {
        if (getQtyOrdered() + dvdList.length <= MAX_NUMBER_ORDERED) {
            for (int i = 0; i < dvdList.length; i++) {
//              setQtyOrdered(getQtyOrdered() + 1);
                itemsOrdered[getQtyOrdered() + i] = dvdList[i];
            }
            setQtyOrdered(getQtyOrdered() + dvdList.length);
            // If cart is full after the addition, print out to the console
            if (getQtyOrdered() == MAX_NUMBER_ORDERED)
                System.out.println("The cart is full, please remove discs if you want to add another");
        }
        else System.out.println("You can't add to cart, max number order able reached, please try again");
    }


    /**
     * This function adds two DVDs to the collection.
     *
     * @param dvd1 The first DVD to add to the collection.
     * @param dvd2 The second DVD to add to the collection.
     */
    public void addDigitalVideoDisc (DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        this.addDigitalVideoDisc(dvd1);
        this.addDigitalVideoDisc(dvd2);
    }

    /**
     * If the order is not empty, then for each item in the order, if the title of the item is the same as the title of the
     * disc to be removed, then for each item after the item to be removed, set the item to the item after it, and then
     * decrement the quantity of items ordered and set the last item to null
     *
     * @param disc The disc to be removed.
     */
    public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
        if (this.qtyOrdered == 0) System.out.println("The order is empty, there are no disks to be removed");
        else {
            for (int i = 0; i < this.qtyOrdered; i++) {
                if (itemsOrdered[i].getTitle().compareToIgnoreCase(disc.getTitle()) == 0) { // Compare 2 titles.
                    {
                        for(int j=i; j<this.qtyOrdered-1; j++)
                            itemsOrdered[j] = itemsOrdered[j+1];
//                        setQtyOrdered(getQtyOrdered() - 1);
                        itemsOrdered[this.qtyOrdered--] = null;
                        System.out.println("Disc has been removed");
                        break;
                    }
                }
            }
        }
    }

    public float cost() {
        float totalCost = 0;
        for (int i = 0; i < getQtyOrdered(); i++) {
            totalCost += itemsOrdered[i].getCost();
        }
        return totalCost;
    }
    public Cart() {
    }

    public void displayCart() {
        System.out.println("/////////////");
        System.out.println("Cart display");
        for (int i = 0; i < getQtyOrdered(); i++) {
            System.out.printf((i+1) + ". " + itemsOrdered[i].getTitle() + "\n");
            System.out.printf("Director: " + itemsOrdered[i].getDirector() + "\n");
            System.out.printf("Cost: " + itemsOrdered[i].getLength() + "\n");
        }
        System.out.println();
        System.out.println("/////////////");
    }
}

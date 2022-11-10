package Lab02;

public class Cart {
    private int qtyOrdered = 0;
    private static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    private void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public void addDigitalVideoDisc (DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered++] = disc;
            if (qtyOrdered == MAX_NUMBER_ORDERED) System.out.println("The cart is almost full");
            System.out.println("The disc" + disc.getTitle() + "has been added");
        }
        else System.out.println("The cart is full");
    }

    public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
        if (qtyOrdered == 0) System.out.println("The order is empty, there are no disks to be removed");
        else {
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemsOrdered[i] == disc) { // Still unsure whether this works
                    {
                        for(int j=i; j<qtyOrdered-1; j++)
                            itemsOrdered[j] = itemsOrdered[j+1];
                        itemsOrdered[--qtyOrdered] = null;
                        System.out.println("Disc has been removed");
                        break;
                    }
                }
            }
        }
    }

    public float cost() {
        float totalCost = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            totalCost += itemsOrdered[i].getCost();
        }
        return totalCost;
    }
    public Cart() {
    }

    public void displayCart() {
        System.out.println("/////////////");
        System.out.println("Cart display");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.printf((i+1) + ". " + itemsOrdered[i].getTitle() + "\n");
            System.out.printf("Director: " + itemsOrdered[i].getDirector() + "\n");
            System.out.printf("Cost: " + itemsOrdered[i].getLength() + "\n");
        }
        System.out.println();
        System.out.println("/////////////");
    }
}
package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();
    private static final int MAX_NUMBER_DISK = 100;


//    public void addDVD (DigitalVideoDisc disc) {
//        if (qty >= MAX_NUMBER_DISK)
//            System.out.println("Store is full");
//        else {
//            itemsInStore[qty++] = disc;
//            System.out.println("The disc" + disc.getTitle() + "has been added");
//            if (qty == MAX_NUMBER_DISK) // Warning after disc has been added
//                System.out.println("System is full");
//        }
//    }
    public void addMedia (Media newMedia) {
        if (itemsInStore.size() >= MAX_NUMBER_DISK)
            System.out.println("Store is full");
        else {
            itemsInStore.add(newMedia);
            System.out.println("Media " + newMedia.getTitle() + " has been added");
            if (itemsInStore.size() == MAX_NUMBER_DISK) // Warning if store has reached max number of media
                System.out.println("You can't add any more media");
        }
    }

//    public void removeDVD (DigitalVideoDisc disc) {
//        if (getQty() == 0) System.out.println("The store is empty, there are no disks to be removed");
//        else {
//            for (int i = 0; i < getQty(); i++) {
//                if (itemsInStore[i].getTitle().compareToIgnoreCase(disc.getTitle()) == 0) { // Compare 2 titles.
//                    {
//                        for(int j=i; j<qty-1; j++)
//                            itemsInStore[j] = itemsInStore[j+1];
//                        itemsInStore[qty] = null;
//                        qty--;
//                        System.out.println("Disc " + disc.getTitle() + " has been removed");
//                        break;
//                    }
//                }
//            }
//        }
//    }
    /**
     * If the store is not empty, then for each media in the store, if the media title matches the title of the media to be
     * removed, then remove the media from the store and print a message saying that the media has been removed. If the
     * media is not matched with any media in the store, then print a message saying that the media is not matched with any
     * media in the store
     *
     * @param removeMedia The media to be removed from the store.
     */
    public void removeMedia (Media removeMedia) {
        if (itemsInStore.isEmpty()) System.out.println("The store is empty, there are no disks to be removed");
        else {
            for (Media media : itemsInStore) {
                if (media.getTitle().compareToIgnoreCase(removeMedia.getTitle()) == 0) {
                    itemsInStore.remove(media);
                    System.out.println("Media " + removeMedia.getTitle() + " has been removed");
                    break;
                }
            }
        }
    }

    public void print() {
        System.out.println("/////////////");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsInStore.size(); i++) {
            System.out.printf(itemsInStore.get(i).toString());
        }
        System.out.println("/////////////");
    }
}

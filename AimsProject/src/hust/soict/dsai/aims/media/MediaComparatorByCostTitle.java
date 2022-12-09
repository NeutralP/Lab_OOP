package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media o1, Media o2) {
        if (o1.cost > o2.cost)
            return 1;
        if (o1.cost < o2.cost)
            return -1;
        if (o1.cost == o2.cost)
            return o1.title.compareToIgnoreCase(o2.title);
        return 0;
    }
}

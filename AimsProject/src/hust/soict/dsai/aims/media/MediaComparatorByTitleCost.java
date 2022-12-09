package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media o1, Media o2) {
        if (o1.title.compareToIgnoreCase(o2.title) != 0)
            return o1.title.compareToIgnoreCase(o2.title);
        else {
            if (o1.cost > o2.cost)
                return 1;
            if (o1.cost < o2.cost)
                return -1;
        }
        return 0;
    }
}

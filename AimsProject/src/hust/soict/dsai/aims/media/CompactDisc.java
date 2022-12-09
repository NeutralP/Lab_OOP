package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public String getArtist() {
        return artist;
    }

    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist, ArrayList<Track> tracks) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    /**
     * If the track is not already on the album, add it
     *
     * @param newTrack The track to be added to the album.
     */
    public void addTrack(Track newTrack) {
        for (Track track : tracks) {
            if (track.getTitle().equalsIgnoreCase(newTrack.getTitle())) {
                System.out.println("Track is already on the album!");
                return;
            }
        }
        tracks.add(newTrack);
    }

    /**
     * If the track is on the album, remove it.
     *
     * @param removeTrack The track to be removed from the album.
     */
    public void removeTrack(Track removeTrack) {
        for (Track track : tracks) {
            if (track.getTitle().equalsIgnoreCase(removeTrack.getTitle())) {
                tracks.remove(track);
                return;
            }
        }
        System.out.println("Track is not on the album!");
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    /**
     * Play the CD by playing each track on the CD.
     */
    @Override
    public void play() {
        // show CD info:
        System.out.println("Artist: " + this.getArtist());
        for (Track track : tracks) {
            track.play();
        }
    }

    @Override
    public String toString() {
        return "CompactDisc{" +
                "artist='" + artist + '\'' +
                ", tracks=" + tracks +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                '}';
    }
}
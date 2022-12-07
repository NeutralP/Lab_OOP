package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media implements Playable {
    private String director;
    private int length;
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title) {
        super(title);
    }

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }


    /**
     * The toString() method returns a string representation of the object
     *
     * @return The id, title, category, director, length, and cost of the DVD.
     */
    public String toString() {
        return (this.getId() + 1) + ". DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.director + " - " + this.length + " - " + this.getCost() + "\n";
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category);
        this.director = director;
        this.length = length;
        this.setCost(cost);
        this.setId(nbDigitalVideoDiscs++);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category);
        this.setCost(cost);
        this.setId(nbDigitalVideoDiscs++);
    }

    /**
     * If the title of the book is the same as the title passed in, return true, otherwise return false.
     *
     * @param title The title of the book
     * @return A boolean value.
     */
    public boolean isMatch(String title) {
        return title.compareToIgnoreCase(this.getTitle()) == 0;
    }

    public boolean isMatchid(int id) {
        return id == this.getId();
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}

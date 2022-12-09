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


    @Override
    public String toString() {
        return "DigitalVideoDisc{" +
                "director='" + director + '\'' +
                ", length=" + length +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                '}';
    }

    /**
     * The toString() method returns a string representation of the object
     *
     * @return The id, title, category, director, length, and cost of the DVD.
     */


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
     * This function prints out the title and length of the DVD.
     */
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}

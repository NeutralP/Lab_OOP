package Lab02;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    private static int nbDigitalVideoDiscs = 0;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    /**
     * The toString() method returns a string representation of the object
     *
     * @return The id, title, category, director, length, and cost of the DVD.
     */
    public String toString() {
        return (this.id + 1) + ". DVD - " + this.title + " - " + this.category + " - " + this.director + " - " + this.length + " - " + this.cost + "\n";
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    /**
     * If the title of the book is the same as the title passed in, return true, otherwise return false.
     *
     * @param title The title of the book
     * @return A boolean value.
     */
    public boolean isMatch(String title) {
        if(title.compareToIgnoreCase(this.title) == 0)
            return true;
        return false;
    }

    public boolean isMatchid(int id) {
        return id == this.id;
    }
}

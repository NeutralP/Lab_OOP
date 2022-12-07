package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<>();
    public List<String> getAuthors() {
        return authors;
    }
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    /**
     * If the author is already in the list, do nothing. Otherwise, add the author to the list.
     *
     * @param authorName The name of the author to add to the book.
     */
    public void addAuthor(String authorName) {
        for(String author : authors) {
            if (author.equalsIgnoreCase(authorName)) {
                return;
            }
        }
        authors.add(authorName);
    }

    /**
     * Remove the author from the list of authors.
     *
     * @param authorName The name of the author to remove from the book.
     */
    public void removeAuthor(String authorName) {
        for(String author : authors) {
            if (author.equalsIgnoreCase(authorName)) {
                authors.remove(author);
            }
        }
        return;
    }

    public Book(int id, String title, String category, float cost, List<String> authors) {
        super(id, title, category, cost);
        this.authors = authors;
    }
}

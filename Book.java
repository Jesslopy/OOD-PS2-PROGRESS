/*
 * creates a book class
 *
 * --Alexander Jessop--
 */

import java.util.Set;
import java.util.LinkedHashSet;

public abstract class Book implements Comparable<Book> {
    private String title;
    private int pages;
    private String color;
    private int rating;

    // Getter and Setter for pages
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    
    // ... other instance variables ...

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }


    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        // Existing toString implementation...
        return super.toString() + "\nrating " + rating;
    }

    public abstract int randomRating(); // New abstract method
}


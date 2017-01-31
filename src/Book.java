/**
 * Created by CarlosSanchez on 1/31/17.
 * Simple POJO to be used as an example to apply the custom annotation.
 */
public class Book {
    private String author;
    private String title;
    private String isbn;
    private double price;
    private int numberOfPages;

    public Book(){}

    @ItemDoc(desc = "This is a simple toString() method that gives a proper " +
            "String representation of any Book instance object",
            params = "This Method takes no Parameters",
            returns = "The String Representation of the Object")
    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", price=" + price +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}

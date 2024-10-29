package librarymanagement;
public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    private String description;
    private int price;

    public Book(String title, String author, String description, int price) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.description = description;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

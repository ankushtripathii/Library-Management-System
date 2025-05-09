package models;

public class Book {
    private String id;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;

    // Constructor
    public Book(String id, String title, String author, String genre, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    // Override toString() for better display
    @Override
    public String toString() {
        return "Book{" +
                "ID='" + id + '\'' +
                ", Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", Genre='" + genre + '\'' +
                ", Availability=" + (isAvailable ? "Available" : "Checked Out") +
                '}';
    }
}

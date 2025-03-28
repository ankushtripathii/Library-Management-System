package services;

import models.Book;
import java.util.*;

public class LibraryManager {
    private final Map<String, Book> books = new HashMap<>();

    // Add a Book to Library
    public void addBook(String id, String title, String author, String genre, boolean isAvailable) {
        if (books.containsKey(id)) {
            System.out.println("❌ Book ID already exists! Try a different ID.");
            return;
        }
        books.put(id, new Book(id, title, author, genre, isAvailable));
        System.out.println("✅ Book added successfully!");
    }

    // View All Books
    public void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("📂 No books in the library.");
        } else {
            System.out.println("\n📚 Library Books:");
            for (Book book : books.values()) {
                System.out.println(book);
            }
        }
    }

    // Search Book by ID or Title
    public void searchBook(String query) {
        boolean found = false;
        for (Book book : books.values()) {
            if (book.getId().equalsIgnoreCase(query) || book.getTitle().equalsIgnoreCase(query)) {
                System.out.println("🔍 Found Book: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("❌ No book found with ID/Title: " + query);
        }
    }

    // Update Book Details
    public void updateBook(String id, String newTitle, String newAuthor, String newGenre, boolean newAvailability) {
        Book book = books.get(id);
        if (book != null) {
            book.setTitle(newTitle);
            book.setAuthor(newAuthor);
            book.setGenre(newGenre);
            book.setAvailable(newAvailability);
            System.out.println("✅ Book updated successfully!");
        } else {
            System.out.println("❌ Book not found!");
        }
    }

    // Delete a Book
    public void deleteBook(String id) {
        if (books.remove(id) != null) {
            System.out.println("🗑️ Book deleted successfully!");
        } else {
            System.out.println("❌ Book not found!");
        }
    }
}


import services.LibraryManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n📖 Library Management System");
            System.out.println("1️⃣ Add Book");
            System.out.println("2️⃣ View All Books");
            System.out.println("3️⃣ Search Book");
            System.out.println("4️⃣ Update Book");
            System.out.println("5️⃣ Delete Book");
            System.out.println("6️⃣ Exit");
            System.out.print("👉 Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("📌 Enter Book ID: ");
                    String id = scanner.nextLine();
                    System.out.print("📌 Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("📌 Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("📌 Enter Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("📌 Is Available (true/false): ");
                    boolean available = scanner.nextBoolean();
                    library.addBook(id, title, author, genre, available);
                }
                case 2 -> library.viewAllBooks();
                case 3 -> {
                    System.out.print("🔍 Enter Book ID or Title to search: ");
                    String query = scanner.nextLine();
                    library.searchBook(query);
                }
                case 4 -> {
                    System.out.print("📌 Enter Book ID to update: ");
                    String id = scanner.nextLine();
                    System.out.print("📌 New Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("📌 New Author: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("📌 New Genre: ");
                    String newGenre = scanner.nextLine();
                    System.out.print("📌 Is Available (true/false): ");
                    boolean newAvailability = scanner.nextBoolean();
                    library.updateBook(id, newTitle, newAuthor, newGenre, newAvailability);
                }
                case 5 -> {
                    System.out.print("📌 Enter Book ID to delete: ");
                    String id = scanner.nextLine();
                    library.deleteBook(id);
                }
                case 6 -> {
                    System.out.println("👋 Exiting Library System. Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("❌ Invalid choice! Try again.");
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Pre-added sample books and users
        library.addBook(new Book(1, "The Alchemist", "Paulo Coelho"));
        library.addBook(new Book(2, "1984", "George Orwell"));
        library.registerUser(new User(1, "Alice"));
        library.registerUser(new User(2, "Bob"));

        int choice;
        do {
            System.out.println("\n--- Library Management Menu ---");
            System.out.println("1. Show Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Add Book");
            System.out.println("5. Register User");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.showBooks();
                    break;
                case 2:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    library.issueBook(bookId, userId);
                    break;
                case 3:
                    System.out.print("Enter Book ID: ");
                    int returnId = scanner.nextInt();
                    library.returnBook(returnId);
                    break;
                case 4:
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(id, title, author));
                    break;
                case 5:
                    System.out.print("Enter User ID: ");
                    int userID = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter User Name: ");
                    String name = scanner.nextLine();
                    library.registerUser(new User(userID, name));
                    break;
                case 0:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        scanner.close();
    }
}

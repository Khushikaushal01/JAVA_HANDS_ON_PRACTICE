import java.util.Arrays;

public class LibraryTest {
    public static void main(String[] args) {
        System.out.println("=== Testing Library Management System ===");

        
        Book[] books = {
            new Book("B003", "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book("B001", "To Kill a Mockingbird", "Harper Lee"),
            new Book("B005", "1984", "George Orwell"),
            new Book("B002", "Pride and Prejudice", "Jane Austen"),
            new Book("B004", "The Catcher in the Rye", "J.D. Salinger")
        };

        String searchTitle = "The Great Gatsby";

        
        System.out.println("--- Linear Search Test ---");
        Book foundLinear = LibrarySearch.linearSearchByTitle(books, searchTitle);
        System.out.println("Searching for title: \"" + searchTitle + "\"");
        if (foundLinear != null) {
            System.out.println("Found (Linear): " + foundLinear);
        } else {
            System.out.println("Book not found (Linear).");
        }
        System.out.println();

        
        System.out.println("Sorting books by title for Binary Search...");
        Arrays.sort(books);
        System.out.println("Sorted Books:");
        for (Book b : books) {
            System.out.println("  " + b);
        }
        System.out.println();

        
        System.out.println("--- Binary Search Test ---");
        Book foundBinary = LibrarySearch.binarySearchByTitle(books, searchTitle);
        System.out.println("Searching for title: \"" + searchTitle + "\"");
        if (foundBinary != null) {
            System.out.println("Found (Binary): " + foundBinary);
        } else {
            System.out.println("Book not found (Binary).");
        }

        System.out.println("=== Library Management System Test Complete ===");
    }
}

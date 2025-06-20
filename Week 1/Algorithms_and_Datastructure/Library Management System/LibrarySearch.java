import java.util.Arrays;
import java.util.Comparator;

public class LibrarySearch {

    // Linear search by title
    public static Book linearSearch(Book[] books, String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary search by title (assumes sorted by title)
    public static Book binarySearch(Book[] books, String title) {
        int low = 0, high = books.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = books[mid].title.compareToIgnoreCase(title);
            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "The Alchemist", "Paulo Coelho"),
            new Book(2, "Atomic Habits", "James Clear"),
            new Book(3, "Clean Code", "Robert C. Martin"),
            new Book(4, "Zero to One", "Peter Thiel")
        };

        // Sort books for binary search
        Arrays.sort(books, Comparator.comparing(b -> b.title));

        System.out.println("-- Linear Search: 'Atomic Habits' --");
        Book result1 = linearSearch(books, "Atomic Habits");
        if (result1 != null) result1.printDetails();
        else System.out.println("Book not found");

        System.out.println("\n-- Binary Search: 'Zero to One' --");
        Book result2 = binarySearch(books, "Zero to One");
        if (result2 != null) result2.printDetails();
        else System.out.println("Book not found");
    }
}

public class Book {
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public void printDetails() {
        System.out.println("Book ID: " + bookId + ", Title: " + title + ", Author: " + author);
    }
}

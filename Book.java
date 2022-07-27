/** A class modeling a book. */
public class Book {
    String title;
    String author;

    /** Create a new book with title b. */
    public Book(String title, String author) {
        this.title= title;
	this.author= author;
    }

    /** Print this book. */
    public void printBook() {
        System.out.println(title+" "+author);
    }

    /** Some book examples. */
    public static void main(String[] args) {
        Book b = new Book("Gone With the Wind", "Margaret Mitchell");
        b.printBook();
    }
}

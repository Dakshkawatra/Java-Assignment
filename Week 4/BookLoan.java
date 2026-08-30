public class BookLoan {

    public static void main(String[] args) {

        Book javaBook = new Book("Basics of Java", "DS Prakash", "10201");
        Book cppBook = new Book("Concepts of C++", "Narendar", "10204");

        System.out.println(" Library Book Status Before Borrowing/Returning");
        displayBook(javaBook);
        displayBook(cppBook);

        System.out.println("\n Borrowing Java Book ");
        System.out.println(javaBook.borrowBook());
        System.out.println("Current status: " + javaBook.isAvailable());

        System.out.println("\nTrying to borrow the same book:");
        System.out.println(javaBook.borrowBook());

        System.out.println("\nReturning Java Book ");
        System.out.println(javaBook.returnBook());
        System.out.println("Current status: " + javaBook.isAvailable());

        System.out.println("\nTrying to return it once more:");
        System.out.println(javaBook.returnBook());

        System.out.println("\n Borrowing C++ Book ");
        System.out.println(cppBook.borrowBook());

        System.out.println("\n Updated Library Status ");
        displayBook(javaBook);
        displayBook(cppBook);

        System.out.println("\n=== Java Book Details ===");
        System.out.println("Name      : " + javaBook.getTitle());
        System.out.println("Writer    : " + javaBook.getAuthor());
        System.out.println("Code      : " + javaBook.getBookCode());
        System.out.println("Can Borrow: " + javaBook.isAvailable());
    }

    static void displayBook(Book book) {
        System.out.println(book);
    }
}
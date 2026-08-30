class Book {

    private String title;
    private String author;
    private String bookCode;
    private boolean loaned;

    Book(String title, String author, String bookCode) {

        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        }
        else {
            this.title = "Unknown";
        }

        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        }
        else {
            this.author = "Unknown";
        }

        if (bookCode != null && !bookCode.trim().isEmpty()) {
            this.bookCode = bookCode;
        }
        else {
            this.bookCode = "Unknown";
        }

        loaned = false;
    }

    boolean borrowBook() {

        if (loaned == false) {
            loaned = true;
            return true;
        }

        return false;
    }

    boolean returnBook() {

        if (loaned == true) {
            loaned = false;
            return true;
        }

        return false;
    }

    boolean isAvailable() {

        if (loaned == false) {
            return true;
        }

        return false;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    String getBookCode() {
        return bookCode;
    }

    @Override
    public String toString() {

        return "Book{title=" + title
                + ", author=" + author
                + ", bookCode=" + bookCode
                + ", available=" + isAvailable() + "}";
    }
}
public class Book {
    private String bookName;
    private Author author;
    private int publicationYear;

    public Book(String bookName, Author author, int publicationYear) {
        this.bookName = bookName;
        this.author = author;
        this.publicationYear = publicationYear;
    }
        public String getBookName() {
            return bookName;
        }
        public Author getAuthor() {
            return author;
        }
        public int getPublicationYear() {
            return publicationYear;
        }
        public void setPublication(int publicationYear) {
            this.publicationYear = publicationYear;
        }


}


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
        public void setPublicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
        }
    @Override
    public String toString () {
        return "Book " + getBookName() + " " + getAuthor() + " " + getPublicationYear();
        }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return author.equals(c2.author);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(author);
    }

}


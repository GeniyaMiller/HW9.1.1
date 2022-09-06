public class Author {
    private String authorName;
    private String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return  authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }
@Override
    public String toString () {
        return "Author " + getAuthorName() + " " + getAuthorSurname();
}
@Override
public boolean equals(Object other) {
    if (this.getClass() != other.getClass()) {
        return false;
    }
    Author c2 = (Author) other;
    return authorSurname.equals(c2.authorSurname);
}

    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorSurname);
    }
 }

public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Lev", "Tolstoy");
        Author nicolayGogol = new Author("Nicolay", "Gogol");
        System.out.println("Author " + levTolstoy.getAuthorName() + " " + levTolstoy.getAuthorSurname());
        System.out.println("Author " + nicolayGogol.getAuthorName() + " " + nicolayGogol.getAuthorSurname());

        Book warAndWorld = new Book("War and World", levTolstoy, 1865);
        Book deadSouls = new Book("Dead Souls", nicolayGogol, 1842);
        System.out.println("Book " + warAndWorld.getBookName() + " " + levTolstoy.getAuthorName() + " " + levTolstoy.getAuthorSurname() + " " + warAndWorld.getPublicationYear());
        System.out.println("Book " + deadSouls.getBookName() + " " + nicolayGogol.getAuthorName() + " " + nicolayGogol.getAuthorSurname() + " " + deadSouls.getPublicationYear());


    }
}
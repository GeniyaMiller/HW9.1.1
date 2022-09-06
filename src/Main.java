public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Lev", "Tolstoy");
        Author nicolayGogol = new Author("Nicolay", "Gogol");
        System.out.println(levTolstoy);
        System.out.println(nicolayGogol);

        System.out.println(levTolstoy.equals(nicolayGogol));

        Book warAndWorld = new Book("War and World", levTolstoy, 1865);
        Book deadSouls = new Book("Dead Souls", nicolayGogol, 1842);
        System.out.println(warAndWorld);
        System.out.println(deadSouls);
        System.out.println(warAndWorld.equals(deadSouls));

        warAndWorld.setPublicationYear (2012);
        System.out.println(warAndWorld);


    }
}
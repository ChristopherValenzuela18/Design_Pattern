public class Main {
    public static void main(String[] args) {

       BookDatabase database = BookDatabase.getInstance();
        database.addBook(1, "zombies");
        database.addBook(2, "pinochio");
        database.addBook(3, "harry potter");
        database.viewBooks();
        database.removeBook(2);
        database.viewBooks();
    }
}
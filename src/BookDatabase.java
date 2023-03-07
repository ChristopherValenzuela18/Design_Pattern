import java.util.HashMap;
import java.util.Map;

public class BookDatabase {

    private static BookDatabase instance;
    private Map<Integer, String> database;

    private BookDatabase() {
        database = new HashMap<>();
    }

    public static BookDatabase getInstance() {
        if (instance == null) {
            instance = new BookDatabase();
        }
        return instance;
    }

    public void addBook(int id, String title) {
        database.put(id, title);
    }

    public void viewBooks() {
        for (int id : database.keySet()) {
            System.out.println("ID: " + id + ", Title: " + database.get(id));
        }
    }

    public void removeBook(int id) {
        database.remove(id);
    }
}

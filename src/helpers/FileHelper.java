package helpers;

public class FileHelper {
    private String filename;
    private PizzaHelper pizzaHelper;

    public FileHelper(String filename) {
        this.filename = filename;
        pizzaHelper = new PizzaHelper();
    }
}

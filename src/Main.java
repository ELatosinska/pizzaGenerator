import generators.PizzaGenerator;
import helpers.FileHelper;
import model.Size;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PizzaGenerator pizzaGenerator = new PizzaGenerator();
        FileHelper fileHelper = new FileHelper("pizza.txt");
        fileHelper.saveListToFile(
                List.of(pizzaGenerator.generatePizza(false, Size.MEDIUM, 8),
                        pizzaGenerator.generatePizza(true, Size.SMALL, 3))
        );
        var pizzas = fileHelper.readListFromFile();
    }
}
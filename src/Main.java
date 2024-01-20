import generators.PizzaGenerator;
import helpers.FileHelper;
import helpers.PizzaPriceHelper;
import model.Size;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PizzaGenerator pizzaGenerator = new PizzaGenerator();
        FileHelper fileHelper = new FileHelper("pizza.txt");
        fileHelper.saveListToFile(
                List.of(pizzaGenerator.generatePizza(false, Size.LARGE, 5),
                        pizzaGenerator.generatePizza(false, Size.GIANT, 5))
        );
        var pizzas = fileHelper.readListFromFile();
        System.out.println(new PizzaPriceHelper().calculatePrice(pizzas.get(0)));
    }
}
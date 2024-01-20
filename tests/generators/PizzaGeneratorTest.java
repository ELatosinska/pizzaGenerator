package generators;

import generators.PizzaGenerator;
import model.Ingredient;
import model.Pizza;
import model.Size;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class PizzaGeneratorTest {
    PizzaGenerator pizzaGenerator = new PizzaGenerator();

    @Test
    void generatesVegePizza() {
        Pizza pizza = pizzaGenerator.generatePizza(true, Size.SMALL);
        assertTrue(pizza.getIngredients().stream().allMatch(Ingredient::isVegetarian));
    }


}

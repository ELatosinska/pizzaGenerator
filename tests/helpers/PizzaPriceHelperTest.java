package helpers;

import helpers.PizzaPriceHelper;
import model.Ingredient;
import model.Pizza;
import model.Size;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaPriceHelperTest {

    PizzaPriceHelper pizzaPriceHelper = new PizzaPriceHelper();

    @Test
    public void isPriceCorrect() {
        Pizza pizza = new Pizza();
        pizza.setSize(Size.SMALL);
        pizza.getIngredients().add(new Ingredient("oliwki", true));
        pizza.getIngredients().add(new Ingredient("papryka", true));
        pizza.getIngredients().add(new Ingredient("salami", false));
        pizza.getIngredients().add(new Ingredient("kukurydza", true));

        assertEquals(30, pizzaPriceHelper.calculatePrice(pizza));
    }
}

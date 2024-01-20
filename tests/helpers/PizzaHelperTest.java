package helpers;

import helpers.PizzaHelper;
import model.Ingredient;
import model.Pizza;
import model.Size;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PizzaHelperTest {
    PizzaHelper pizzaHelper = new PizzaHelper();

    @Test
    void IsPizzaWithOnlyVegeIngredientsVege() {
        Pizza pizza = new Pizza(new ArrayList<>(List.of(
                new Ingredient("rukola", true),
                new Ingredient("pomidor", true),
                new Ingredient("oliwki zielone", true),
                new Ingredient("oliwki czarne", true),
                new Ingredient("ser feta", true))),
                Size.SMALL);
        assertTrue(pizzaHelper.isPizzaVegetarian(pizza));
    }
    @Test
    void vegePizzaWithMeatAddedIsNoLongerVege() {
        Pizza pizza = new Pizza(new ArrayList<>(List.of(
                new Ingredient("rukola", true),
                new Ingredient("pomidor", true),
                new Ingredient("oliwki zielone", true),
                new Ingredient("oliwki czarne", true),
                new Ingredient("ser feta", true))),
                Size.SMALL);
        pizza.getIngredients().add(new Ingredient("kurczak", false));
        assertFalse(pizzaHelper.isPizzaVegetarian(pizza));
    }
}

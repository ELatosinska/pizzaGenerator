package helpers;

import lombok.EqualsAndHashCode;
import model.Ingredient;
import model.Pizza;
import model.Size;

@EqualsAndHashCode
public class PizzaHelper {
    private IngredientsHelper ingredientsHelper;

    public PizzaHelper() {
        ingredientsHelper = new IngredientsHelper();
    }

    public boolean isPizzaVegetarian(Pizza pizza) {
        return pizza.getIngredients().stream()
                .allMatch(Ingredient::isVegetarian);
    }
    public String convertPizzaToString(Pizza pizza) {
        StringBuilder sb = new StringBuilder();
        sb.append(pizza.getSize()).append(";");
        sb.append(ingredientsHelper.convertListOfIngredientsToString(pizza.getIngredients()));
        return sb.toString();
    }

    public Pizza convertStringToPizza(String pizzaString) {
        Pizza pizza = new Pizza();
        var pizzaFields = pizzaString.split(";", 2);
        pizza.setSize(Size.valueOf(pizzaFields[0].toUpperCase()));
        pizza.setIngredients(ingredientsHelper.convertStringToListOfIngredients(pizzaFields[1]));
        return pizza;
    }
}

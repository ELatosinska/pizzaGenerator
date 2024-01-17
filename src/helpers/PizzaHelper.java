package helpers;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import model.Pizza;
import model.Size;

@EqualsAndHashCode
public class PizzaHelper {
    private IngredientsHelper ingredientsHelper;

    public PizzaHelper() {
        ingredientsHelper = new IngredientsHelper();
    }

    public String convertPizzaToString(Pizza pizza) {
        StringBuilder sb = new StringBuilder();
        sb.append(pizza.getSize());
        for(var ingredient : pizza.getIngredients()) {
            sb.append(ingredient);
        }
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

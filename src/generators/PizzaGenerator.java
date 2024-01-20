package generators;

import lombok.Getter;
import lombok.Setter;
import model.Pizza;
import model.Size;


public class PizzaGenerator {
    @Setter
    @Getter
    private int defaultAmountOfIngredients;

    private IngredientGenerator ingredientGenerator;

    public PizzaGenerator() {
        this.ingredientGenerator = new IngredientGenerator();
        this.defaultAmountOfIngredients = 5;
    }
    public Pizza generatePizza(boolean vegetarian, Size size) {
        return generatePizza(vegetarian, size, defaultAmountOfIngredients);
    }

    public Pizza generatePizza(boolean vegetarian, Size size, int amountOfIngredients) {
        Pizza pizza = new Pizza();
        pizza.setSize(size);
        pizza.setIngredients(ingredientGenerator.getRandomIngredients(amountOfIngredients, vegetarian));
        return pizza;
    }
}

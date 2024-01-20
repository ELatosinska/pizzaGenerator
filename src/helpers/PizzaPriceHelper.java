package helpers;

import lombok.*;
import model.Ingredient;
import model.Pizza;
@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class PizzaPriceHelper {
    private double costPerVegeIngredient;
    private double costPerMeatIngredient;
    private double baseCost;

    public PizzaPriceHelper() {
        this.baseCost = 25.0;
        this.costPerVegeIngredient = 1.0;
        this.costPerMeatIngredient = 2.0;
    }
    public double calculatePrice(Pizza pizza) {
        var amountOfVegeIngredients = pizza.getIngredients().stream().filter(Ingredient::isVegetarian).count();
        var amountOfMeatIngredients = pizza.getIngredients().size() - amountOfVegeIngredients;

        return (baseCost + costPerMeatIngredient*amountOfMeatIngredients + costPerVegeIngredient*amountOfVegeIngredients)
                *pizza.getSize().priceMultiplier;
    }
}

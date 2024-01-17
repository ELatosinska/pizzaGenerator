package helpers;

import model.Ingredient;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IngredientsHelper {
    public Ingredient convertStringToIngredient(String ingredientString) {
        String[] ingredientFields = ingredientString.split(",");
        Ingredient ingredient = new Ingredient();
        ingredient.setName(ingredientFields[0]);
        ingredient.setVegetarian(Objects.equals(ingredientFields[1], "vege"));
        return ingredient;
    }

    public List<Ingredient> convertStringToListOfIngredients(String ingredientsString) {
        List<Ingredient> ingredients = new ArrayList<>();
        var ingredientsArray = ingredientsString.split(";");
        for (var ingredient : ingredientsArray) {
            ingredients.add(convertStringToIngredient(ingredient));
        }
        return ingredients;
    }
}

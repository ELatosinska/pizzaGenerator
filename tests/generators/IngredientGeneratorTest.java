package generators;

import model.Ingredient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IngredientGeneratorTest {

    IngredientGenerator ingredientGenerator = new IngredientGenerator();

    @Test
    public void isGeneratingVegeIngredient() {
        Ingredient ingredient = ingredientGenerator.getRandomVegeIngredient();
        assertTrue(ingredient.isVegetarian());
    }
}

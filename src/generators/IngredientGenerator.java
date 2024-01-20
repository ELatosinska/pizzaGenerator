package generators;

import model.Ingredient;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IngredientGenerator {
    private static final List<Ingredient> MEAT_INGREDIENTS = List.of(
            new Ingredient("szynka", false),
            new Ingredient("pepperoni", false),
            new Ingredient("salami", false),
            new Ingredient("wołowina", false),
            new Ingredient("kurczak", false),
            new Ingredient("krewetki", false),
            new Ingredient("kiełbasa", false),
            new Ingredient("boczek", false),
            new Ingredient("kabanos", false)
    );

    private static final List<Ingredient> VEGE_INGREDIENTS = List.of(
            new Ingredient("rukola", true),
            new Ingredient("pomidor", true),
            new Ingredient("oliwki zielone", true),
            new Ingredient("oliwki czarne", true),
            new Ingredient("ser feta", true),
            new Ingredient("cebula", true),
            new Ingredient("czosnek", true),
            new Ingredient("bazylia", true),
            new Ingredient("papryka", true),
            new Ingredient("pieczarki", true),
            new Ingredient("kukurydza", true),
            new Ingredient("groszek zielony", true)
    );

    private final Random random;

    public IngredientGenerator() {
        this.random = new Random();
    }

    public List<Ingredient> getRandomIngredients(int amount, boolean areVegetarian) {
        if(amount <= 0) throw new IllegalArgumentException("Amount of ingredients cannot be less or equal 0");
        List<Ingredient> ingredients = new ArrayList<>();
        for(int i = 0; i < amount; i++) {
            ingredients.add(areVegetarian ? getRandomVegeIngredient() : getRandomIngredient());
        }
        return ingredients;
    }
    public Ingredient getRandomIngredient() {
        return random.nextBoolean() ? getRandomMeatIngredient() : getRandomVegeIngredient();
    }

    public Ingredient getRandomVegeIngredient() {
        return VEGE_INGREDIENTS.get(random.nextInt(VEGE_INGREDIENTS.size()));
    }
    public Ingredient getRandomMeatIngredient() {
        return MEAT_INGREDIENTS.get(random.nextInt(MEAT_INGREDIENTS.size()));
    }


}

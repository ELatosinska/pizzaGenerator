package model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Pizza {
    private List<Ingredient> ingredients;
    private Size size;

    public Pizza() {
        ingredients = new ArrayList<>();
    }
}

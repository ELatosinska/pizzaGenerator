package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Ingredient {
    private String name;
    private boolean isVegetarian;
}

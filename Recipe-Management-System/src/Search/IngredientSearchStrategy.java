package src.Search;

import src.RecipeConcrete;

import java.util.List;

public class IngredientSearchStrategy implements SearchStrategy{
    @Override
    public List<RecipeConcrete> search(List<RecipeConcrete> recipeConcretes, String keyword) {
        return recipeConcretes.stream()
                .filter(recipe -> recipe.getIngredients().stream()
                        .anyMatch(ingredient -> ingredient.equalsIgnoreCase(keyword)))
                .collect(java.util.stream.Collectors.toList());
    }
}

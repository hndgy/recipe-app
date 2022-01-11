package fr.hndgy.recipeapp.services;


import fr.hndgy.recipeapp.domain.Recipe;
import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}

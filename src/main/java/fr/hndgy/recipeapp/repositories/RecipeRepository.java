package fr.hndgy.recipeapp.repositories;

import fr.hndgy.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}

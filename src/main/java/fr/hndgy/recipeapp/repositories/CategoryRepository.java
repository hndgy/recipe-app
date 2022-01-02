package fr.hndgy.recipeapp.repositories;

import fr.hndgy.recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}

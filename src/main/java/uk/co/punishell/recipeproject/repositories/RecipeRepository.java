package uk.co.punishell.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import uk.co.punishell.recipeproject.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}

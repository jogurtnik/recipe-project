package uk.co.punishell.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import uk.co.punishell.recipeproject.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}

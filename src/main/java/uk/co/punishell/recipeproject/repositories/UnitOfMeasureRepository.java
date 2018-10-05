package uk.co.punishell.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import uk.co.punishell.recipeproject.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}

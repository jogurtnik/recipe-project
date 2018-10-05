package uk.co.punishell.recipeproject.services;

import uk.co.punishell.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}

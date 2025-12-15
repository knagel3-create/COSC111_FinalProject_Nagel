/**
 * COSC 111
 * @author: Karissa Nagel
 * @version: Fall 2025
 * 
 * RecipeBook class: 
 * 
 * This class allows recipes to be added, searched by name, 
 * listed by title, and printed with full description by a 
 * collection of Recipe objects. 
 * 
 * The RecipeBook is the primary storage system for the main class.
 * It stores all important info entered by the user
 */

import java.util.ArrayList;

 public class RecipeBook {
    // Stores all Recipe objects
    private final ArrayList<Recipe> recipes;

    // Constructor ---> Creates empty recipe book
    public RecipeBook() {
        recipes = new ArrayList<>();
    }

    /**
     * allows a recipe to be added to the recipe book.
     * 
     * @param recipe the Recipe object to add
     */
    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    /**
     * @param name the name of the recipe to search for 
     * @return the Recipe if found, null if not.
     */
    public Recipe findRecipeByName(String name) {
        for (Recipe r : recipes) {
            if (r.getRecipeName().equalsIgnoreCase(name)) {
                return r;
            }
        }
        return null;
    }

    // Method to print names of all stored recipes
    public void listRecipeNames() {
        if (recipes.isEmpty()) {
            System.out.println("No recipe stored. Please return to main menu if you would like to add it.");
        } else {
            for (Recipe r : recipes) {
                System.out.println("- " + r.getRecipeName());
            }
        }
    }

    // method to print all recipes with full details
    public void printAllRecipes() {
        if (recipes.isEmpty()) {
            System.out.println("No recipes stored. Please select option one if you would like to add a recipe."); 
        } else {
            for (Recipe r : recipes) {
                System.out.println(r);
            }
        }
    }
}
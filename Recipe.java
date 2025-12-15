/**
 * COSC 111
 * @author: Karissa Nagel
 * @version: Fall 2025
 * 
 * Recipe Class: 
 * 
 * This class contains a Recipe object that stores 
 * the title, a list of ingredients, and the instructions needed
 * for the recipe
 * 
 * Recipe objects are stored inside the RecipeBook class
 */


import java.util.ArrayList;
public class Recipe {
    // Instance Varibales
    private final String recipeName;
    private String instructions;
    private final ArrayList<Ingredient> ingredients;

    /**
     * Constructor
     * Creates a Recipe with title and initializes
     * the ingredient list and instructions.
     * 
     * @param recipeName name of the recip
     */
    public Recipe (String recipeName) {
        this.recipeName = recipeName;
        this.ingredients = new ArrayList<>(); // initalize it so lists starts as empty
        this.instructions= ""; // empty so it isn't nulled
    }

    // Getter: Return recipeName
    public String getRecipeName() {
        return recipeName;
    }

    /**
    * Adds ingredients to the recipe. 
    * 
    * @param ingredient the ingredient to add
    */
    public void addIngredient (Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    /**
     * Sets instructions for the recipe.
     * 
     * @param instructions the instructions to add
     */
    public void setInstructions (String instructions) {
        this.instructions = instructions;
    }

    // toString to return correctly formatted representation of recipe.
    @Override
    public String toString() {
        String result= "Recipe: " + recipeName + "\n";

        result += "\nIngredients: \n";
        for (Ingredient ing : ingredients) {
            result+= "- " + ing + "\n";
        }

        result += "\nInstructions:\n" + instructions;
        return result;
    }
}
import java.util.ArrayList;

public class Recipe {
    // === Variables and fields ===
    private String recipeTitle;
    private String instructions;
    private ArrayList<Ingredient> ingredients;

    // ==== Constructors to assign each variable and field ===
    public Recipe (String recipeTitle) {
        this.recipeTitle = recipeTitle;
        this.ingredients = new ArrayList<>(); // initalize it so lists starts as empty
        this.instructions= ""; // empty so it isn't nulled
    }

    // === Getters ===
    public String getRecipeTitle() {
        return recipeTitle;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }


    // === Setters ===
    public void setInstructions (String instructions) {
        this.instructions = instructions;
    }

    /*
    Addtional Method ===> 
    Allows user to control how many ingrdients are added
    */
    public void addIngredient (Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    // toString
    @Override
    public String toString() {
        String result= "Recipe: " + recipeTitle + "\n";
        result += "Ingredients: \n";
        for (Ingredient ing : ingredients) {
            result+= " - " + ing.toString() + "\n";
        }
        result += "Instructions:\n" + instructions + "\n";
        return result;
    }
}
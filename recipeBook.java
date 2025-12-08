import java.util.ArrayList;
// WILL UPDATE COMMENTS LATER ===> 
//Most of my work got erased and this is the most I could recover
/**
 * Stores and manages a collection of Recipe objects.
 */
public class RecipeBook {

    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public boolean isEmpty() {
        return recipes.isEmpty();
    }

    public Recipe findRecipeByTitle(String title) {
        for (Recipe r : recipes) {
            if (r.getRecipeTitle().equalsIgnoreCase(title)) {
                return r;
            }
        }
        return null;
    }
}
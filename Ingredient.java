// Listed below is the Ingredient class that will be used for my Recipe app
public class Ingredient {
    private String recipeName;
    private double recipeQuantity;
    private String recipeUnit;

    // constructor
    public Ingredient (String recipeName, double recipeQuantity, String recipeUnit) {
        this.recipeName= recipeName;
        this.recipeQuantity= recipeQuantity;
        this.recipeUnit= recipeUnit;
    }
    public String getRecipeName() {
        return recipeName;
    }
    public double getRecipeQuantity() {
        return recipeQuantity;
    }
    public String getRecipeUnit() {
        return recipeUnit;
    } 

    @Override
    public String toString() {
        return recipeName + " " + recipeQuantity + " " + recipeUnit; 
    }
}
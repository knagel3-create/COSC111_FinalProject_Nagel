/**
 * COSC 111
 * @author: Karissa Nagel
 * @version: Fall 2025
 * 
 * Ingredient Class:
 * 
 * This class contains the individual ingredients used in recipes.
 * 
 * It utilizes objects to store the
 * name, quanity, and unit of the ingredient used in the recipe.
 * 
 * Ingredient objects are used by the Recipe class to keep track of all
 * ingredients needed for a recipe.
 **/

public class Ingredient {
    // Variables --> Changed name 
    private final String ingName;
    private final double ingQuantity;
    private final String ingUnit;

    /**
     * Constuctor
     * 
     * Had chat help me underdtand param since VS Code auto-filled the option for me
     * I wanted to make sure I was using the option correctly. :)
     * @param ingName name of ingredient
     * @param ingQuantity amount needed of the ingredient
     * @param ingUnit unit of measurement
     */
    
    public Ingredient (String ingName, double ingQuantity, String ingUnit) {
        this.ingName= ingName;
        this.ingQuantity= ingQuantity;
        this.ingUnit= ingUnit;
    }

    // Return all values for unit, quanity, and name. 
    public String getIngName() {
        return ingName;
    }
    public double getIngQuantity() {
        return ingQuantity;
    }
    public String getIngUnit() {
        return ingUnit;
    } 

    // Returns properly formatted String to represent the ingredient for the recipe
    // EX: 2 cups of sugar
    @Override
    public String toString() {
        return ingQuantity + " " + ingUnit + " of " + ingName;
    }
}
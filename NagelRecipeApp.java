/**
 * @author: Karissa Nagel
 * @version: Fall 2025
 * 
 * COSC 111
 * 
 * Interactive Recipe Box
 * Purpose: Store recipes, add new recipes and ingredients, and list current recipes.
 */

import java.util.Scanner;
 public class NagelRecipeApp {
    public static void main (String[] args) {
        Scanner kb= new Scanner(System.in);
        RecipeBook book= new RecipeBook();

        // Welcoming App Title
        // Change if needed
        System.out.println("==============================================");
        System.out.println("");
        System.out.println("Welcome to Your Personal Recipe App!"); // might change name
        System.out.println();
        System.out.println("==============================================");

        // while loop for choice --> go on until user is satified
        boolean running=true; 
        
        while(running) { // runs ---> NTS: space better but worry about it later :)
            System.out.println("1: Add Recipe");
            System.out.println("2. Search for Recipe");
            System.out.println("3. List Stored Recipes");
            System.out.println("4. Print Recipes");
            System.out.println("5. Exit");
            System.out.println("Please select one of the following options above.");
        
            String choice=kb.nextLine();

            switch (choice){ // will fulfill later
                case "1":
                    System.out.println("coming soon");
                    break;
                case "2":
                    System.out.println("coming soon");
                    break;
                case "3":
                    System.out.println("coming soon");
                    break;
                case "4":
                    System.out.println("coming soon");
                    break;
                case "5":
                    running=false;
                    break;
                default:
                    System.out.println("Invalid option. Please choosen an option beween 1 and 5.");
            }
        }
        kb.close();
    }
}


 //Current Phase One --> Ingredient class complete and other classes made to test ingredient class
 class Ingredient {
// variables
    private String recipeName;
    private double recipeQuanity;
    private String recipeUnit;

    // Constructor
    public Ingredient (String recipeName, double recipeQuanity, String recipeUnit) {
        this.recipeName= recipeName;
        this.recipeQuanity= recipeQuanity;
        this.recipeUnit= recipeUnit;
    }
    public String getRecipeName() {
        return recipeName;
    }
    public double getRecipeQuanity() {
        return recipeQuanity;
    }
    public String getRecipeUnit() {
        return recipeUnit;
    }
    @Override
    public String toString(){
        return recipeQuanity + " " + recipeUnit + " " + recipeName;
    }
}
class Recipe {
    

}

class RecipeBook {
    //will add more later
    public RecipeBook(){
        
    }
}
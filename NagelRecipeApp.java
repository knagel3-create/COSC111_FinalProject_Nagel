/**
 * @author: Karissa Nagel
 * @version: Fall 2025
 * 
 * COSC 111
 * 
 * Interactive Recipe App
 * Purpose: Store recipes, add new recipes and ingredients, and list current recipes.
 */

import java.util.Scanner;
public class NagelRecipeApp {
    public static void main (String[] args) {
        Scanner kb= new Scanner(System.in);
        RecipeBook book= new RecipeBook();

        // Welcoming App Title
        System.out.println("=================================================");
        System.out.println("=================================================");
        System.out.println("");
        System.out.println("    Welcome to Your Personal Recipe Tracker!");
        System.out.println();
        System.out.println("=================================================");
        System.out.println("================================================="); 

        // While loop for main menu of choices --> go on until user wants to exit
        boolean running = true; 
        System.out.println("\nPlease select an option from the following menu.");
        while(running) {
            // Print Menu
            System.out.println("\n-------------------------------------------------\n");
            System.out.println("==== Main Menu ====\n");
            System.out.println("1. Add Recipe");
            System.out.println("2. Search for a Recipe");
            System.out.println("3. View Recipe Names");
            System.out.println("4. View Full Recipes");
            System.out.println("5. Exit\n");
            
            System.out.print("Your choice: ");

            // String Choice from user
            String choice = kb.nextLine();

            switch (choice){
                case "1":
                    System.out.println();
                    addRecipe(kb, book);
                    break;

                case "2":
                    System.out.println();
                    searchForRecipe(kb, book);
                    break;

                case "3":
                    System.out.println();
                    System.out.print("Stored Names of Recipes: \n");
                    book.listRecipeNames();
                    break;

                case "4":
                    System.out.println();
                    System.out.println("Full List of Recipes: \n");
                    book.printAllRecipes();
                    break;

                case "5":
                    running=false;
                    System.out.println();
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println();
                    System.out.println("Invalid option. Please choose an option between 1 and 5.\n");
            }
        }
        kb.close();
    }

    
    // =============== Methods for menu choices ===============

    public static void addRecipe (Scanner kb, RecipeBook book) {
        // ============ Menu option 1 ============
        // loop so user can't enter anything blank for a recipe name
        String recipeName;
        do {
        System.out.print("Enter name of recipe: ");
        recipeName=kb.nextLine().trim();

        if (recipeName.isBlank()) System.out.println("\nRecipe name can't be blank, please enter a recipe name.\n");
        } while (recipeName.isBlank());

        // creates new Recipe object and stores what user inputs into program
        Recipe recipe = new Recipe (recipeName);

        // print entry instructions neatly
        System.out.println("\n-------- Ingredient Entry --------\n");
        System.out.println("Enter each ingredient one at a time.");
        System.out.println("When complete, press ENTER or type DONE.\n");
        
        // I had my recipe and print statements multiplying
        //so I asked CHATGPT for help in this manner

        // While loop to continue adding ingredients, units, and quanities until complete
        boolean hasIngredient = false; //run boolean to stop blank ingredient
        
        while (true) {
            System.out.print("Ingredient: ");
            String ingName = kb.nextLine().trim();
            
            // I used chat to help me build a stop option for my instructions and ingredients
            if (ingName.isBlank() || ingName.equalsIgnoreCase("DONE")) {
                if (hasIngredient) break;
                System.out.println("\nPlease enter at least one ingredient\n");
                continue;
            }

            // I had CHAT help me create a working exception catch incase the user inserts 
            // "two" or "1/2" for amount.
            double amount;
            while (true) { 
                System.out.print("Amount: ");
                String amtText = kb.nextLine().trim();
            try {
                amount = Double.parseDouble(amtText);
                if(amount <= 0 ){
                    System.out.println("Amount must be greater than 0.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("\nPlease enter a number. (e.g. 1.5, 2.0, 3.0)");
            }
        }   
            System.out.print("Unit: ");
            String unit= kb.nextLine().trim();
            if (unit.isBlank()) unit = "(No Unit)";

            // adds new ingredient
            recipe.addIngredient (new Ingredient (ingName.trim(), amount, unit));
            hasIngredient=true;
        }

        // While loop for Instructions ---> Print it neatly
        // Continue running and adding instructions until user says otherwise.
        System.out.println("\n-------- Instruction Entry --------\n");
        System.out.println("Enter each instruction one at a time");
        System.out.println("When complete, press ENTER or type DONE. \n");
        
        String instructions = "";
        boolean hasInstruction = false;

        while (true) {
            // String each line of instruction
            System.out.print("Instruction: ");
            String line = kb.nextLine();

            // End if user only has one line of instruction
            if ((line.isBlank() || line.equalsIgnoreCase("DONE")) && hasInstruction) {
                break;
            }

            // if blank/DONE wasn't entered, have program continue asking
            if (line.isBlank() || line.equalsIgnoreCase("DONE")) {
                System.out.println("Please enter at least one line of instruction.\n");
                continue;
            }

            instructions += "- " + line + "\n";
            hasInstruction=true;
        }
        recipe.setInstructions (instructions);

        // Store recipe and output message if done successfully
        book.addRecipe(recipe);
        System.out.println("\nRecipe added successfully!");    
    }
    
    // ============ Method for Menu option 2 ============
    public static void searchForRecipe (Scanner kb, RecipeBook book) {
        // Print statement for recipe search
        System.out.print("Please enter the recipe you would like to search for: ");
        String recipeName;
        recipeName = kb.nextLine().trim();

        Recipe r = book.findRecipeByName (recipeName);

        // if else statement to test is recipe is stored in program or not
        if (r == null) {
            System.out.println("\nRecipe not found.");
            System.out.println("\nYou may: ");
            System.out.println("1- Add a new recipe.");
            System.out.println("3- Display all recipe titles.");
            System.out.println("4- Display all complete recipes.");
        } else {
            System.out.println("\nRecipe found!\n");
            System.out.println(r);
        }
    }
}

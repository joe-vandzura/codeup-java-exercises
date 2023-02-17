package grocerylist;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroceryListApp {

    private static Input userInput;

    private static ArrayList<String> groceryCategories = new ArrayList<>(List.of("Fruits & Vegetables", "Meat & Seafood", "Bakery & Bread", "Dairy & Eggs", "Deli & Prepared Food", "Pantry", "Frozen Food"));

    private static HashMap<String, Grocery> groceryList = new HashMap<>();



    public static void main(String[] args) {
        if (start()) {

            if (promptToCreateNewInput()) {
                do {
                    listGroceryCategories();
                    System.out.println("Choose the category that the item falls under.");
                    addNewGrocery();

                    System.out.println();

                } while (promptToCreateNewInput());
            }
        }
        System.out.println("Alright, see ya!");

    }

    public static boolean start() {
        userInput = new Input();

        System.out.print("""
                    
                Would you like to create a grocery list? (Y or N)
                    
                >\040""");
        return userInput.yesNo(userInput.getString());
    }

    public static void listGroceryCategories() {
        System.out.println();
        for (String category : groceryCategories) {
            System.out.printf("%d: %s\n", groceryCategories.indexOf(category) + 1, category);
        }
    }

    public static boolean promptToCreateNewInput() {
        System.out.print("""
                    
                Would you like to enter a new item? (Y or N)
                    
                >\040""");
        return userInput.yesNo(userInput.getString());
    }

    public static void addNewGrocery() {
        int categoryInput = userInput.getInt(1, 7);
        String newGroceryCategory = "";
        switch (categoryInput) {
            case 1 -> newGroceryCategory = "Fruits & Vegetables";
            case 2 -> newGroceryCategory = "Meat & Seaefood";
            case 3 -> newGroceryCategory = "Bakery & Bread";
            case 4 -> newGroceryCategory = "Dairy & Eggs";
            case 5 -> newGroceryCategory = "Deli & Prepared Food";
            case 6 -> newGroceryCategory = "Pantry";
            case 7 -> newGroceryCategory = "Frozen Food";
        }

        System.out.println("Enter the name of the item.");
        String newGroceryName = userInput.getString();

        System.out.println("Enter the quantity.");
        int newGroceryQuantity = userInput.getInt(0, 9999);

        Grocery newGrocery = new Grocery(newGroceryName, newGroceryCategory, newGroceryQuantity);
        groceryList.putIfAbsent( newGrocery.getName(), newGrocery);
    }

}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static GroceryList groceryList = new GroceryList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        groceryList.printGroceryList();

        boolean quit = false;
        printInstructions();
        int choice = 0;
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyList();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    findItem();
                    break;

                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0- To print choice options ");
        System.out.println("\t 1- To print the list of grocery items ");
        System.out.println("\t 2- To add an item ");
        System.out.println("\t 3- To modify the list ");
        System.out.println("\t 4- To remove an item ");
        System.out.println("\t 5- To find an item ");
        System.out.println("\t 6- To quit ");
    }

    public static void addItem() {
        System.out.println("Type item to add");
        String item = scanner.nextLine();
        groceryList.addGrocery(item);
    }

    public static void modifyList() {
        System.out.println("Type item to modify");
        String item = scanner.nextLine();
        System.out.println("Type new item to add");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryList(item, newItem);
    }

    public static void removeItem() {
        System.out.println("Type item to remove");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void findItem() {
        System.out.println("Type item to search for");
        boolean searchItem = groceryList.onFile(scanner.nextLine());
        if(!searchItem) {
            System.out.println("I do not see the item you are looking for");
        } else {
            System.out.println("Found " + searchItem + " in the list");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArrayList = new ArrayList<String>();
        newArrayList.addAll(groceryList.getGroceryList());

        //Another way of doing the same thing as above. This next liine creates a brand new arraylist initialized to the content of the groceryList
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        //If for some reason I want to convert the arraylist to an array
        String[] newArray = new String[groceryList.getGroceryList().size()];
        newArray = groceryList.getGroceryList().toArray(newArray);
        //https://stackoverflow.com/questions/9572795/convert-list-to-array-in-java
    }
}

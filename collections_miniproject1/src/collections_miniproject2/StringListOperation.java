package collections_miniproject2;

import java.util.*;

public class StringListOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> itemList = new ArrayList<>();
        int choice;

        do {
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to be inserted: ");
                    String insertItem = scanner.nextLine();
                    itemList.add(insertItem);
                    System.out.println("Inserted successfully");
                    break;

                case 2:
                    System.out.print("Enter the item to search : ");
                    String searchItem = scanner.nextLine();
                    if (itemList.contains(searchItem)) {
                        System.out.println("Item found in the list.");
                    } else {
                        System.out.println("Item not found in the list.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the item to delete : ");
                    String deleteItem = scanner.nextLine();
                    if (itemList.remove(deleteItem)) {
                        System.out.println("Deleted successfully");
                    } else {
                        System.out.println("Item does not exist.");
                    }
                    break;

                case 4:
                    System.out.println("The Items in the list are :");
                    for (String item : itemList) {
                        System.out.println(item);
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}

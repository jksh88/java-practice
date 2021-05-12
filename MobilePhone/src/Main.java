import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
//        phone.createContact("Jay", "777-777-7777");
//        phone.createContact("Mike", "777-777-7778");
//        phone.printContacts();
//        System.out.println(phone.getContact("Mike"));
//        phone.modifyContact("Jay", "888-888-8888");
//        phone.printContacts();
//        phone.createContact("Ron", "777-777118");
//        phone.printContacts();
//        phone.removeContact("Ron");
//        phone.printContacts();
          printInstructions();
          int choice = 0;
          boolean quit = false;
          while(!quit) {
              System.out.println("Enter your choice: ");
          choice = scanner.nextInt();
              switch (choice) {
                  case 1:
                      phone.printContacts();
                      break;
                  case 2:
                      System.out.println("Enter the name: ");
                      String name = scanner.nextLine();
                      System.out.println("Enter the number: ");
                      String number = scanner.nextLine();
                      phone.createContact(name, number);
                      break;
                  case 3:
                      System.out.println("Enter the name: ");
                      String nameToFix = scanner.nextLine();
                      System.out.println("Enter the number: ");
                      String numberToFix = scanner.nextLine();
                      phone.modifyContact(nameToFix, numberToFix);
                      break;
                  case 4:
                      System.out.println("Enter the name to remove: ");
                      String nameToRemove = scanner.nextLine();
                      phone.removeContact(nameToRemove);
                      break;
                  case 5:
                      quit = true;
                  default:
                      quit = true;


              }
          }
    }

    public static void printInstructions() {
        System.out.println("Menu options\n");
        System.out.println("1: show all contacts\n2: add contact\n3: update contact\n4: delete contact\n5: I am done");
    }
}

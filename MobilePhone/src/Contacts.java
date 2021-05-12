import java.util.ArrayList;

public class Contacts {
    private ArrayList<ArrayList<String>> contacts = new ArrayList<ArrayList<String>>();

    public void addContact(String name, String number) {
        int index = findIndex(name);
        if (index >= 0) {
            System.out.println("That name already exists");
        } else {
            ArrayList<String> contactPair = new ArrayList<String>();
            contactPair.add(name);
            contactPair.add(number);
            contacts.add(contactPair);
        }
    }

    public void printAllContacts() {
        System.out.println(contacts.toString());
    }

    public String getNumber(String name) {
        int index = findIndex(name);
        if (index < 0) {
            System.out.println("Check your name. That name doesn't exist");
        } else {
            String number = contacts.get(index).get(1);
            System.out.println("Number for " + name + " is " + number);
            return number;
        }
        return "Did not find that contact";
    }

    public void modifyContact(String name, String newNumber) {
        int index = findIndex(name);
        if (index < 0) {
            System.out.println("Check your name. That name doesn't exist");
        }
        contacts.get(index).set(1, newNumber);
        contacts.get(index).set(0, name);
    }

    public void removeContact(String name) {
        int index = findIndex(name);
        if (index < 0) {
            System.out.println("Check your name. That name doesn't exist");
        }
        contacts.remove(index);
    }

    public int findIndex(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).get(0).equals(name)) {
                System.out.println("Found it!!!");
                return i;
            }
        }
        return -1;
    }
}
//https://www.geeksforgeeks.org/difference-equals-method-java/
// equals: content comparison vs '==': address comparison













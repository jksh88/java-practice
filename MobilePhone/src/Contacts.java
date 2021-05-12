import java.util.ArrayList;

public class Contacts {
    private ArrayList<ArrayList<String>> contacts = new ArrayList<ArrayList<String>>();

    public void addContact(String name, String number) {
        ArrayList<String> contactPair = new ArrayList<String>();
        contactPair.add(name);
        contactPair.add(number);
        contacts.add(contactPair);
    }

    public void printAllContacts() {
        System.out.println(contacts.toString());
    }

    public String getNumber(String name) {
        String number = contacts.get(findIndex(name)).get(1);
        return number;
    }

    public void modifyContact(String name, String newNumber) {
        contacts.get(findIndex(name)).set(1, newNumber);
    }

    public void removeContact(String name) {
        contacts.remove(findIndex(name));
    }

    public int findIndex(String name) {
        String index = "1";
        for(int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).get(0) == name) {
                return i;
            }
        }
        return -1;
    }
}














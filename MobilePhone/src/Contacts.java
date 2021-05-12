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

    public void getNumber(String name) {

    }

    public void removeContact(String name) {

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














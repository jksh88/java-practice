public class MobilePhone {
    private Contacts contacts = new Contacts();
    public void createContact(String name, String number) {
        contacts.addContact(name, number);
    }

    public void printContacts() {
        contacts.printAllContacts();
    }

    public String getContact(String name) {
        return contacts.getNumber(name);
    }

    public void modifyContact(String name, String newNumber) {
        contacts.modifyContact(name, newNumber);
    }

    public void removeContact(String name) {
        contacts.removeContact(name);
    }
}

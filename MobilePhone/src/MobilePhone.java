public class MobilePhone {
    private Contacts contacts = new Contacts();
    public void createContact(String name, String number) {
        contacts.addContact(name, number);
    }

    public void printContacts() {
        contacts.printAllContacts();
    }
}

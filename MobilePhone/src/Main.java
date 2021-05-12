public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.createContact("Jay", "777-777-7777");
        phone.createContact("Mike", "777-777-7778");
        phone.printContacts();
    }
}

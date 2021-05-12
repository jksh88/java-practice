public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.createContact("Jay", "777-777-7777");
        phone.createContact("Mike", "777-777-7778");
        phone.printContacts();
        System.out.println(phone.getContact("Mike"));
        phone.modifyContact("Jay", "888-888-8888");
        phone.printContacts();
        phone.createContact("Ron", "777-777118");
        phone.printContacts();
        phone.removeContact("Ron");
        phone.printContacts();
    }
}

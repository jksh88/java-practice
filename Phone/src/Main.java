public class Main {
    public static void main(String[] args) {
        IPhone myPhone = new Phone(322);
        myPhone.powerOn();
        myPhone.call(322);
        myPhone.answer();

        IPhone myMobilePhone = new MobilePhone(55337);
        myMobilePhone.powerOn();
        myMobilePhone.dial(68891);
        myMobilePhone.call(3322);
        myMobilePhone.answer();

    }
}

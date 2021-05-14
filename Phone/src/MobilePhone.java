public class MobilePhone implements IPhone{
    private int myMobileNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int phoneNumber) {
        this.myMobileNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone is on");

    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now calling " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("Mobile Phone off");
        }
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answer the phone");
        }
    }

    @Override
    public boolean call(int phoneNumber) {
        if(isOn && phoneNumber == myMobileNumber) {
            System.out.println("Ring ring");
        } else {
            isRinging = false;
            System.out.println("wrong number or power off");
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}

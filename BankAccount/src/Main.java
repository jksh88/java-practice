public class Main {
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount();
        acct1.setCustomerName("Johnny");
        acct1.setBalance(2000);
        acct1.addFund(1200);
        acct1.takeFund(700);

        BankAccount acct2 = new BankAccount();
        acct2.setCustomerName("Mickey");
        acct2.setBalance(50000);
        acct2.addFund(3800);
        acct2.takeFund(1720);
    }



}

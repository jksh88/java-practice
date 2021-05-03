public class Main {
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount(355055541, 120000, "Zack Greinke", "zack@gmail.com", "404-332-1235");

        acct1.addFund(1200);
        acct1.takeFund(700);

        BankAccount acct2 = new BankAccount();
        acct2.setCustomerName("Mickey");
        acct2.setBalance(50000);
        acct2.addFund(3800);
        acct2.takeFund(1720);

        VipCustomer vip = new VipCustomer("Mike", 2000000);
        System.out.println(vip.getCreditLimit());

        VipCustomer vip2 = new VipCustomer();
        System.out.println(vip2.getEmail());
    }



}

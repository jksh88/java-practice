public class BankAccount {
        private int accountNo;
        private int balance;
        private String customerName;
        private String email;
        private String phoneNo;

        public int getAccountNo() {
            return accountNo;
        }
        public void setAccountNo(int accountNo){
            this.accountNo = accountNo;
        }
        public int getBalance() {
            System.out.println("Current balance for " + customerName + " is " + balance);
            return balance;
        }
        public void setBalance(int balance) {
            System.out.println("Current balance for " + customerName + " is " + balance);
            this.balance = balance;
        }
        public String getCustomerName() {
            return customerName;
        }
        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getPhoneNo() {
            return phoneNo;
        }
        public void setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
        }
        public void addFund(int deposit) {
            this.balance += deposit;
            System.out.println("Deposit for " + customerName + " in the amount of " + deposit + " has been made.");
            getBalance();
        }
        public void takeFund(int withdrawal) {
            if (this.balance < withdrawal) {
                System.out.println("Your balance is " + getBalance());
            } else {
                this.balance -= withdrawal;
                System.out.println("Withdrawal for " + customerName + " in the amount of " + withdrawal + " has been made.");
                getBalance();
            }


        }
}

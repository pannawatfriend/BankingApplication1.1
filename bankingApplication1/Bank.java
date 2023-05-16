package bankingApplication1;

public class Bank {
    private String name;
    public Bank() {

    }
    public Bank(String name) {

    }
    public void openAccount(Account account) {
    }

    public void closeAccount(int number) {
        System.out.println("Hello");
    }
    public void depositMoney(int number, double amount){
        Account account = getAccount(number);
        System.out.println("Hello");
    }
    public void withdrawMoney(int number, double amount) {
        Account account = getAccount(number);
        System.out.println("Hello");
    }
    public Account getAccount(int number){
        String accName = "aaaaa";
        double balance = 1000;
        Account account = new Account(number, accName, balance);
        return account;
    }

}

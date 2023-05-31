package Package1;

public class Bank {
    private final String customerName;
    private final int accountNumber;
    private int accountBalance = 0;
    public Bank(String customerName, int accountNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
    }
    public void Deposit(int newDeposit){
        accountBalance = accountBalance + newDeposit;
    }
    public void Withdraw (int toWithdraw){
        accountBalance = accountBalance - toWithdraw;
    }
    public int GetBalance(){
        return accountBalance;
    }
}

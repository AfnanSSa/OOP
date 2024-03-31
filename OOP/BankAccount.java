/**Create a class named BankAccount with private attributes for accountNumber, balance,
 * and ownerName. Implement methods to deposit and withdraw money from the account.*/
package OOP;

public class BankAccount {
    private String accountNumber;
    private Double balance;
    private String ownerName;

    //Setters & Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    //method of deposit
    public Double deposit(Double amount){
        balance += amount;
        return balance;
    }

    //method of withdraw
    public Double withdraw(Double amount){
        balance -= amount;
        return balance;
    }
}

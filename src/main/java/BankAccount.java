import java.time.LocalDate;

public class BankAccount {
    private String firstName;
    private String lastName;
    private LocalDate localDate;
    private int accountNumber;
    private int balance;

    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, int accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;

        this.localDate = dateOfBirth;

        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth(){
        return localDate;
    }

    public void setDateOfBirth(LocalDate dateOfBirth){
        this.localDate = dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdrawal(int amount) {
        this.balance -= amount;
    }

    public void payInterest() {
        this.balance *= 1.05;
    }
}

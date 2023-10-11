import java.time.LocalDate;

public class BankAccount {
    private String firstName;
    private String lastName;
    private LocalDate localDate;
    private Integer accountNumber;
    private Integer balance;

    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, Integer accountNumber){
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

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getBalance() {
        return balance;
    }
}

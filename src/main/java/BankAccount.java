import java.time.LocalDate;

public class BankAccount {
    private String firstName;
    private String lastName;
    private Integer dateOfBirthYear;
    private Integer dateOfBirthMonth;
    private Integer dateOfBirthDay;
    private Integer accountNumber;
    private Integer balance;

    public BankAccount(String firstName, String lastName, Integer dateOfBirthYear, Integer dateOfBirthMonth, Integer dateOfBirthDay, Integer accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;

        this.dateOfBirthYear = dateOfBirthYear;
        this.dateOfBirthMonth = dateOfBirthMonth;
        this.dateOfBirthDay = dateOfBirthDay;
        LocalDate localDate = LocalDate.of(dateOfBirthYear, dateOfBirthMonth, dateOfBirthDay);

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
}

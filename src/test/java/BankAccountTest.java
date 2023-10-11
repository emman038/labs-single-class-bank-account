import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    @Test
    void canGetFirstName(){
        BankAccount bankAccount = new BankAccount("John", "Doe", LocalDate.of(2000, 8, 3), 23333);
        String actual = bankAccount.getFirstName();
        String expected = "John";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canSetFirstName(){
        BankAccount bankAccount = new BankAccount("John", "Doe", LocalDate.of(2000, 8, 3), 23333);
        bankAccount.setFirstName("Emmanuel");
        String actual = bankAccount.getFirstName();
        String expected = "Emmanuel";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canGetLastName(){
        BankAccount bankAccount = new BankAccount("John", "Doe", LocalDate.of(2000, 8, 3), 23333);
        String actual = bankAccount.getLastName();
        String expected = "Doe";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canSetLastName(){
        BankAccount bankAccount = new BankAccount("John", "Doe", LocalDate.of(2000, 8, 3), 23333);
        bankAccount.setLastName("Ajayi");
        String actual = bankAccount.getLastName();
        String expected = "Ajayi";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canGetDateOfBirth(){
        BankAccount bankAccount = new BankAccount("John", "Doe", LocalDate.of(2000, 8, 3), 23333);
        LocalDate actual = bankAccount.getDateOfBirth();
        LocalDate expected = LocalDate.of(2000, 8, 3);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canSetDateOfBirth(){
        BankAccount bankAccount = new BankAccount("John", "Doe", LocalDate.of(2000, 8, 3), 23333);
        bankAccount.setDateOfBirth(LocalDate.of(2007, 4, 8));
        LocalDate actual = bankAccount.getDateOfBirth();
        LocalDate expected = LocalDate.of(2007, 4, 8);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canGetAccountNumber(){
        BankAccount bankAccount = new BankAccount("John", "Doe", LocalDate.of(2000, 8, 3), 23333);
        Integer actual = bankAccount.getAccountNumber();
        Integer expected = 23333;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canSetAccountNumber(){
        BankAccount bankAccount = new BankAccount("John", "Doe", LocalDate.of(2000, 8, 3), 23333);
        bankAccount.setAccountNumber(33333);
        Integer actual = bankAccount.getAccountNumber();
        Integer expected = 33333;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canSetBalance(){
        BankAccount bankAccount = new BankAccount("John", "Doe", LocalDate.of(2000, 8, 3), 23333);
        bankAccount.setBalance(10000);
        Integer actual = bankAccount.getBalance();
        Integer expected = 10000;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canGetBalance(){
        BankAccount bankAccount = new BankAccount("John", "Doe", LocalDate.of(2000, 8, 3), 23333);
        Integer actual = bankAccount.getBalance();
        Integer expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

}

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    @Test
    void canGetFirstName(){
        BankAccount bankAccount = new BankAccount("John", "Doe", 2000, 8, 3, 23333);
        String actual = bankAccount.getFirstName();
        String expected = "John";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canSetFirstName(){
        BankAccount bankAccount = new BankAccount("John", "Doe", 2000, 8, 3, 23333);
        bankAccount.setFirstName("Emmanuel");
        String actual = bankAccount.getFirstName();
        String expected = "Emmanuel";
        assertThat(actual).isEqualTo(expected);
    }

}

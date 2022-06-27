import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StartApp {

    public static void main(String[] args) {
       Account account = new Account(new Statement());

       DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

       account.deposit(Amount.amountOf(1000.0), LocalDate.parse("10/01/2021",format));
       account.deposit(Amount.amountOf(2000.0), LocalDate.parse("13/01/2021",format));
       account.withdraw(Amount.amountOf(500.0), LocalDate.parse("14/01/2021",format));
       //account.withdraw(Amount.amountOf(1000.0), LocalDate.parse("14/01/2021",format));

       account.printStatement();
    }
}

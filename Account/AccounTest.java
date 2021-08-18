// Create and manipulate an Account object.

/**
 *
 * @author samuelCaitano (ref. JavaHowToProgram - Paul Deitel)
 */
public class AccounTest {

    public static void main(String[] args) {
        Account account = new Account("Samuel Caitano", 75.00);

        System.out.printf("Saldo inicial da conta: $%.2f ", account.getBalance());

        double depositAmount = 25.0;

        System.out.printf("\nAdicionando $%.2f ao saldo da conta\n\n", depositAmount);
        account.deposit(depositAmount);

        System.out.printf("Novo saldo da conta: $%.2f ", account.getBalance());
    }
}

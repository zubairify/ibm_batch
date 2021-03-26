import com.ibm.bank.AccountFactory;
import com.ibm.bank.BalanceException;
import com.ibm.bank.Banking;

public class TestAccount {

	public static void main(String[] args) {
		
		Banking s1 = AccountFactory.openSavingsAccount("Polo");

		try {
			s1.withdraw(2000);
		} catch (BalanceException e) {
//			e.printStackTrace();	// For debugging/troubleshooting - User: Developers
//			System.out.println(e);	// For system/application audit - User: Loggers
			System.out.println(e.getMessage());	// For end users
		}
		
	}
}

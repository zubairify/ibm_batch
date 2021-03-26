import com.ibm.xe.AED;
import com.ibm.xe.CurrencyConverter;
import com.ibm.xe.INR;
import com.ibm.xe.USD;

public class TestCurrency {

	public static void main(String[] args) {
		INR inr = new INR();
		USD usd = new USD();
		AED aed = new AED();
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.println(cc.convert(usd, inr, 100));
		System.out.println(cc.convert(inr, usd, 5000));
		System.out.println(cc.convert(usd, aed, 100));
		System.out.println(cc.convert(aed, inr, 100));
	}
}

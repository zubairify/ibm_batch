import com.ibm.stock.Broker;
import com.ibm.stock.Exchange;
import com.ibm.stock.Holder;
import static com.ibm.stock.StockSingleton.*;

public class TestStock {
	
	public static void main(String[] args) {
//		Stock ibm = new Stock();
		
		Holder h = getStock();
		h.view();
		
		Broker b = getStock();
		b.get();
		
		Exchange x = getStock();
		x.set();
		
		System.out.println(h == b);
	}
}

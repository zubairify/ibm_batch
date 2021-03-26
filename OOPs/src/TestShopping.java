import com.ibm.shop.Product;
import com.ibm.shop.ShoppingCart;

public class TestShopping {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Product p1 = new Product("iPhone 12 Mini", 66000);
		
		cart.addProduct(p1);
		cart.addProduct(new Product("Apple Watch SE", 29000));
		cart.addProduct(new Product("Apple AirPods2", 12500));
		cart.addProduct(new Product("MacBook Pro 13", 125000));
		
		cart.checkout();
	}
}

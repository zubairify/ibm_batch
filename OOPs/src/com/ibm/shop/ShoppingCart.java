package com.ibm.shop;

public class ShoppingCart {
	private double cartTotal;
	private Product[] items;
	private int idx;
	
	String[][] coupons = {{"HOLI200","200"},{"WKND100", "100"}, {"APRIL150","150"}};
	public ShoppingCart() {
		items = new Product[5];
	}
	
	public void addProduct(Product p) throws OutOfStockException {
		if(idx < items.length) {
			items[idx ++] = p;
			cartTotal += p.getPrice();
		} else
			System.out.println("Your cart is full");
	}
	
	public void checkout(Payment pmt, String code) {
		if(idx == 0) 
			System.out.println("Your cart is empty!!");
		else {
			System.out.println("Products in your cart");
			for (int i = 0; i < idx; i++) 
				System.out.println(items[i].getName() + ": " + items[i].getPrice());
			System.out.println("Cart Total: " + cartTotal);
		}
	}
}

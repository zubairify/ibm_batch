package com.ibm.shop;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingCart {
	private double cartTotal;
	private ArrayList<Product> items;	// replace it with ArrayList<Product>
	// Replace this with a HashMap<String, Double>
	private HashMap<String, Double> coupons;
	
	public ShoppingCart() {
		items = new ArrayList<Product>();
		coupons = new HashMap<String, Double>();
		coupons.put("HOLI200",200.0);
		coupons.put("WKND100",100.0);
		coupons.put("APRIL150",150.0);
	}
	
	public void addProduct(Product p) throws OutOfStockException {
		items.add(p);
		cartTotal += p.getPrice();
	}
	
	public void checkout(Payment pmt, String code) {
		if(items.size() == 0) 
			System.out.println("Your cart is empty!!");
		else {
			System.out.println("Products in your cart");
			for (Product p : items) 
				System.out.println(p.getName() + ": " + p.getPrice());
			System.out.println("Cart Total: " + cartTotal);
		}
	}
}

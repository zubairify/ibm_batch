package com.ibm.bank;

import java.util.Vector;

/**
 * This class represents generalised banking account.
 * @author Zubair Shaikh
 * @version 1.0
 */
public abstract class Account implements Banking {
	private int acntNo;
	private String holder;
	protected double balance;
	
	// Application constants
	public static final int INIT_ACNT_NO = 1001;
	public static final double MIN_SAV_BAL = 1000;
	public static final double OD_LIMIT = 10000;
	public static final double INIT_CUR_BAL = 5000;
	public static final double MIN_CUR_BAL = 0;
	
	private static int autogen = INIT_ACNT_NO;
	
	protected Vector<Transaction> txns;
	
	/* This is default constructor */
	public Account() {
	}

	/** This is parameterised constructor */
	public Account(String holder, double balance) {
		this.acntNo = autogen ++;
		this.holder = holder;
		this.balance = balance;
		
		txns = new Vector<Transaction>();
		txns.add(new Transaction("OB", balance, balance));
	}
	
	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}
	
	// BL(Business Logic) methods
	public void deposit(double amount) {
		balance += amount;
		txns.add(new Transaction("CR", amount, balance));
	}
	
	public abstract void withdraw(double amount) throws BalanceException; 

	public void statement() {
		System.out.println("Statment for A/C: " + acntNo);
		for (Transaction t : txns) 
			t.print();
	}
}

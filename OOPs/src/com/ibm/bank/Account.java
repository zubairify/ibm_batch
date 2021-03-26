package com.ibm.bank;

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
	
	protected Transaction[] txns;
	protected int idx;
	
	/* This is default constructor */
	public Account() {
	}

	/** This is parameterised constructor */
	public Account(String holder, double balance) {
		this.acntNo = autogen ++;
		this.holder = holder;
		this.balance = balance;
		
		txns = new Transaction[10];
		txns[idx ++] = new Transaction("OB", balance, balance);
	}
	
	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}
	
	// BL(Business Logic) methods
	public void deposit(double amount) {
		balance += amount;
		txns[idx ++] = new Transaction("CR", amount, balance);
	}
	
	public abstract void withdraw(double amount) throws BalanceException; 

	public void statement() {
		System.out.println("Statment for A/C: " + acntNo);
		for (int i = 0; i < idx; i++) 
			txns[i].print();
	}
}

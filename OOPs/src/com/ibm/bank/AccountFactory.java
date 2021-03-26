package com.ibm.bank;

public final class AccountFactory {
	
	private AccountFactory() {
	}
	
	public static Banking openSavingsAccount(String holder) {
		return new Savings(holder);
	}
	
	public static Banking openCurrentAccount(String holder) {
		return new Current(holder);
	}
}

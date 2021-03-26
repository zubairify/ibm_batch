package com.ibm.steam;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Subscription {
	private String plan;
	private LocalDate expiry;
	private static final double MONTHLY=100;
	private static final double ANNUALY=1000;
	
	public Subscription() {
	}

	public void subscribe(String plan, User user) throws SubscriptionException {
		if(plan.equalsIgnoreCase("Monthly") && user.getBalance() >= MONTHLY) { 
			user.setBalance(user.getBalance() - MONTHLY);
			user.setSubscription(this);
			expiry = LocalDate.now().plus(1, ChronoUnit.MONTHS);
			this.plan = plan;
		}
		else if(plan.equalsIgnoreCase("Annualy") && user.getBalance() >= ANNUALY){
			user.setBalance(user.getBalance() - ANNUALY);
			user.setSubscription(this);
			expiry = LocalDate.now().plus(1, ChronoUnit.YEARS);
			this.plan = plan;
		} else
			throw new SubscriptionException("Insufficient balance against subscription amount");
	}

	public String getPlan() {
		return plan;
	}
	public LocalDate getExpiry() {
		return expiry;
	}
}

package com.johnmeaney.online.bank;

public class CurrentAccount extends Account {

	private double overdraftLimit;

	public CurrentAccount(String accountNumber, Customer accountHolder, double overdraftLimit) {
		super(accountNumber, accountHolder);
		this.overdraftLimit = overdraftLimit;
	}
	
	
	public void withdraw(double amount) throws java.io.FileNotFoundException {
		if (amount <= balance + overdraftLimit) {
			balance -= amount;
			transactions.add(new Transaction(-amount));
		}
	}
}

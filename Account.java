package com.johnmeaney.online.bank;
import java.util.*;

public abstract class Account {

	private String accountNumber;
	protected double balance;
	protected List<Transaction> transactions = new ArrayList<>();
	private Customer accountHolder;
	
	public Account(String accountNumber, Customer accountHolder) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	public Customer getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(Customer accountHolder) {
		this.accountHolder = accountHolder;
	}

	public void withdraw(double amount) throws java.io.IOException {
		if (amount <= balance) {
			balance -= amount;
			transactions.add(new Transaction(-amount));
		}
	}

	public void deposit(double amount) throws RuntimeException {
		balance += amount;
		transactions.add(new Transaction(amount));
	}
	
	public List<Transaction> getTransactions(){
		return transactions;
	}
	
}

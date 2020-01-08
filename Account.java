package com.qa.banking;
import java.util.*;

public class Account {
	private String sortCode;
	private String accountNumber;
	private double balance;
	private Map<Integer, Transaction> transactions = new HashMap<>();
	
	public Account(String sortCode, String accountNumber) {
		this.sortCode = sortCode;
		this.accountNumber = accountNumber;
	}
	
	public void deposit(double amount) {
		balance += amount;
		Integer key = Transaction.getNextId();
		Transaction valueObject = new Transaction(amount); 
		transactions.put(key, valueObject);
	}
	
	public void withdraw(double amount) throws Exception {
		if (amount <= balance) {
			balance -= amount;
			Integer key = Transaction.getNextId();
			Transaction valueObject = new Transaction(-amount); 
			transactions.put(key, valueObject);
		} else {
			throw new Exception("Not enough money");
		}
	}

	public double getBalance() {
		return balance;
	}

	public String getSortCode() {
		return sortCode;
	}

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public Map<Integer, Transaction> getTransactions(){
		return transactions;
	}
	
}

package com.johnmeaney.online.bank;

public class Transaction {
	
	private int id;
	private double amount;
	
	private static int lastUsedId = 1000;
	
	public static int getLastUsedId() {
		return lastUsedId;
	}
	public int getId() {
		return id;
	}
	public double getAmount() {
		return amount;
	}
	public Transaction(double amount) {
		id = ++lastUsedId;
		this.amount = amount;
	}
	
	
	
}

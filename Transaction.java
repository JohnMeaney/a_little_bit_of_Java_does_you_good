package com.qa.banking;

public class Transaction {
	private Integer id;
	private double amount;
	private static int nextId = 1000;
	
	public static Integer getNextId() {
		return nextId;
	}
	
	public Transaction(double a) {
		this.id = nextId++;
		this.amount = a;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}

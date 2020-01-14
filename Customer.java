package com.johnmeaney.online.bank;

public class Customer {
	private int id;
	private String name;
	private static int lastUsedId;
	public Customer(String name) {
		super();
		this.name = name;
		id = ++lastUsedId;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public static int getLastUsedId() {
		return lastUsedId;
	}
	
	
	
	
}

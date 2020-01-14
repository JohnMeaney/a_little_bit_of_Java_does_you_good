package com.johnmeaney.online.bank;

public class DepositAccount extends Account
{

	public DepositAccount(String accountNumber, Customer accountHolder) {
		super(accountNumber, accountHolder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		// TODO ... not yet implemented...
		
	}
	public void deposit(double amount) throws ArithmeticException {
		balance += amount;
		transactions.add(new Transaction(amount));
	}
}

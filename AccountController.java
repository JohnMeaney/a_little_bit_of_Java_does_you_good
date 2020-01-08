package com.qa.banking;

import java.util.List;
import java.util.Map;

public class AccountController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Account acc = new Account();

		Account account1 = new Account( "10-23-34", "122334455");
		System.out.println(account1.getSortCode() + " " + account1.getAccountNumber() + " " + account1.getBalance());
		account1.deposit(100.00);
		System.out.println(account1.getSortCode() + " " + account1.getAccountNumber() + " " + account1.getBalance());
		try {
			account1.withdraw(50.00);
		} catch (Exception e) {
			System.out.println("Sorry, you haven't got enough money...");
		}
		
		
		
		Map<Integer, Transaction> accTrans = account1.getTransactions();
		Transaction t1001 = accTrans.get(1001);
		System.out.println(t1001.getId() + " " + t1001.getAmount());

	}

}

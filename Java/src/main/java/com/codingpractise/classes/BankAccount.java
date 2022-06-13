package main.java.com.codingpractise.classes;

public class BankAccount {
	
	private static String Company = "Google";
	private String UserName;
	private int AccountNumber;
	
	// Class constructor
	public BankAccount(String name, int number) {
		this.UserName = name;
		this.AccountNumber = number;
	}
	
	public String getUsername() {
		return this.UserName;
	}
	
	// Return current value 
	public int getAccountNumber() {
		return this.AccountNumber;
	}
	
	// Method display current info
	public void displayInfo() {
		System.out.println("Current Information are: ");
		System.out.println("***** COMPANY '" + this.Company + "'*****");
		System.out.println("- Username: " + this.UserName);
		System.out.println("- Account Number: " + this.AccountNumber);
	}

}

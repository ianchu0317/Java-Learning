package main.java.com.codingpractise.classes;

// They are in the same package, so it doesn't need to import the package path to the class
public class BankManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount my_account = new BankAccount("ianchu0317", 123456789);
		
		my_account.displayInfo();
	}

}

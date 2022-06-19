package main.java.com.apress.bgn.ch4.basic;

public class MainAbstraction {

	// Display data for instance
	public static void displayData(Human human) {
		System.out.println("\n*******************");
		System.out.println("- Name: " + human.getName());
		System.out.println("- Age: " + human.getAge());
		System.out.println("- Height: " + human.getHeight());

	}
	
	
	public static void main(String[] args) {

		// Generate instances
		Human h1 = new Human("Ian", 12, (float) 13.4);
		Human h2 = new Human("Alex", 45, (float) 17.39);
		Human h3 = new Human("Calvin", 46, (float) 29.4);
		
		// Display current instances information
		displayData(h1);
		displayData(h2);
		displayData(h3);
	}

}

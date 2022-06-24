package main.java.com.apress.bgn.ch4.basic;

public class MainAbstraction {

	// Display data for instance "methods inherited from HUMAN class"
	public static void displayHumanData(Musician human) {
		System.out.println("\n*******************");
		System.out.println("- Name: " + human.getName());
		System.out.println("- Age: " + human.getAge());
		System.out.println("- Height: " + human.getHeight());

	}
	
	// Display data for methods of the extended class
	public static void displayMusicianData(Musician human) {
		System.out.println("\n*******************");
		System.out.println("- Genre " + human.getGenre());
		System.out.println("- Music Style" + human.getMusicStyle());
	}
	
	// Main function
	public static void main(String[] args) {
		Musician person1 = new Musician("Fred", 12, (float) 13.4, "rock", "soft");
		
		// Displaying data
		displayHumanData(person1);
		displayMusicianData(person1);
	}

}

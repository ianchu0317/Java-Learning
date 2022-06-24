package main.java.com.apress.bgn.ch4.basic;

public abstract class HumanAbstraction {

		// Private fields
		private String name;
		private int age;
		private float height;
		
		private static int LIFETIME = 100; // constant
		
		// Constructor
		public HumanAbstraction(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		// More complex constructor
		public HumanAbstraction(String name, int age, float height) {
			this(name, age);  // Calling himself
			this.height = height;			
		}
		
		// Getters and setters for each field
		public String getName() {
			return this.name;
		}
		
		public void setName(String name) {
			this.name = name;

		}
		
		public int getAge() {
			return this.age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public float getHeight() {
			return this.height;
		}
		
		public void setHeihgt(float height) {
			this.height= height;
		}
		
		public int getLifetime() {
			return  LIFETIME - age;
		}
		
		// To inherit method
		public abstract void sayHello();
		
		// Testing method
		public void testing() {
			System.out.println("This is a testing");
		}
		
}

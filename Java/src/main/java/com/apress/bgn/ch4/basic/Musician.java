package main.java.com.apress.bgn.ch4.basic;

public class Musician extends HumanAbstraction {
	// Global fields
	private String musicStyle;
	private String genre;
	
	// Save variables with basic constructor
	public Musician(String name, int age, float height) {
		super(name, age, height);
	}
	
	// Another constructor with fields of this extended class
	public Musician(String name, int age, float height, String musicStyle, String genre) {
		this(name, age, height);
		this.setMusicStyle(musicStyle);
		this.setGenre(genre);
	}
	
	// Other methods
	public void sayHello() {
		System.out.println("Hello");
	}

	public String getMusicStyle() {
		return musicStyle;
	}

	public void setMusicStyle(String musicStyle) {
		this.musicStyle = musicStyle;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	};
	
}

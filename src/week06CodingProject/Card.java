package week06CodingProject;

public class Card {

//Fields
	private int value;
	private String name;

// Constructor
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}

//Getter for value
	public int getValue() {
		return value;
	}

//Setter for Value
	public void setValue(int value) {
		this.value = value;
	}

//Getter for name
	public String getName() {
		return name;
	}

//Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println(name + " | Value: " + value);
	}
	
}

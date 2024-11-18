package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	int id;
	String name;  //member variables for cat traits
	boolean rented;

	public CatImpl(int id, String name) { //constructor method
		// TODO: Fill in
		this.id = id;
		this.name = name;
		this.rented = false; //init rented to false
	}

	public void rentCat() {
		// TODO: Fill in
		this.rented = true; //just switch rented to true
	}

	public void returnCat() {
		// TODO: Fill in
		this.rented = false; //opposite of rentCat
	}

	public void renameCat(String name) {
		// TODO: Fill in
		this.name = name; //same as constructor, just reassign name
	}

	public String getName() {
		// TODO: Fill in
		return this.name; //just return member variable
	}

	public int getId() {
		// TODO: Fill in
		return this.id;
	}

	public boolean getRented() {
		// TODO: Fill in
		return this.rented;
	}

	public String toString() {
		// TODO: Fill in
		return "ID " + this.id + ". " + this.name;
	}

}
package main;

import java.util.UUID;

public class Person {
	
	//attributes
	private String firstName;
	private String lastName;
	private UUID personID;
	
	public Person(){
		
	}
	
	//setters
	public void set_firstname(String firstname){
		this.firstName = firstname;
	}
	
	public void set_lastname(String lastname){
		this.lastName = lastname;
	}
	
	public void set_ID(){
		this.personID = UUID.randomUUID();
	}
	
	
	//getters
	public String get_firstname(){
		return this.firstName;
	}
	
	public String get_lastname(){
		return this.lastName;
	}
	
	public UUID get_ID(){
		return this.personID;
	}
	
	
	public static void main(String[] args){
		Person Nick = new Person();
		Nick.set_firstname("baloney");
		Nick.set_lastname("Pompetti");
		Nick.set_ID();
		System.out.println(Nick.get_firstname());
		System.out.println(Nick.get_lastname());
		System.out.println(Nick.get_ID());
		
		
	}

}

package main;

public class Truck extends Vehicle implements vehicle_interface{
	private Integer numberOfAxels;
	
	public void set_axels(Integer num_Of_axels){
		this.numberOfAxels= num_Of_axels;
	}
	
	public void transferOwnership(Person newOwner) {
		this.set_Owner(newOwner);
	}


	
	

}

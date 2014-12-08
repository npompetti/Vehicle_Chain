package main;

public class Car extends Vehicle implements vehicle_interface {
	
	private Integer numberOfDoors;
	
	public Car(){
	}
	
	public void set_numDoors(Integer num_doors){
		this.numberOfDoors = num_doors;
	}

	@Override
	
	public void transferOwnership(Person newOwner) {
		this.set_Owner(newOwner);
	}

	

	
	
	
}

package main;

public class Motorcycle extends Vehicle implements vehicle_interface{
	
	private Boolean hasSideCar;
	
	public Motorcycle(){	
	}
	
	//setter
	public void set_sidecar(Boolean t_f){
		this.hasSideCar = t_f;
	}
	
	public void transferOwnership(Person newOwner) {
		this.set_Owner(newOwner);
	}

	
	

	

}

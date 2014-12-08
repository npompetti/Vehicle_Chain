package main;

abstract class Vehicle {
	
	private String car_name;
	private String color;
	private Integer Weight;
	private Person Owner;
	
	
	abstract void transferOwnership(Person newOwner);
	
	public void set_name(String carName){
		this.car_name= carName;
	}
	
	public void set_color(String car_color){
		this.color = car_color;
	}
	
	public void set_Weight(Integer car_weight){
		this.Weight = car_weight;
	}
	
	public void set_Owner(Person owner){
		this.Owner = owner;
	}
	
	
	//getter
	public String get_Owner(){
		String owner_firstname= this.Owner.get_firstname();
		String owner_lastname= this.Owner.get_lastname();
		String full_name = owner_firstname+" "+owner_lastname;
		return full_name;
	}

}

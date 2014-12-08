package main;

public class Test_Vehicle {
	
	public static void main(String[] args){
		Person a = new Person();
		a.set_firstname("nick");
		Car camry = new Car();
		camry.set_Owner(a);
		camry.set_numDoors(4);
		
		Truck frontier = new Truck();
		frontier.set_Owner(a);
		frontier.set_axels(2);
		
		Person b = new Person();
		b.set_firstname("paul");
		b.set_lastname("burger");
		frontier.transferOwnership(b);
		System.out.println(frontier.get_Owner());
		
		Motorcycle harley = new Motorcycle();
		harley.set_sidecar(false);
		
		
	}

}

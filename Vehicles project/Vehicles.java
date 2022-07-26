import java.util.*;

public class Vehicles {
	private ArrayList<Vehicle> fleet;
	
	public Vehicles() {
		fleet = new ArrayList<Vehicle>();
	}
	public void setFleet(ArrayList<Vehicle> fleet) {
		this.fleet = fleet;
	}
	public ArrayList<Vehicle> getFleet(){
		return fleet;
	}
	public void addVehicle(Vehicle vehicle) {
		fleet.add(vehicle);
		System.out.println("Vehicle has been added to the fleet");
	}
	public void listVehicles() {
		System.out.println("--------------------------");
		for(Vehicle elem : fleet) {
			System.out.println(elem.toString());
		}		
		System.out.println("--------------------------");
	}
	public void hiredVehicles() {
		System.out.println("--------------------------");
		for(Vehicle elem : fleet) {
			if(elem.isHired()) {
				System.out.println(elem.toString());
			}
			System.out.println("--------------------------");
		}
	}
}

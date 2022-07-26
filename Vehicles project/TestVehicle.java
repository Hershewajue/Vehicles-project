import java.util.*;
public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle veh1 = new Vehicle("Toyota", "Highlander", "ABD234CA");
		Car car1 = new Car("Honda", "Accord", "EPE345GU", 5, "56");
		Van van1 = new Van("Volkswagen", "Spacepilot", "ABU432DX", 20);
		Vehicle veh2 = new Vehicle("Mercedez", "Benz", "CDS5634CA");
		Car car2 = new Car("Honda", "Accord", "EPE345GU", 9, "75");
		Van van2 = new Van("Volvo", "LX45", "AFSU432DX", 30);
		
		Vehicles myFleet = new Vehicles();
		myFleet.addVehicle(veh1);
		myFleet.addVehicle(car1);
		myFleet.addVehicle(van1);
		
		
		System.out.println("All vehicles: ");
		myFleet.listVehicles();
		
		car1.setHired(true);
		van2.setHired(true);
		veh1.setHired(true);
		
	}

}

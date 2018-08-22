import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		
		Car betty = new Car("GL04", 4, false, 4);
		Moped june = new Moped("FL10", 2, true, 20);
		Motorbike janet = new Motorbike("WN04", 2, false, 2);
		
		ArrayList<Vehicle> vehicleList = new ArrayList<>();
		vehicleList.add(betty);
		vehicleList.add(june);
		vehicleList.add(janet);
		
		Garage abc = new Garage("Bill's", vehicleList);
		
		/*for (Vehicle i : abc.getArray()) {
			System.out.println(i.getID());
			System.out.println(abc.calculateCost(i));
		}*/
		System.out.println("Welcome to " + abc.getName() + " Garage!");
		
		//abc.removeVehicleID("GL04");
		abc.removeVehicleType("Moped");
		/*abc.printID();*/
		
		
		for(Vehicle i : abc.getArray()) {
			System.out.println(i.getID());
			System.out.println(i.calculateCost());
			System.out.println(abc.calCost(i));
		}
		
		abc.calCostOne("GL04");
		
	}

}

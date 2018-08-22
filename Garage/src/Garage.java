import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> clients;
	private String name;
	
	Garage(String name, ArrayList<Vehicle> clients){
		this.clients = clients;
		this.name = name;
	}
	
	public ArrayList<Vehicle> getArray(){
		return this.clients;
	}
	
	public String getName(){
		return this.name;
	}
	
	
	public int calCost(Vehicle vehicle) {
		if(vehicle instanceof Car) {
			Car car = (Car) vehicle;
			if (car.getEngine()) {
				return (100 * car.getWheels() + 10 * car.getDoors() + 500);
			}
			else {
				return(100 * car.getWheels() + 10 * car.getDoors());
			}
		}
		else if (vehicle instanceof Moped) {
			Moped moped = (Moped) vehicle;
			if (moped.getEngine()) {
				return (30 * moped.getWheels() + moped.getCapacity() + 250);
			}
			else {
				return(30 * moped.getWheels() + moped.getCapacity());
			}
		}
		else if (vehicle instanceof Motorbike) {
			Motorbike motorbike = (Motorbike) vehicle;
			if (motorbike.getEngine()) {
				return (50 * motorbike.getWheels() + motorbike.getRiders() * 50 + 300);
			}
			else {
				return(50 * motorbike.getWheels() + motorbike.getRiders() * 50);
			}
		}
		else {
			return 0;
		}
	}

	public void calCostOne(String id) {
		ArrayList<Vehicle> toCalculate = new ArrayList<>();
		for(Vehicle i : clients) {
			if (i.getID() == id) {
				toCalculate.add(i);
			}
		}
		for(Vehicle i : toCalculate) {
			System.out.println(calCost(i));
		}
	}
	
	public void addVehicle(Vehicle vehicle) {
		clients.add(vehicle);
	}
	
	/*public void printID() {
		for (Vehicle i : clients) {
			System.out.println(i.getID());
		}
	}*/
	
	public void removeVehicleID(String id) {
		ArrayList<Vehicle> toRemove = new ArrayList<>();
		for(Vehicle i : clients) {
			if (i.getID() == id) {
				toRemove.add(i);
			}
		}
		clients.removeAll(toRemove);
	}
	
	public void empty() {
		clients.removeAll(clients);
	}

	public void removeVehicleType(String type) {
		ArrayList<Vehicle> toRemove = new ArrayList<>();
		for(Vehicle i : clients) {
			if (i.getClass().getName() == type) {
				toRemove.add(i);
			}
		}
		clients.removeAll(toRemove);
	}
	



}

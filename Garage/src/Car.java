
public class Car extends Vehicle {
	private int doors;
	
	Car(String id, int wheels, boolean engine, int doors){
		setID(id);
		setWheels(wheels);
		setEngine(engine);
		this.doors = doors;
	}
	
	public int getDoors() {
		return doors;
	}
	
	public int calculateCost() {
		if (getEngine()) {
			return (100 * getWheels() + 10 * doors + 500);
		}
		else {
			return(100 * getWheels() + 10 * doors);
		}
	}
}

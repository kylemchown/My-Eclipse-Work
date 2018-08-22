
public class Moped extends Vehicle {
	private int capacity;
	
	Moped(String id, int wheels, boolean engine, int capacity){
		setID(id);
		setWheels(wheels);
		setEngine(engine);
		this.capacity = capacity;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int calculateCost() {
		if (getEngine()) {
			return (30 * getWheels() + capacity + 250);
		}
		else {
			return(30 * getWheels() + capacity);
		}
	}
}

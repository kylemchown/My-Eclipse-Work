
public class Motorbike extends Vehicle {
	private int riders;
	
	Motorbike(String id, int wheels, boolean engine, int riders){
		setID(id);
		setWheels(wheels);
		setEngine(engine);
		this.riders = riders;
	}
	
	public int getRiders() {
		return riders;
	}
	
	public int calculateCost() {
		if (getEngine()) {
			return (50 * getWheels() + riders * 50 + 300);
		}
		else {
			return(50 * getWheels() + riders * 50);
		}
	}
}

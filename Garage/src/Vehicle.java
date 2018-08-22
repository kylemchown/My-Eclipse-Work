
public abstract class Vehicle {
	private String id;
	private int wheels;
	private boolean engine;

	public void setID(String id) {
		this.id = id;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public void setEngine(boolean engine) {
		this.engine = engine;
	}

	public String getID() {
		return this.id;
	}

	public int getWheels() {
		return this.wheels;
	}

	public boolean getEngine() {
		return this.engine;
	}

	public abstract int calculateCost();
}


public class Paint {
	private String name;
	private int litres;
	private int m2perlitre;
	private float price;
	
	Paint(String name, int litres, int m2perlitre, float price){
		this.litres = litres;
		this.m2perlitre = m2perlitre;
		this.price = price;
		this.name = name;
	}
	
	public int coverage() {
		return litres * m2perlitre;
	}
	
	public int getM2PerLitre() {
		return m2perlitre;
	}
	
	public float getPrice(){
		return price;
	}
	
	public String getName(){
		return name;
	}
}

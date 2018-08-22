import java.util.ArrayList;

public class Room {

	private int size;
	
	Room(int size){
		this.size = size;
	}
	
	public int waste(Paint paint){
		int waste = (paint.coverage() - (size % paint.coverage())) / paint.getM2PerLitre();
		return waste;
	}
	
	public int waste(Paint paint, int size){
		int waste = (paint.coverage() - (size % paint.coverage())) / paint.getM2PerLitre();
		return waste;
	}
	
	public void leastWaste(ArrayList<Paint> paints, int size) {
		for (Paint i : paints) {
			System.out.println(waste(i, size));
		}
	}
	
	public String cheapest(ArrayList<Paint> paints ) {
		float min = 999999999;
		int position = 0;
		int current = -1;
		for (Paint i : paints) {
			current++;
			int cans = ((int) (this.size / i.coverage())) + 1;
			float cost = i.getPrice() * cans;
			if (cost < min) {
				min = cost;
				position = current;
			}
		}
		return (paints.get(position)).getName();
	}
	
	public String cheapest(ArrayList<Paint> paints, int size ) {
		float min = 999999999;
		int position = 0;
		int current = -1;
		for (Paint i : paints) {
			current++;
			int cans = (int) Math.ceil(size / i.coverage());  //Ahhhhhhh doesn't round properly
			float cost = i.getPrice() * cans;
			if (cost < min) {
				min = cost;
				position = current;
			}
		}
		return (paints.get(position)).getName();
	}
	
	public double test(int first, int second) {
		double f = first;
		double s = second;
		return Math.ceil(f / s);
	}
	
}

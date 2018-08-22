
public class Factorial {
	
	public String reverseFactorial(double num) {
		int i = 0;
		while (num > 1) {
			i++;
			num = num / i;
		}
		if (num == 1) {
			return String.valueOf(i);
		}
		else {
			return "None";
		}
	}
	
	
	
}

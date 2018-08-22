
public class MethodClass {
	String output = "Hello World";

	public void output(String input) {
		System.out.println(input);
	}
	
	public String returnTest() {
		String output = "Hello World";
		return output;
	}

	public int sum(int first, int second, boolean boo) {
		if (first == 0 || second == 0) {
			return first + second;
		}
		else if (boo) {
			int result = first + second;
			return result;
		}
		else {
			int result = first * second;
			return result;
		}
	}
}

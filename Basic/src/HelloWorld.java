
public class HelloWorld {

	public static void main(String[] args) {
		
		MethodClass testObject = new MethodClass();
		
		testObject.output("sdjbjh");
		
		System.out.println(testObject.returnTest());
		
		System.out.println(testObject.sum(3, 0, true));
		
		for (int i = 0; i < 10; i++) {
			System.out.println(testObject.sum(3, i, true));
		}
		
		int[] arrayOfInts = new int[10];
		
		for (int i = 0; i < 10; i++) {
			arrayOfInts[i] = i;
		}
		
		System.out.println(testObject.sum(arrayOfInts[2], arrayOfInts[3], true));
		
		for (int i : arrayOfInts) {
			System.out.println(i);
		
		}
		
		int[] fiveValues = new int[5];
		
		int num = 0;
		for (int i : fiveValues) {
			fiveValues[num] = num;
			System.out.println(fiveValues[num]);
			++num;
		}
		int numb = 0;
		for (int i : fiveValues) {
			fiveValues[numb] = i * 10;
			System.out.println(fiveValues[i]);
			++numb;
		}
		
	}
	
	/*public String returnTest() {
		String output = "Hello World";
		return output;
	}*/

}

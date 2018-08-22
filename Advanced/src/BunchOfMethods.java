
public class BunchOfMethods {

	public int blackjack(int first, int second) {
		if (((first > second) || second > 21) && first < 22 && first > 0) {
			return first;
		} else if (((second > first) || first > 21) && second < 22 && second > 0) {
			return second;
		} else {
			return 0;
		}
	}

	public int uniqueSum(int first, int second, int third) {
		if (first == second && first == third) {
			return 0;
		} else if (first == second) {
			return third;
		} else if (first == third) {
			return second;
		} else if (second == third) {
			return first;
		} else {
			return (first + second + third);
		}

	}

	public boolean tooHot(int temp, boolean summer) {
		if (summer) {
			if (temp < 101 && temp > 59) {
				return true;
			} else {
				return false;
			}
		} else {
			if (temp < 91 && temp > 59) {
				return true;
			} else {
				return false;
			}
		}
	}

}

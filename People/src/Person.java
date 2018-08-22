import java.util.ArrayList;

public class Person {

	private int age;
	private String name;
	private String job;

	Person(int age, String name, String job) {
		this.age = age;
		this.name = name;
		this.job = job;

	}

	public String getname() {
		return name;
	}

	public String toString() {
		return ("My name is " + name + ", my age is " + age + " and my job is " + job);
	}

	public static ArrayList<Person> searchName(String name, ArrayList<Person> list) {
		ArrayList<Person> searchResult = new ArrayList<>();
		for (Person i : list) {
			if (i.getname() == name) {
				searchResult.add(i);
			}
		}
		return searchResult;
	}

}
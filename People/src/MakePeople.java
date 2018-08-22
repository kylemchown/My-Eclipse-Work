import java.util.ArrayList;

public class MakePeople {

	public static void main(String[] args) {
		
		Person jack = new Person(18, "Jack", "Postman");
		Person john = new Person(23, "John", "Milkman");
		Person jim = new Person(34, "Jim", "Clerk");
		Person jim2 = new Person(35, "Jim", "Cleric");
		
/*		System.out.println(jack.info());
		System.out.println(john.info());
		System.out.println(jim.info());*/
		
		ArrayList<Person> peopleList = new ArrayList<>();
		peopleList.add(john);
		peopleList.add(jack);
		peopleList.add(jim);
		peopleList.add(jim2);
		
		for(Person i : peopleList) {
			System.out.println(i.toString());
		}
		
		for (Person i : Person.searchName("Jim", peopleList)) {
			System.out.println(i.toString());
		}
		//Person.searchName("Jack", peopleList);
		
	}

}
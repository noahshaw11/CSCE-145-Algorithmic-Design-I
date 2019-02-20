
public class TesterDotEXE {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Person[] people = new Person[3];
		people[0] = new Person();
		people[1] = new Student();
		people[2] = new Ugrad();
		for(Person p: people)
		{
			System.out.println(p);
		}
	}

}

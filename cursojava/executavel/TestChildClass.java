package cursojava.executavel;

import cursojava.classes.Director;
import cursojava.classes.Secretary;
import cursojava.classes.Student;

public class TestChildClass {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setName("Haaland");
		
		Director director = new Director();
		director.setName("Diretor da escola");
		
		Secretary secretary = new Secretary();
		secretary.setName("Novo secretario");
		secretary.setExperience("Admin de DB");
		
		System.out.println(director);
		System.out.println("================================================================================");
		System.out.println(secretary);

	}

}

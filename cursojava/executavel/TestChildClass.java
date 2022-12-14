package cursojava.executavel;

import cursojava.classes.Director;
import cursojava.classes.Person;
import cursojava.classes.Secretary;
import cursojava.classes.Student;

public class TestChildClass {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setName("Haaland");
		
		Director director = new Director();
		director.setName("Diretor da escola");
		director.setAge(49);
		
		Secretary secretary = new Secretary();
		secretary.setName("Novo secretario");
		secretary.setExperience("Admin de DB");
		
		System.out.println(director);
		System.out.println("================================================================================");
		System.out.println(director.msgIsOlder());
		System.out.println("================================================================================");
		System.out.println(secretary);
		System.out.println("================================================================================");
		System.out.println("S?lario do Diretor ? de: R$" + director.salary());
		System.out.println("S?lario do Secretario ? de: R$" + secretary.salary());
		System.out.println("S?lario do Aluno ? de: R$" + student.salary());
		
		System.out.println("================================================================================");

		Person person = new Student();
		person = director;
		System.out.println(person.salary());
		
		System.out.println("================================================================================");
	
		teste(student);
		teste(director);
		teste(secretary);
	}
	
	public static void teste(Person person) {
		System.out.println(person.getName() + " ? legal " +
				" e seu salario ? de: " + person.salary());
	}

}

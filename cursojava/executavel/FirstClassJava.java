package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Student;

public class FirstClassJava {
//	Main is a auto run object in Java
	public static void main(String[] args) {
//		Object does not yet in memory
		Student std1;
		
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		String idade = JOptionPane.showInputDialog("Informe sua idade");

		
//		Now we have a object in memory.
		Student std2 = new Student();
		
		std2.setName(nome);
		std2.setAge(Integer.valueOf(idade));	
		
//		new Student() is a instance.
		Student std3 = new Student("Renan");
		
		
//		std4 is a reference.
		Student std4 = new Student("Renan", 25);

		System.out.println(std2);

	}

}

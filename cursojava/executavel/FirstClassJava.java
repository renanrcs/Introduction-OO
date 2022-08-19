package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Disciplina;
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
		
//		Instacia de disciplina e passando seus atributos
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de Dados");
		disciplina1.setNota(95);
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Java Script");
		disciplina2.setNota(90);
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Angular");
		disciplina3.setNota(80);
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("java Web");
		disciplina4.setNota(100);
		
//		Adicionando disciplina a lista de disciplinas
		std2.getDisciplina().add(disciplina1);
		std2.getDisciplina().add(disciplina2);
		std2.getDisciplina().add(disciplina3);
		std2.getDisciplina().add(disciplina4);
		
//		new Student() is a instance.
		Student std3 = new Student("Renan");
		
		
//		std4 is a reference.
		Student std4 = new Student("Renan", 25);

		System.out.println("Média do " + std2.getName() + " é: " + std2.getMedia() +
		(std2.getAlunoAprovado() ? " Aprovado" : " Reprovado"));

	}

}

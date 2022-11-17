package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Disciplina;
import cursojava.classes.Student;

public class ArrayVetor {
//	used for execute code
	public static void main(String[] args) {
		
		/* Array can be all types of data and objects too*/
		double[] notas = {8.8, 9.7, 7.5, 8.0};
		double[] notasAngular = {7.8, 6.7, 7.7, 4.0};
		
		Student std1 = new Student();
		std1.setName("Renan");
		
		Student std2 = new Student();
		std2.setName("Renan Cavalcante");
		
		Disciplina d1 = new Disciplina();
		d1.setDisciplina("Angular");
		d1.setNota(notasAngular);
		std1.getDisciplina().add(d1);

		Disciplina d2 = new Disciplina();
		d2.setDisciplina("Bootatrap");
		d2.setNota(notasAngular);
		std1.getDisciplina().add(d2);

		Disciplina d3 = new Disciplina();
		d3.setDisciplina("Java");
		d3.setNota(notas);
		std2.getDisciplina().add(d3);
		Disciplina d4 = new Disciplina();
		d4.setDisciplina("Springboot");
		d4.setNota(notas);
		std2.getDisciplina().add(d4);
		
//------------------------------------------------------------------------------------------------------------------------//
		
		Student[] arrayStd = new Student[2]; 
		arrayStd[0] = std1;
		arrayStd[1] = std2;
		
//		for(int j = 0; j < arrayStd.length; j++) {
//			System.out.println("Nome do aluno é: " + arrayStd[j].getName());
//		}
		
		for (Student s : arrayStd) {
			System.out.println("Aluno: "+s.getName());
			for (Disciplina d : s.getDisciplina()) {
				System.out.println("Disciplina: "+d.getDisciplina());
				for (double n : d.getNotaD()) {
					System.out.println("Notas: "+ n);
				}
			}
		}
	}
}




























package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Disciplina;
import cursojava.classes.Student;

public class FirstClassJava {
//	Main is a auto run object in Java
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		for(int qtd = 1; qtd <= 2; qtd++) {
		
		String nome = JOptionPane.showInputDialog("Informe o nome do aluno " + qtd);
//		String idade = JOptionPane.showInputDialog("Informe sua idade");
		
//		Now we have a object in memory.
		Student std2 = new Student();
		
		std2.setName(nome);
//		std2.setAge(Integer.valueOf(idade))
		
		for(int i = 1; i <= 2; i++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina: " + i);
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina: " + i);
			
//		Instacia de disciplina e passando seus atributos
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
//		Adicionando disciplina a lista de disciplinas
			std2.getDisciplina().add(disciplina);
		}
		
		int option = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if(option == 0) {
			
			int continuar = 0;
			int count = 1;
			
			while(continuar == 0) {
				
			String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover? \n-1 -2 -3 -4");
			std2.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() - count);
			count++;
			continuar = JOptionPane.showConfirmDialog(null, "Deseja remover outra disciplina?");
			}
		}
		
		students.add(std2);
	}

			for (Student student : students) {	
				
				if(student.getName().equalsIgnoreCase("enan")) {			
					students.remove(student);
					break;
				}
			}
			
			System.out.println("Lista de Alunos e M�dia");
			
			for (Student student : students) {				
				System.out.println("M�dia do " + student.getName() + " �: " + student.getMedia() +
						student.getAlunoAprovado2());
			}
			
			System.out.println("\nNotas de cada Mat�ria por aluno:");
			System.out.println("-----------------------------------------------------------------");
			for (Student student : students) {
				
				System.out.println("Aluno: " + student.getName());
				for(Disciplina disciplina : student.getDisciplina() ) {
					System.out.println("Mat�ria - " + disciplina.getDisciplina() + "\tNota: " + disciplina.getNota());
				}
				System.out.println("-----------------------------------------------------------------");
			}
			

	}

}










package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Disciplina;
import cursojava.classes.Secretary;
import cursojava.classes.Student;
import cursojava.constantes.StatusStudent;
import cursojava.interfaces.AllowAccess;

public class FirstClassJava {
//	Main is a auto run object in Java
	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe nome de usuario");
		String password = JOptionPane.showInputDialog("Informe sua senha");
				
		if(new Secretary().authentication(login, password)) {
			
		List<Student> students = new ArrayList<Student>();
		
		HashMap<String, ArrayList<Student>> maps = new HashMap<String, ArrayList<Student>>(); 
		
		for(int qtd = 1; qtd <= 5; qtd++) {
		
		String nome = JOptionPane.showInputDialog("Informe o nome do aluno " + qtd);
//		String idade = JOptionPane.showInputDialog("Informe sua idade");
		
//		Now we have a object in memory.
		Student std2 = new Student();
		
		std2.setName(nome);
//		std2.setAge(Integer.valueOf(idade))
		
		for(int i = 1; i <= 1; i++) {
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
			
			for(int count = 0; count < students.size(); count++) {
				
				if(students.get(count).getName().equalsIgnoreCase("Renan")) {
					
				Student newStudent = new Student();
				
				newStudent.setName("Novo Aluno");
				
				Disciplina disciplina = new Disciplina();	
				disciplina.setDisciplina("Java Web");
				disciplina.setNota(8);
				
				newStudent.getDisciplina().add(disciplina);
				
				students.set(count, newStudent);
				}
			}
			
			System.out.println("Lista de Alunos e Média");
			
			for (Student student : students) {				
				System.out.println("Média do " + student.getName() + " é: " + student.getMedia() +
						student.getAlunoAprovado2());
			}
			
			System.out.println("\nNotas de cada Matéria por aluno:");
			System.out.println("-----------------------------------------------------------------");
			
			for (Student student : students) {
				
				System.out.println("Aluno: " + student.getName());
				for(Disciplina disciplina : student.getDisciplina() ) {
					System.out.println("Matéria - " + disciplina.getDisciplina() + "\tNota: " + disciplina.getNota());
				}
				System.out.println("-----------------------------------------------------------------");
			}
			
			maps.put(StatusStudent.APROVADO, new ArrayList<>());
			maps.put(StatusStudent.RECUPERACAO, new ArrayList<>());
			maps.put(StatusStudent.REPROVADO, new ArrayList<>());
			
			for(Student student: students) { //Separated by List
				
				if(student.getAlunoAprovado2().equalsIgnoreCase(StatusStudent.APROVADO)) {
					maps.get(StatusStudent.APROVADO).add(student);
				}else if(student.getAlunoAprovado2().equalsIgnoreCase(StatusStudent.RECUPERACAO)) {
					maps.get(StatusStudent.RECUPERACAO).add(student);
				}else {
					maps.get(StatusStudent.REPROVADO).add(student);
				}
			}
			
			System.out.println("-------------Lista Aprovados------------------");
			for (Student student : maps.get(StatusStudent.APROVADO)) {
				System.out.println(student.getName());
			}
			
			System.out.println("-------------Lista Recuperação------------------");
			for (Student student : maps.get(StatusStudent.RECUPERACAO)) {
				System.out.println(student.getName());
			}
			
			System.out.println("-------------Lista Reprovados-------------------");
			for (Student student : maps.get(StatusStudent.REPROVADO)) {
				System.out.println(student.getName());
			}
			
		}else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}
	}

}






















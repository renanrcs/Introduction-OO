package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.exception.ExceptionProcessNote;
import cursojava.auxiliaryclass.AuthenticationFunction;
import cursojava.classes.Director;
import cursojava.classes.Disciplina;
import cursojava.classes.Student;
import cursojava.constantes.StatusStudent;

public class FirstClassJava {
//	Main is a auto run object in Java
	public static void main(String[] args) {

		try {
			
//			try {
//				File file = new File("arquivo.txt");
//				Scanner scanner = new Scanner(file);
//			} catch (FileNotFoundException e) {
//				throw new ExceptionProcessNote(e.getMessage());
//			}

			String login = JOptionPane.showInputDialog("Informe nome de usuario");
			String password = JOptionPane.showInputDialog("Informe sua senha");

			if (new AuthenticationFunction(new Director(login, password)).authenticate()) {/* only who with */

				List<Student> students = new ArrayList<>();

				HashMap<String, ArrayList<Student>> maps = new HashMap<String, ArrayList<Student>>();

				for (int qtd = 1; qtd <= 1; qtd++) {
					double[] notas = new double[4];
					String nome = JOptionPane.showInputDialog("Informe o nome do aluno " + qtd);
					String idade = JOptionPane.showInputDialog("Informe sua idade");

//		Now we have a object in memory.
					Student std2 = new Student();

					std2.setName(nome);
					std2.setAge(Integer.valueOf(idade));

					for (int i = 1; i <= 1; i++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina: " + i);

//		Instacia de disciplina e passando seus atributos
						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						
						for (int j = 0; j < notas.length; j++) {
							notas[j] = Double.valueOf(JOptionPane.showInputDialog("Informe "+ (j+1) + "ª nota"));
						}
						disciplina.setNota(notas);

//		Adicionando disciplina a lista de disciplinas
						std2.getDisciplina().add(disciplina);
					}

					int option = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

					if (option == 0) {

						int continuar = 0;
						int count = 1;

						while (continuar == 0) {

							String disciplinaRemover = JOptionPane
									.showInputDialog("Qual disciplina deseja remover? \n-1 -2 -3 -4");
							std2.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() - count);
							count++;
							continuar = JOptionPane.showConfirmDialog(null, "Deseja remover outra disciplina?");
						}
					}

					students.add(std2);
					 
				}
//				Metodo para remover
				
				for (Student student : students) { 
					if(student.removeStudent("gabriel")) {
						students.remove(student);
						break; 
					}
				}
				 
//				Metodo para substituir
				for (int count = 0; count < students.size(); count++) {
					if (students.get(count).getName().equalsIgnoreCase("Renan")) {
						Student newStudent = new Student();
						newStudent.setName("Novo Aluno");
						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina("Java Web");
//						disciplina.setNota(notas);

						newStudent.getDisciplina().add(disciplina);

						students.set(count, newStudent);
					}
				}//Esse metodo deve ser abstrato e implementado na classe

				System.out.println("Lista de Alunos e Média");

				for (Student student : students) {
					System.out.println("Média do " + student.getName() + " é: " + student.getMedia()
							+ student.getAlunoAprovado2());
				}

				System.out.println("\nNotas de cada Matéria por aluno:");
				System.out.println("-----------------------------------------------------------------");

				for (Student student : students) {

					System.out.println("Aluno: " + student.getName());
					for (Disciplina disciplina : student.getDisciplina()) {
						System.out
								.println("Matéria - " + disciplina.getDisciplina() + "\tNotas: " + disciplina.getNota());
					}
					System.out.println("Sua maior nota foi: "+ student.getMaiorNota());
					System.out.println("Sua menor nota foi: "+ student.getMenorNota());
					System.out.println("-----------------------------------------------------------------");
				}

				maps.put(StatusStudent.APROVADO, new ArrayList<>());
				maps.put(StatusStudent.RECUPERACAO, new ArrayList<>());
				maps.put(StatusStudent.REPROVADO, new ArrayList<>());

				for (Student student : students) { // Separated by List

					if (student.getAlunoAprovado2().equalsIgnoreCase(StatusStudent.APROVADO)) {
						maps.get(StatusStudent.APROVADO).add(student);
					} else if (student.getAlunoAprovado2().equalsIgnoreCase(StatusStudent.RECUPERACAO)) {
						maps.get(StatusStudent.RECUPERACAO).add(student);
					} else {
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

			} else {
				JOptionPane.showMessageDialog(null, "Acesso não permitido");
			}

		} catch (NumberFormatException e) {

			StringBuilder out = new StringBuilder();

			e.printStackTrace();// print error in the java console

			for (int i = 0; i < e.getStackTrace().length; i++) {
				out.append("\n Classe de erro : " + e.getStackTrace()[i].getClassName());
				out.append("\n Metodo de erro : " + e.getStackTrace()[i].getMethodName());
				out.append("\n Linha de erro : " + e.getStackTrace()[i].getLineNumber());
				out.append("\n Classe : " + e.getClass().getName());
			}

			JOptionPane.showMessageDialog(null, "Erro de conversão de números " + out.toString());
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Erro de null pointer Exception " + e.getClass());
		} catch (Exception e) {//catch all exceptions we don't foresee
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro inesperado " + e.getClass().getName());
		} finally {// always runs. if there are errors or not.
			JOptionPane.showMessageDialog(null, "Obrigado por aprender JAVA ");
		}

	}// main

}

package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Disciplina;
import cursojava.classes.Student;

public class FirstClassJava {
//	Main is a auto run object in Java
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Informe seu nome");
//		String idade = JOptionPane.showInputDialog("Informe sua idade");
		
//		Now we have a object in memory.
		Student std2 = new Student();
		
		std2.setName(nome);
//		std2.setAge(Integer.valueOf(idade))
		
		for(int i = 1; i <= 4; i++) {
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
			String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover? \n- 1\t - 2\t - 3\t - 4");
			std2.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() -1);
		}

		System.out.println("Média do " + std2.getName() + " é: " + std2.getMedia() +
		std2.getAlunoAprovado2());

	}

}

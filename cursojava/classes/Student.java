package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
//	Atributos
	private String name;
	private int age;
	private String dateNasc;
	private String rg;
	private String cpf;
	private String nameFather;
	private String nameMather;
	private String dateEnrollment;
	private String nameSchool;
	private String serieEnrolled;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public List<Disciplina> getDisciplina() {
		return disciplinas;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplinas = disciplina;
	}

	//	Construtor
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDateNasc() {
		return dateNasc;
	}

	public void setDateNasc(String dateNasc) {
		this.dateNasc = dateNasc;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNameFather() {
		return nameFather;
	}

	public void setNameFather(String nameFather) {
		this.nameFather = nameFather;
	}

	public String getNameMather() {
		return nameMather;
	}

	public void setNameMather(String nameMather) {
		this.nameMather = nameMather;
	}

	public String getDateEnrollment() {
		return dateEnrollment;
	}

	public void setDateEnrollment(String dateEnrollment) {
		this.dateEnrollment = dateEnrollment;
	}

	public String getNameSchool() {
		return nameSchool;
	}

	public void setNameSchool(String nameSchool) {
		this.nameSchool = nameSchool;
	}

	public String getSerieEnrolled() {
		return serieEnrolled;
	}

	public void setSerieEnrolled(String serieEnrolled) {
		this.serieEnrolled = serieEnrolled;
	}

	
	
@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", dateNasc=" + dateNasc + ", rg=" + rg + ", cpf=" + cpf
				+ "\n, nameFather=" + nameFather + ", nameMather=" + nameMather + ", dateEnrollment=" + dateEnrollment
				+ "\n, nameSchool=" + nameSchool + ", serieEnrolled=" + serieEnrolled + "\n, disciplina=" + disciplinas
				+ "]";
	}

	//	Metodo que retorna a media do aluno
	public double getMedia() {
		
		double somaNotas = 0.0;
		
		for(Disciplina disciplina: disciplinas) {
			somaNotas += disciplina.getNota();
		}
		
		return somaNotas / disciplinas.size();
	}
	
//	Metodo para informar se o aluno foi Aprovado
	public boolean getAlunoAprovado() {
		double media = this.getMedia();
		
		if(media >= 7) {
			return true;
		}else {
			return false;
		}
	}
//	Metodo para informar se o aluno foi Aprovado, Recuperação, reprovado
	public String getAlunoAprovado2() {
		double media = this.getMedia();
		
		if(media >= 5) {
			if(media >= 7)
				return " Aluno Aprovado";
			return " Aluno em recuperação";
		}else {
			return " Reprovado";
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

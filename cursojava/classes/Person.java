package cursojava.classes;
//Super Class
public abstract class Person {
//	Atributes
	protected String name;
	protected int age;
	protected String dateNasc;
	protected String rg;
	protected String cpf;
	protected String nameFather;
	protected String nameMather;
	
	public abstract double salary();
	
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
	
	public boolean isOlder() {
		return this.age >= 18;
	}
}

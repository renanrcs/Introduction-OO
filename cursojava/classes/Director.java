package cursojava.classes;

public class Director extends Person{
	
	private String educationRegister;
	private int directionTime;
	private String titration;
	
	public String getEducationRegister() {
		return educationRegister;
	}
	public void setEducationRegister(String educationRegister) {
		this.educationRegister = educationRegister;
	}
	public int getDirectionTime() {
		return directionTime;
	}
	public void setDirectionTime(int directionTime) {
		this.directionTime = directionTime;
	}
	public String getTitration() {
		return titration;
	}
	public void setTitration(String titration) {
		this.titration = titration;
	}
	@Override
	public String toString() {
		return "Director [educationRegister=" + educationRegister + ", directionTime=" + directionTime + ",\n titration="
				+ titration + ", name=" + name + ", age=" + age + ", dateNasc=" + dateNasc + ", rg=" + rg + ",\n cpf="
				+ cpf + ", nameFather=" + nameFather + ", nameMather=" + nameMather + "]";
	}
	
	

}

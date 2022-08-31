package cursojava.classes;

import cursojava.interfaces.AllowAccess;

public class Director extends Person implements AllowAccess{
	
	private String educationRegister;
	private int directionTime;
	private String titration;
	
	private String login;
	private String password;
	
	public Director() {
		super();
	}
	public Director(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
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
	
	@Override /*Identifica metodo sobreescrito*/
	public boolean isOlder() {
		// TODO Auto-generated method stub
		return super.isOlder();
	}
	
	public String msgIsOlder() {
		return this.isOlder() ? "Maior de Idade" : "Menor de idade";
	}
	
	@Override
	public String toString() {
		return "Director [educationRegister=" + educationRegister + ", directionTime=" + directionTime + ",\n titration="
				+ titration + ", name=" + name + ", age=" + age + ", dateNasc=" + dateNasc + ", rg=" + rg + ",\n cpf="
				+ cpf + ", nameFather=" + nameFather + ", nameMather=" + nameMather + "]";
	}
	@Override
	public double salary() {
		// TODO Auto-generated method stub
		return 3900.78;
	}
	
	/*this method doesn't used*/
	@Override
	public boolean authentication(String login, String password) {
		this.login = login;
		this.password = password;
		return authentication();
	}

	/*this method of authentication contract*/	
	@Override
	public boolean authentication() {
		return this.login.equalsIgnoreCase("renan") && 
				this.password.equalsIgnoreCase("123");
	}
	
	

}

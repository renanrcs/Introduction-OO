package cursojava.classes;

import cursojava.interfaces.AllowAccess;

public class Secretary extends Person implements AllowAccess {
	
	private String register;
	private String jobLevel;
	private String experience;
	
	private String login;
	private String password;
	
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getJobLevel() {
		return jobLevel;
	}
	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	@Override
	public String toString() {
		return "Secretary [register=" + register + ", jobLevel=" + jobLevel + ", experience=" + experience + ",\n name="
				+ name + ", age=" + age + ", dateNasc=" + dateNasc + ", rg=" + rg + ", cpf=" + cpf + ",\n nameFather="
				+ nameFather + ", nameMather=" + nameMather + "]";
	}
	@Override
	public double salary() {
		// TODO Auto-generated method stub
		return 1800.80 * 0.9;
	}
	
	/*this method of authentication contract*/
	@Override
	public boolean authentication() {
		return this.login.equalsIgnoreCase("adimin") &&
				this.password.equalsIgnoreCase("adimin");
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}

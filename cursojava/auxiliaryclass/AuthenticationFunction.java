package cursojava.auxiliaryclass;

import cursojava.interfaces.AllowAccess;

/*receive only someone that have the interface contract*/
public class AuthenticationFunction {
	
	private AllowAccess allowAccess;
	
	public AuthenticationFunction(AllowAccess allowAccess) {
		super();
		this.allowAccess = allowAccess;
	}

	public boolean authenticate() {
		return allowAccess.authentication();
	}

}

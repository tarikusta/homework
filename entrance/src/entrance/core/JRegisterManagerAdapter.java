package entrance.core;

import entrance.JRegister.JRegisterManager;

public class JRegisterManagerAdapter implements RegisterService {

	
	public void getRegisterInformations() {
		JRegisterManager manager= new JRegisterManager();
		manager.getInfo();
	}

}

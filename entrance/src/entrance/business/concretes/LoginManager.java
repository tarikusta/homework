package entrance.business.concretes;

import entrance.dataAccess.abstracts.UserDao;
import entrance.entities.concretes.Login;
import entrance.entities.concretes.User;

public class LoginManager {
	private UserDao userDao;

	public LoginManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	} 

	public void LoginSystem(Login login) {

		User user = this.userDao.get(login.getEmail());


		if(user == null) {
			System.out.println("B�yle bir mail adresi kay�tl� de�il!");
			return;
		}else if(login.getPassword() != user.getPassword()) {
			System.out.println("Parola hatal�!");
			return;
		}else {
			System.out.println("Giri� ba�ar�l�");
		}


	}

}

package entrance.JRegister;

import entrance.business.concretes.LoginManager;
import entrance.business.concretes.UserManager;
import entrance.dataAccess.concretes.HibernateUserDao;
import entrance.entities.concretes.Login;
import entrance.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		HibernateUserDao hiberDao = new HibernateUserDao();
		UserManager userManager = new UserManager(hiberDao);
		LoginManager loginManager = new LoginManager(hiberDao);

		
		User user = new User();
		user.setEmail("ramazan@gmail.com");
		user.setName("Ramazan");
		user.setLastName("Usta");
		user.setPassword("123456");

		userManager.add(user);

		//2.kayit
		User user2= new User();
		user2.setEmail("tarik@gmail.com");
		user2.setName("tarik");
		user2.setLastName("Usta");
		user2.setPassword("123456");
		
		userManager.add(user2);
		
		/*
		for (Register use : registerManager.getAll()) {
			System.out.println(use.getEmail());
		}
		*/
		Login login = new Login();
		login.setEmail("tarik@gmail.com");
		login.setPassword("123456");

		loginManager.LoginSystem(login);
	}


	}



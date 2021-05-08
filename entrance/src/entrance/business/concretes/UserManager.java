package entrance.business.concretes;

import java.util.List;

import entrance.business.abstracts.UserService;
import entrance.core.Regex;
import entrance.core.SendEmail;
import entrance.dataAccess.abstracts.UserDao;
import entrance.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao ;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		
		if(user.getPassword().length()<6) {
			System.out.println("Parola uzunluğu en az 6 karekter olmalıdır :");
			return;
		}
		if (Regex.isEmail(user.getEmail())) {
			System.out.println("Lütfen geçerli bir email giriniz");
		}
		if(user.getName().length()<2 || user.getLastName().length()<2) {
			System.out.println("isim ve soyisim uzunluğu en az 2 karakter olmalıdır!");
			return;
		}
		if(!checkForEmailIsUsed(user)) {
			System.out.println("Bu email adresi zaten kullanılmaktadır");
			return;
		}
		SendEmail.send(user.getEmail());
		this.userDao.add(user);

	}

	public boolean checkForEmailIsUsed(User user) {
		List<User> users = this.userDao.getAll();
		for (User use : users) {
			if(use.getEmail() == user.getEmail()) {
				return false;
			}
		}
		return true;
	}
	public void valideAccount(User user) {
		user.setActivated(true);
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		
		this.userDao.delete(user);
	}

	@Override
	public List<User> getAll() {
		
		return this.userDao.getAll();
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}	


}

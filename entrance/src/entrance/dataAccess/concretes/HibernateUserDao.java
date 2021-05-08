package entrance.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import entrance.dataAccess.abstracts.UserDao;
import entrance.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	private List<User> users;

	public HibernateUserDao() {
		this.users = new ArrayList<User>();

	}
	@Override
	public void add(User user) {
		System.out.println("Kullanýcý hibernate ile sisteme kayýt edildi.");
		this.users.add(user);

	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý hibernate ile sistemden silindi.");
		this.users.remove(user);
	}

	@Override
	public void update( User user) {
		System.out.println("Kullanýcý bilgileri hibernate ile güncellendi");


	}
	@Override
	public List<User> getAll() {
		return this.users;
	}
	@Override
	public User get(String email) {

		for (User reg : this.getAll()) {
			System.out.println(reg.getEmail());
			if(reg.getEmail()==email) {
				System.out.println(reg.getEmail());
				return reg;
			}
		}
		return null;
	}
}

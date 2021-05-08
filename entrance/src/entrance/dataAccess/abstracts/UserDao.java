package entrance.dataAccess.abstracts;

import java.util.List;

import entrance.entities.concretes.User;

public interface UserDao {
void add (User user);
void update(User user);
void delete(User user);
User get (String email);
List <User>getAll();  
}

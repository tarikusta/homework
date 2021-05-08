package entrance.entities.concretes;

import entrance.entities.abstracts.Entity;

public class User implements Entity {
private int id;
private String name;
private String lastName;
private String email;
private String password;
private boolean activated;
public User() {
	
}

public User(int id, String name, String lastName, String email, String password,boolean activated) {
	super();
	this.id = id;
	this.name = name;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
	this.activated = activated;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public boolean isActivated() {
	return activated;
}

public void setActivated(boolean activated) {
	this.activated = activated;
}

}

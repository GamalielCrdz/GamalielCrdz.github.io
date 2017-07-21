package services;

import entities.Usuarios;

public interface UserServices {
	
	Iterable<Usuarios> allUsers();
	
	Usuarios findById(Integer Id);
	
	Usuarios saveUser(Usuarios user);
	
	void deleteUser(Integer id);

}

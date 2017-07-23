package com.applicacion.services;

import com.applicacion.entities.Usuarios;

public interface UserServices {
	
	Iterable<Usuarios> allUsers();
	
	Usuarios findById(Integer Id);
	
	Usuarios saveUser(Usuarios user);
	
	void deleteUser(Integer id);

}

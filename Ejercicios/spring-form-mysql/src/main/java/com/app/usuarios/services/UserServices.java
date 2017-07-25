package hello;

import java.util.List;

public interface UserServices {
	
	Iterable<Usuarios> allUsers();
	
	Usuarios findById(Integer Id);
	
	Usuarios saveUser(Usuarios user);
	
	void deleteUser(Integer id);

}

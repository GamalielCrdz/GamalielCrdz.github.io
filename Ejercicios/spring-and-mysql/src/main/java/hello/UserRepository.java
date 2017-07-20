package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import hello.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	public User findById(Integer id);

}

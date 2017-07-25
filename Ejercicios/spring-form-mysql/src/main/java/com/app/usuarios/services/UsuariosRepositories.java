package hello;


import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UsuariosRepositories extends CrudRepository<Usuarios, Integer> {


}

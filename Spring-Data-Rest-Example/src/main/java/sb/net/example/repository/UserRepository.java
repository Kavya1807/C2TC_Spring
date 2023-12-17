package sb.net.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sb.net.example.entity.User;

@RepositoryRestResource(path = "members")
public interface UserRepository extends JpaRepository<User, Integer> {
	
	List<User> findByname(@Param("name") String name);

}

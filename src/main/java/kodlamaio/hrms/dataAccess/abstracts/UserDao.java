package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.people.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}

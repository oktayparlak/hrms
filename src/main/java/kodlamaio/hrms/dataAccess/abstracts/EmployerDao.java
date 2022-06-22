package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.people.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
}

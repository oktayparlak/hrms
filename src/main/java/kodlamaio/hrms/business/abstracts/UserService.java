package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.people.User;

import java.util.List;

public interface UserService {
    DataResult<List<User>> getAll();
    Result add(User user);
}

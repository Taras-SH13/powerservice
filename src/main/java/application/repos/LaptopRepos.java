package application.repos;

import application.model.Laptop;
import org.springframework.data.repository.CrudRepository;

public interface LaptopRepos extends CrudRepository<Laptop,Integer> {
}

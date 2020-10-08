package application.repos;

import application.model.Laptop;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LaptopRepos extends CrudRepository<Laptop,Long> {
    List<Laptop> findByVendor(String vendor);

}

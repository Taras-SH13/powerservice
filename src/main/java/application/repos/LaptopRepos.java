package application.repos;

import application.model.Laptop;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LaptopRepos extends CrudRepository<Laptop, Long> {
    //todo сделать все методы для поиска по таблице
    List<Laptop> findByVendor(String filter);

    List<Laptop> findBySeries(String filter);

    List<Laptop> findLaptopByLaptopsModel(String filter);


}

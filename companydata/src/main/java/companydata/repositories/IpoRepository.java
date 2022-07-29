package companydata.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import companydata.entities.Ipo;

@Repository
public interface IpoRepository extends CrudRepository<Ipo, Integer>{

}

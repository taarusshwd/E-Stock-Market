package companydata.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import companydata.entities.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer>{
	public Optional<Company> findByName(String name);
}

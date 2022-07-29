package stockexchange.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import stockexchange.entities.Stock;

@Repository
public interface StockExchangeRepository extends CrudRepository<Stock, Integer>{

}

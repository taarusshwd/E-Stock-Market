package stockexchange.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stockexchange.entities.Stock;
import stockexchange.repositories.StockExchangeRepository;

@Service
public class StockExchangeService {

    @Autowired
    private StockExchangeRepository stockExchangeRepository;

    public List<Stock> getAllStocks() {
        List<Stock> stocks = new ArrayList<>();
        stockExchangeRepository.findAll()
                .forEach(stocks::add);
        return stocks;
    }

    public Optional<Stock> getStock(Integer id) {
        return stockExchangeRepository.findById(id);
    }
    public void addStock(Stock stock) {
    	stockExchangeRepository.save(stock);
    }
    public void updateStock(Integer id, Stock stock) {
    	stockExchangeRepository.save(stock);
    }
    public void deleteStock(Integer id) {
    	stockExchangeRepository.deleteById(id);
    }
}
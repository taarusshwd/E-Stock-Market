package stockexchange.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stockexchange.entities.Stock;
import stockexchange.services.StockExchangeService;

@RestController
@RequestMapping("/stockexchange")
public class StockExchangeController {

    @Autowired
    private StockExchangeService stockExchangeService;

    @GetMapping("")
    public List<Stock> getAllStocks(){
        return stockExchangeService.getAllStocks();
    }
    @GetMapping("{id}")
    public Optional<Stock> getSectorById(@PathVariable Integer id){
        return stockExchangeService.getStock(id);
    }

    @PostMapping("")
    public void AddSector(@RequestBody Stock stock){
    	stockExchangeService.addStock(stock);
    }
    @PutMapping("{id}")
    public void UpdateSector(@PathVariable Integer id, Stock stock){
    	stockExchangeService.updateStock(id, stock);
    }
    @DeleteMapping("{id}")
    public void DeleteStock(@PathVariable Integer id){
    	stockExchangeService.deleteStock(id);
    }
}

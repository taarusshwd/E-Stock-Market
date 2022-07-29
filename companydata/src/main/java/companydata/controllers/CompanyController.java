package companydata.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import companydata.entities.Company;
import companydata.models.CompanyList;
import companydata.services.CompanyService;

@RestController
@RequestMapping("/company")
@CrossOrigin(origins="http://localhost:4200")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("")
    public List<Company> getAllCompanies(){
        return companyService.getAllCompanies();
    }
    @GetMapping("{id}")
    public Optional<Company> getCompanyById(@PathVariable Integer id){
        return companyService.getCompany(id);
    }
    @GetMapping("/sector/{id}")
    public CompanyList getCompaniesBySector(@PathVariable Integer id){
    	return companyService.getSectorCompanies(id);
    }
    
    @PostMapping("/add")
    public Boolean addCompany(@RequestBody Company company){
    	return companyService.addCompany(company);
    }
    @PutMapping("{id}")
    public void updateCompany(@PathVariable Integer id, @RequestBody Company company){
    	companyService.updateCompany(id, company);
    }
    @DeleteMapping("{id}")
    public void deleteCompany(@PathVariable Integer id){
    	companyService.deleteCompany(id);
    }
}
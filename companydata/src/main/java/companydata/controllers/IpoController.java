package companydata.controllers;

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

import companydata.entities.Ipo;
import companydata.services.IpoService;

@RestController
@RequestMapping("/ipo")
public class IpoController {

    @Autowired
    private IpoService ipoService;

    @GetMapping("")
    public List<Ipo> getAllCompanies(){
        return ipoService.getAllIpos();
    }
    @GetMapping("{id}")
    public Optional<Ipo> getIpoById(@PathVariable Integer id){
        return ipoService.getIpo(id);
    }

    @PostMapping("/add")
    public void addIpo(@RequestBody Ipo ipo){
    	ipoService.addIpo(ipo);
    }
    @PutMapping("{id}")
    public void updateIpo(@PathVariable Integer id, @RequestBody Ipo ipo){
    	ipoService.updateIpo(id, ipo);
    }
    @DeleteMapping("{id}")
    public void deleteIpo(@PathVariable Integer id){
    	ipoService.deleteIpo(id);
    }
}


/*public class IpoController {

	@RequestMapping("/{name}")
	public Ipo getIpo(@PathVariable("name") String name) {

		Ipo ipo = new Ipo(1,name,"Charles",123,456,789,"NA",
				"None");
		return ipo;
	}
}
*/
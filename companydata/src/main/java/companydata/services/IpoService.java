package companydata.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import companydata.entities.Ipo;
import companydata.repositories.IpoRepository;

@Service
public class IpoService {

    @Autowired
    private IpoRepository ipoRepository;
    
    public List<Ipo> getAllIpos() {
        List<Ipo> ipos = new ArrayList<>();
        ipoRepository.findAll()
                .forEach(ipos::add);
        return ipos;
    }

    public Optional<Ipo> getIpo(Integer id) {
        return ipoRepository.findById(id);
    }
    public void addIpo(Ipo ipo) {
    	ipoRepository.save(ipo);
    }
    public void updateIpo(Integer id, Ipo ipo) {
    	ipoRepository.save(ipo);
    }
    public void deleteIpo(Integer id) {
    	ipoRepository.deleteById(id);
    }
}
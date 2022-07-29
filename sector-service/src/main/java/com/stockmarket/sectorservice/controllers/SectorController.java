package com.stockmarket.sectorservice.controllers;

import com.stockmarket.sectorservice.entities.Sector;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.stockmarket.sectorservice.services.SectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sectors")
public class SectorController {
	
    @Autowired
    private SectorService sectorService;

    @GetMapping("")
    public List<Sector> getAllSectors(){
        return sectorService.getAllSectors();
    }
    @GetMapping("{id}")
    public Optional<Sector> getSectorById(@PathVariable Integer id){
        return sectorService.getSector(id);
    }

    @PostMapping("")
    public ResponseEntity<Sector> addSector(@RequestBody Sector sector){
        return new ResponseEntity<Sector>(sectorService.addSector(sector), HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Sector> updateSector(@PathVariable Integer id, @RequestBody Sector sector){
        return new ResponseEntity<Sector>(sectorService.updateSector(id, sector), HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public void deleteSector(@PathVariable Integer id){
        sectorService.deleteSector(id);
    }
    @GetMapping("/{id}/companies")
    public List<String> getAllCompanies(@PathVariable Integer id){
    	return sectorService.getSectorCompanies(id);
    }
}

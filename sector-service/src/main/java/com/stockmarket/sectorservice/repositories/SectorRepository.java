package com.stockmarket.sectorservice.repositories;

import com.stockmarket.sectorservice.entities.Sector;
import org.springframework.data.repository.CrudRepository;

public interface SectorRepository extends CrudRepository<Sector, Integer> {

}

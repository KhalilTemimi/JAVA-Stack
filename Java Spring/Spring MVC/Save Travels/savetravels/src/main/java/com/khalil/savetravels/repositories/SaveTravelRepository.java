package com.khalil.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.khalil.savetravels.models.SaveTravel;

@Repository
public interface SaveTravelRepository extends CrudRepository<SaveTravel, Long> {
	List<SaveTravel> findAll();
}

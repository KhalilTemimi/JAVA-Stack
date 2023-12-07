package com.khalil.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.khalil.savetravels.models.SaveTravel;
import com.khalil.savetravels.repositories.SaveTravelRepository;

@Service
public class SaveTravelService {
	// adding the SaveTravel repository as a dependency
		private final SaveTravelRepository saveTravelRepository;

		public SaveTravelService(SaveTravelRepository saveTravelkRepository) {
	        this.saveTravelRepository = saveTravelkRepository;
	    }

		// returns all the SaveTravels
		public List<SaveTravel> allSaveTravels() {
			return saveTravelRepository.findAll();
		}

		// creates a SaveTravel
		public SaveTravel createSaveTravel(SaveTravel st) {
			return saveTravelRepository.save(st);
		}

		// retrieves a SaveTravel
		public SaveTravel findSaveTravel(Long id) {
			Optional<SaveTravel> optionalSaveTravel = saveTravelRepository.findById(id);
			if (optionalSaveTravel.isPresent()) {
				return optionalSaveTravel.get();
			} else {
				return null;
			}
		}

		// Update a SaveTravel
		public SaveTravel updateSaveTravel(SaveTravel updatedSaveTravel) {
			return saveTravelRepository.save(updatedSaveTravel);
		}

		// Delete a SaveTravel
		public void deleteSaveTravel(Long id) {
			Optional<SaveTravel> saveTravel = saveTravelRepository.findById(id);
			if (saveTravel.isPresent()) {
				saveTravelRepository.deleteById(id);
			}
		}
}

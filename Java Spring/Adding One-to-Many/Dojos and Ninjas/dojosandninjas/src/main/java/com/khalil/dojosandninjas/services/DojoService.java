package com.khalil.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khalil.dojosandninjas.models.Dojo;
import com.khalil.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	// C R U D
	
		@Autowired
		private DojoRepository dojoRepository;

//		READ ALL
		public List<Dojo> allDojos() {
			return dojoRepository.findAll();
		}

//		CREATE
		public Dojo createDojo(Dojo b) {
			return dojoRepository.save(b);
		}

//		READ ONE
		public Dojo findDojo(Long id) {
			Optional<Dojo> maybeDojo = dojoRepository.findById(id);
			if (maybeDojo.isPresent()) {
				return maybeDojo.get();
			} else {
				return null;
			}
		}

//		UPDATE
		public Dojo updateDojo(Dojo b) {
			return dojoRepository.save(b);
		}

//		DELETE
		public void deleteDojo(Long id) {
			dojoRepository.deleteById(id);
		}
}

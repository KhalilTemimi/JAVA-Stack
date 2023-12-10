package com.khalil.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khalil.dojosandninjas.models.Ninja;
import com.khalil.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	// C R U D

	@Autowired
	private NinjaRepository ninjaRepository;

//			READ ALL
	public List<Ninja> allNinjas() {
		return ninjaRepository.findAll();
	}

//			CREATE
	public Ninja createNinja(Ninja b) {
		return ninjaRepository.save(b);
	}

//			READ ONE
	public Ninja findNinja(Long id) {
		Optional<Ninja> maybeNinja = ninjaRepository.findById(id);
		if (maybeNinja.isPresent()) {
			return maybeNinja.get();
		} else {
			return null;
		}
	}

//			UPDATE
	public Ninja updateNinja(Ninja b) {
		return ninjaRepository.save(b);
	}

//			DELETE
	public void deleteNinja(Long id) {
		ninjaRepository.deleteById(id);
	}
}

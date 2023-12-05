package com.khalil.burgertracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.khalil.burgertracker.models.Burger;
import com.khalil.burgertracker.repositories.BurgerRepository;

@Service
public class BurgerService {
	// adding the Burger repository as a dependency
	private final BurgerRepository burgerRepository;

	public BurgerService(BurgerRepository burgerkRepository) {
        this.burgerRepository = burgerkRepository;
    }

	// returns all the Burgers
	public List<Burger> allBurgers() {
		return burgerRepository.findAll();
	}

	// creates a Burger
	public Burger createBurger(Burger b) {
		return burgerRepository.save(b);
	}

	// retrieves a Burger
	public Burger findBurger(Long id) {
		Optional<Burger> optionalBurger = burgerRepository.findById(id);
		if (optionalBurger.isPresent()) {
			return optionalBurger.get();
		} else {
			return null;
		}
	}

	// Update a Burger
	public Burger updateBurger(Burger updatedBurger) {
		return burgerRepository.save(updatedBurger);
	}

	// Delete a Burger
	public void deleteBurger(Long id) {
		Optional<Burger> burger = burgerRepository.findById(id);
		if (burger.isPresent()) {
			burgerRepository.deleteById(id);
		}
	}
}

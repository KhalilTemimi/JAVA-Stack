package com.khalil.studentroster.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khalil.studentroster.models.Dorm;
import com.khalil.studentroster.repositories.DormRepository;

@Service
public class DormService {
	// C R U D
	
			@Autowired
			private DormRepository dormRepository;

//			READ ALL
			public List<Dorm> allDorms() {
				return dormRepository.findAll();
			}

//			CREATE
			public Dorm createDorm(Dorm dorm) {
				return dormRepository.save(dorm);
			}

//			READ ONE
			public Dorm findDorm(Long id) {
				Optional<Dorm> maybeDorm = dormRepository.findById(id);
				if (maybeDorm.isPresent()) {
					return maybeDorm.get();
				} else {
					return null;
				}
			}

//			UPDATE
			public Dorm updateDorm(Dorm b) {
				return dormRepository.save(b);
			}

//			DELETE
			public void deleteDorm(Long id) {
				dormRepository.deleteById(id);
			}
}

package com.khalil.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.khalil.lookify.models.PlayList;

@Repository
public interface PlayListRepository extends CrudRepository<PlayList, Long> {
	List<PlayList> findAll();
	List<PlayList> findByArtist(String artist);
}

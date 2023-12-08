package com.khalil.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.khalil.lookify.models.PlayList;
import com.khalil.lookify.repositories.PlayListRepository;

@Service
public class PlayListService {
	// adding the PlayList repository as a dependency
	private final PlayListRepository playListRepository;

	public PlayListService(PlayListRepository playListkRepository) {
		        this.playListRepository = playListkRepository;
		    }

	// returns all the PlayLists
	public List<PlayList> allPlayLists() {
		return playListRepository.findAll();
	}

	// creates a PlayList
	public PlayList createPlayList(PlayList playList) {
		return playListRepository.save(playList);
	}

	// PlayLista PlayList
	public PlayList findPlayList(Long id) {
		Optional<PlayList> optionalPlayList = playListRepository.findById(id);
		if (optionalPlayList.isPresent()) {
			return optionalPlayList.get();
		} else {
			return null;
		}
	}

	// Update a PlayList
	public PlayList updatePlayList(PlayList updatedPlayList) {
		return playListRepository.save(updatedPlayList);
	}

	// Delete a PlayList
	public void deletePlayList(Long id) {
		Optional<PlayList> playList = playListRepository.findById(id);
		if (playList.isPresent()) {
			playListRepository.deleteById(id);
		}
	}
	
	// find by artist
	public List<PlayList> findByArtist(String artist) {
		 return playListRepository.findByArtist(artist);
		
	}
}


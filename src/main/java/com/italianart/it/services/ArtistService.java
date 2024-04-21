package com.italianart.it.services;

import java.util.List;
import java.util.Optional;

import com.italianart.it.models.Artist;


public interface ArtistService {
		

	List<Artist> getAllArtists();
	Artist getArtistById(Integer id);
	//Optional<Artist> findAll();
	
}

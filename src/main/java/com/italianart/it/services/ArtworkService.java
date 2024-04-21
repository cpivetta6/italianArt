package com.italianart.it.services;

import java.util.List;
import java.util.Optional;

import com.italianart.it.models.Artwork;


public interface ArtworkService {

	List<Artwork> getAllArtWork();
	List<Artwork> getArtById(Integer id);


	
}

package com.italianart.it.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.italianart.it.models.Artist;
import com.italianart.it.repositories.ArtistRepository;

@Service
public class ArtistServiceImpl implements ArtistService {
	
	 @Autowired
	 private ArtistRepository artistRepository;
	 
	 @Override
	 public List<Artist> getAllArtists() {
	        return artistRepository.queryGetArtists();
	    }
	 
	 public List<Artist> findAll() {
	        return artistRepository.findAll();
	    }
	 

	@Override
	public Artist getArtistById(Integer id) {
		// TODO Auto-generated method stub
		return artistRepository.getArtistById(id);
	}

}

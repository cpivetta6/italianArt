package com.italianart.it.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.italianart.it.models.Artwork;
import com.italianart.it.repositories.ArtworkRepository;


@Service
public class ArtworkServiceImpl implements ArtworkService {

	@Autowired
	private ArtworkRepository artworkRepository;
	
	
	@Override
	public List<Artwork> getAllArtWork() {
		
		return artworkRepository.queryGetArtworks();
	}
	



	@Override
	public List<Artwork> getArtById(Integer id) {
		return artworkRepository.queryArtById(id);
	}




	
}

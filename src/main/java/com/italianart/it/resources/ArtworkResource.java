package com.italianart.it.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.italianart.it.models.Artwork;
import com.italianart.it.services.ArtworkService;

@RestController
@RequestMapping(value = "/artwork")
public class ArtworkResource {
	

	@Autowired
	private ArtworkService artworkService;
	
	@GetMapping("/")
	public List<Artwork> getArtworks(){
		
		return artworkService.getAllArtWork();
		
	}
	
	@GetMapping("/{id}")
	public List <Artwork> getArtById(@PathVariable Integer id) {
		
		return artworkService.getArtById(id);
	}
	
	

}

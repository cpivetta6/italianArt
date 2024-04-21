package com.italianart.it.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.italianart.it.models.Artist;
import com.italianart.it.services.ArtistService;
import com.italianart.it.services.ArtistServiceImpl;

@RestController
@RequestMapping("/artist")
public class ArtistResource {
	

	@Autowired
	private ArtistService artistService;
	
	@Autowired
	private ArtistServiceImpl artistServiceImpl;
	
	
	/*
	@GetMapping("/")
	public List<Artist> viewHomePage() {
		List<Artist> artists = artistService.getAllArtists();
		return artists;
	}*/
	@GetMapping("/")
	public List<Artist> viewHomePage() {
		List<Artist> artists = artistServiceImpl.findAll();
		return artists;
	}
	
	@GetMapping("/{id}")
	public Artist findArtistById(@PathVariable Integer id) {
		//model.addAttribute("artists", service.getAllArtists());
		
		Artist artist = artistService.getArtistById(id);
		
		return artist;
	}
	

}

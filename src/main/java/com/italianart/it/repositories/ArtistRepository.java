package com.italianart.it.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.italianart.it.models.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Integer> {
	
	@Query(value= "Select * from artist", nativeQuery = true)
	List<Artist> queryGetArtists();
	
	@Query(value= "Select * from artist where ar_idartist = ?", nativeQuery = true)
	Artist getArtistById(Integer id);
	
}

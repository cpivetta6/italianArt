package com.italianart.it.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.italianart.it.models.Artwork;

public interface ArtworkRepository extends JpaRepository<Artwork, Integer> {
	
	@Query(value = "Select art_artistid, art_artworkid, art_artname, art_artyear from artwork order by art_artistid, art_artworkid", nativeQuery = true)
	List<Artwork> queryGetArtworks();
	
	@Query(value = "Select * from artwork where art_artworkid = ? ", nativeQuery = true)
	List<Artwork> queryArtById(Integer id);
	
}

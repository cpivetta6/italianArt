package com.italianart.it.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "artwork")
public class Artwork implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/*@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer art_artworkid;*/
	
	@EmbeddedId
	private ArtworkId art_artworkid;
	
	
	private String art_artname;
	private LocalDate art_artyear;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("art_artistid")
	@JoinColumn(name = "art_artistid", referencedColumnName = "ar_idartist")
	private Artist artist;
	
	
	public Artwork() {
		
	}


	public Artwork(ArtworkId art_artworkid, String art_artname, LocalDate art_artyear, Artist artist) {
		super();
		this.art_artworkid = art_artworkid;
		this.art_artname = art_artname;
		this.art_artyear = art_artyear;
		this.artist = artist;
	}






	public ArtworkId getArt_artworkid() {
		return art_artworkid;
	}


	public void setArt_artworkid(ArtworkId art_artworkid) {
		this.art_artworkid = art_artworkid;
	}


	public Artist getArtist() {
		return artist;
	}


	public void setArtist(Artist artist) {
		this.artist = artist;
	}




	public String getArt_artname() {
		return art_artname;
	}


	public void setArt_artname(String art_artname) {
		this.art_artname = art_artname;
	}


	public LocalDate getArt_artyear() {
		return art_artyear;
	}


	public void setArt_artyear(LocalDate art_artyear) {
		this.art_artyear = art_artyear;
	}




	@Override
	public int hashCode() {
		return Objects.hash(art_artname, art_artworkid, art_artyear, artist);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artwork other = (Artwork) obj;
		return Objects.equals(art_artname, other.art_artname) && Objects.equals(art_artworkid, other.art_artworkid)
				&& Objects.equals(art_artyear, other.art_artyear) && Objects.equals(artist, other.artist);
	}





	


}

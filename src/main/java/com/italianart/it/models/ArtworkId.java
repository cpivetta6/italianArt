package com.italianart.it.models;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Embeddable
public class ArtworkId {
	

	private Integer art_artistid;
    private Integer art_artworkid;
    
    
    public ArtworkId() {
    	
    }
	public Integer getart_artistid() {
		return art_artistid;
	}
	public void setart_artistid(Integer art_artistid) {
		this.art_artistid = art_artistid;
	}
	public Integer getArtworkId() {
		return art_artworkid;
	}
	public void setArtworkId(Integer art_artworkid) {
		this.art_artworkid = art_artworkid;
	}
	@Override
	public int hashCode() {
		return Objects.hash(art_artistid, art_artworkid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArtworkId other = (ArtworkId) obj;
		return Objects.equals(art_artistid, other.art_artistid) && Objects.equals(art_artworkid, other.art_artworkid);
	}
    
    

}

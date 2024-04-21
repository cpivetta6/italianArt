package com.italianart.it.models;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "artist")
public class Artist implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ar_idartist;
	private String ar_name;
	private String ar_surname;
	private Integer ar_birthyear;
	private Integer ar_death_year;
	private String ar_nationality;
	private String art_Movement;
	
	
	@OneToMany(mappedBy = "artist", cascade = CascadeType.ALL)
	private List<Artwork> artList;
	
	
	public Artist() {
		
	}
	
	
	public Artist(Integer ar_idartist, String ar_name, String ar_surname, Integer ar_birthyear, Integer ar_death_year, String ar_nationality,
			String art_Movement, List<Artwork> artList) {
		
		this.ar_idartist = ar_idartist;
		this.ar_name = ar_name;
		this.ar_surname = ar_surname;
		this.ar_birthyear = ar_birthyear;
		this.ar_death_year = ar_death_year;
		this.ar_nationality = ar_nationality;
		this.art_Movement = art_Movement;
		setArtList(artList);
	}
	
	
	public Artist(Integer ar_idartist, String ar_name, String ar_surname, Integer ar_birthyear, Integer ar_death_year, String ar_nationality,
			String art_Movement) {
		this.ar_idartist = ar_idartist;
		this.ar_name = ar_name;
		this.ar_surname = ar_surname;
		this.ar_birthyear = ar_birthyear;
		this.ar_death_year = ar_death_year;
		this.ar_nationality = ar_nationality;
		this.art_Movement = art_Movement;
	}


	public Integer getAr_idartist() {
		return ar_idartist;
	}


	public void setAr_idartist(Integer ar_idartist) {
		this.ar_idartist = ar_idartist;
	}


	public String getAr_name() {
		return ar_name;
	}


	public void setAr_name(String ar_name) {
		this.ar_name = ar_name;
	}


	public String getAr_surname() {
		return ar_surname;
	}


	public void setAr_surname(String ar_surname) {
		this.ar_surname = ar_surname;
	}


	public Integer getAr_birthyear() {
		return ar_birthyear;
	}


	public void setAr_birthyear(Integer ar_birthyear) {
		this.ar_birthyear = ar_birthyear;
	}


	public Integer getAr_death_year() {
		return ar_death_year;
	}


	public void setAr_death_year(Integer ar_death_year) {
		this.ar_death_year = ar_death_year;
	}


	public String getAr_nationality() {
		return ar_nationality;
	}


	public void setAr_nationality(String ar_nationality) {
		this.ar_nationality = ar_nationality;
	}


	public String getArt_Movement() {
		return art_Movement;
	}


	public void setArt_Movement(String art_Movement) {
		this.art_Movement = art_Movement;
	}


	public List<Artwork> getArtList() {
		return artList;
	}


	public void setArtList(List<Artwork> artList) {
		this.artList = artList;
	}


	@Override
	public int hashCode() {
		return Objects.hash(ar_idartist);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artist other = (Artist) obj;
		return Objects.equals(ar_idartist, other.ar_idartist);
	}

	

}

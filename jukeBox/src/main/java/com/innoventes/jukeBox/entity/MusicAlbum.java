package com.innoventes.jukeBox.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Entity
@Table(name="MUSIC_ALBUM")

public class MusicAlbum {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="albumName")
	@Size(min=5)
	private String albumName;
	
	@Column(name="releaseDate")
	@NotNull
	@DateTimeFormat
	private Date releaseDate;
	
	@Column(name="genre")
	private String genre;
	
	@Column(name="price")
	@Min(100)
	@Max(1000)
	private int price;
	
	@Column(name="description")
	private String description;
	@ManyToMany
	Set<Musicians> musician;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	

	

//	public Set<Musicians> getMusician() {
//		return musician;
//	}
//
//	public void setMusician(Set<Musicians> musician) {
//		this.musician = musician;
//	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Set<Musicians> getMusician() {
		return musician;
	}

	public void setMusician(Set<Musicians> musician) {
		this.musician = musician;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "MusicAlbum [id=" + id + ", albumName=" + albumName + ", releaseDate=" + releaseDate + ", genre=" + genre
				+ ", price=" + price + ", description=" + description + ", musician=" + musician + "]";
	}
	
	
	
	

}

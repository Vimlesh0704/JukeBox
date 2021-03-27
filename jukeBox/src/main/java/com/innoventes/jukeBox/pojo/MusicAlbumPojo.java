package com.innoventes.jukeBox.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.innoventes.jukeBox.entity.Musicians;

import lombok.Data;

@Data
public class MusicAlbumPojo {
	private String albumName;
	private Date releaseDate;
	private String genre;
	private int price;
	private String description;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_Musicians",referencedColumnName = "id") private
	List<Musicians> musicians;
	 
	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
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
		return "MusicAlbumPojo [albumName=" + albumName + ", releaseDate=" + releaseDate + ", genre=" + genre
				+ ", price=" + price + ", description=" + description + "]";
	}

}

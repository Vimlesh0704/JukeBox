package com.innoventes.jukeBox.pojo;

import lombok.Data;

@Data
public class MusiciansPojo {
	
	private String name;
	private String musicianType;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMusicianType() {
		return musicianType;
	}
	public void setMusicianType(String musicianType) {
		this.musicianType = musicianType;
	}
	

}

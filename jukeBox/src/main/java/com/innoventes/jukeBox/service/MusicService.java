package com.innoventes.jukeBox.service;

import java.util.List;

import com.innoventes.jukeBox.pojo.MusicAlbumPojo;
import com.innoventes.jukeBox.pojo.MusiciansPojo;

public interface MusicService {
	public String addMusicAlbum(MusicAlbumPojo music);
	public String updateMusicAlbum(MusicAlbumPojo music);
	public String addMusicians(MusiciansPojo musicians);
	public String updateMusicians(MusiciansPojo musicians);
	public List<MusicAlbumPojo> findAllAlbumByDate();
	public List<MusicAlbumPojo> findAllAlbum(String musicianName);
	public List<MusiciansPojo> findByMusicianName(String name);

}

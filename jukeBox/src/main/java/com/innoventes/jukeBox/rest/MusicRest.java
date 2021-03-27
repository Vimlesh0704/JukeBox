package com.innoventes.jukeBox.rest;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.innoventes.jukeBox.entity.MusicAlbum;
import com.innoventes.jukeBox.entity.Musicians;
import com.innoventes.jukeBox.pojo.MusicAlbumPojo;
import com.innoventes.jukeBox.pojo.MusiciansPojo;
import com.innoventes.jukeBox.service.MusicService;

@RestController
public class MusicRest {
	
	@Autowired
	MusicService musicService;
	
	@PostMapping("/addMusicAlbum")
	public String addMusicAlbum(@RequestBody MusicAlbumPojo music)
	{	
		System.out.println(music.toString());
		return musicService.addMusicAlbum(music);
	}
	@PutMapping("/udateMusicAlbum")
	public String udateMusicAlbum(@RequestBody MusicAlbumPojo music)
	{
		return musicService.updateMusicAlbum(music);
	}
	@PostMapping("/addMusicians")
	public String addMusicians( @RequestBody MusiciansPojo musiciansPojo)
	{
		
		return musicService.addMusicians(musiciansPojo);
	}
	@PutMapping("/updateMusicians")
	public String updateMusicians(@RequestBody MusiciansPojo musiciansPojo)
	{
		
		return musicService.updateMusicians(musiciansPojo);
	} 
	
	@GetMapping("/findAlbumByDate")
	public List<MusicAlbumPojo> findAlbumByDate()
	{
		return musicService.findAllAlbumByDate();
	} 
	@GetMapping("/findAllAlbum")
	public List<MusicAlbumPojo> findAllAlbum()
	{
		return musicService.findAllAlbum("asdf");
	} 
	@GetMapping("/findByMusicianName")
	public List<MusiciansPojo> findByMusicianName()
	{
		return musicService.findByMusicianName("asdf");
	} 
	

}

package com.innoventes.jukeBox.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innoventes.jukeBox.entity.MusicAlbum;
import com.innoventes.jukeBox.entity.Musicians;
import com.innoventes.jukeBox.pojo.MusicAlbumPojo;
import com.innoventes.jukeBox.pojo.MusiciansPojo;
import com.innoventes.jukeBox.repo.MusicAlbumRepo;
import com.innoventes.jukeBox.repo.MusiciansRepo;
import com.innoventes.jukeBox.service.MusicService;
@Service
public class MusicServiceImpl implements MusicService {

	@Autowired
	MusicAlbumRepo musicAlbumRepo;
	@Autowired
	MusiciansRepo musiciansRepo;
	@Override
	public String addMusicAlbum(MusicAlbumPojo music) {
		MusicAlbum musicAlbum=new MusicAlbum();
		BeanUtils.copyProperties(music, musicAlbum);
		
		System.out.println(musicAlbum);
		try {
			musicAlbumRepo.save(musicAlbum);
			return "Successfully musicAlbum added";
		}
		catch(Exception e)
		{
			return e+"";
		}
	}

	@Override
	public String updateMusicAlbum(MusicAlbumPojo music) {
		MusicAlbum musicAlbum=new MusicAlbum();
		BeanUtils.copyProperties(music, musicAlbum);
		try {
			musicAlbumRepo.save(musicAlbum);
			return "Successfully musicAlbum Updated";
		}
		catch(Exception e)
		{
			return e+"";
		}
	}

	@Override
	public String addMusicians(MusiciansPojo musiciansPojo) {
		Musicians musicians=new Musicians();
		BeanUtils.copyProperties(musiciansPojo, musicians);
		try {
			musiciansRepo.save(musicians);
			return "Successfully musicians added";
		}
		catch(Exception e)
		{
			return e+"";
		}
	}

	@Override
	public String updateMusicians(MusiciansPojo musiciansPojo) {
		Musicians musicians=new Musicians();
		BeanUtils.copyProperties(musiciansPojo, musicians);
		try {
			musiciansRepo.save(musicians);
			return "Successfully musicians Updated";
		}
		catch(Exception e)
		{
			return e+"";
		}
	}

	@Override
	public List<MusicAlbumPojo> findAllAlbumByDate() {
		List<MusicAlbum>listAlbum=musicAlbumRepo.findAll();
		List<MusicAlbumPojo> listAlbumPojo=new ArrayList<>();
		
		for (MusicAlbum musicAlbum : listAlbum) {
			MusicAlbumPojo musicAlbumPojo=new MusicAlbumPojo();
			BeanUtils.copyProperties(musicAlbum, musicAlbumPojo);
			listAlbumPojo.add(musicAlbumPojo);
		}
		
		return listAlbumPojo;
		
	}

	@Override
	public List<MusicAlbumPojo> findAllAlbum(String musicianName) {
		List<MusicAlbum>listAlbum=musicAlbumRepo.findAll();
		List<MusicAlbumPojo> listAlbumPojo=new ArrayList<>();
		System.out.println(listAlbum);
		/*
		 * for (MusicAlbum musicAlbum : listAlbum) { MusicAlbumPojo musicAlbumPojo=new
		 * MusicAlbumPojo(); if(musicAlbum.getMusician().)
		 * BeanUtils.copyProperties(musicAlbum, musicAlbumPojo);
		 * listAlbumPojo.add(musicAlbumPojo); }
		 */
		
		return listAlbumPojo;
	}

	@Override
	public List<MusiciansPojo> findByMusicianName(String name) {
		// TODO Auto-generated method stub
		List<Musicians>listMusicins=musiciansRepo.findAllByOrderByName();
		System.out.println(listMusicins);
		List<MusiciansPojo> listMusicinsPojo=new ArrayList<>();
		return listMusicinsPojo;
	}
	


}

package com.innoventes.jukeBox.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innoventes.jukeBox.entity.MusicAlbum;
@Repository
public interface MusicAlbumRepo extends JpaRepository<MusicAlbum,Integer>{
	List<MusicAlbum> findAllByOrderByPrice();

}

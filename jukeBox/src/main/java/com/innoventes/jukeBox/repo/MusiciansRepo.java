package com.innoventes.jukeBox.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innoventes.jukeBox.entity.MusicAlbum;
import com.innoventes.jukeBox.entity.Musicians;
@Repository
public interface MusiciansRepo extends JpaRepository<Musicians, Integer> {
	List<Musicians> findAllByOrderByName();

}

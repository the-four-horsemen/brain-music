package com.codegym.music.repository;

import com.codegym.music.model.Songs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface SongsRepository extends JpaRepository<Songs, Long> {
}

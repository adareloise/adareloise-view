package com.adareloise.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adareloise.app.model.entity.Autor;

public interface AutorDao extends JpaRepository<Autor, Integer>{

}

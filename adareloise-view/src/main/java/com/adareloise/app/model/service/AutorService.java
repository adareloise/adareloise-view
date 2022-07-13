package com.adareloise.app.model.service;

import java.util.List;

import com.adareloise.app.model.entity.Autor;

public interface AutorService {
	
	Autor save(Autor autor);
	Autor findOne(Integer id);
	List<Autor> findAll();
}

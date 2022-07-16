package com.adareloise.app.service;

import java.util.List;

import com.adareloise.app.model.entity.Poem;

public interface PoemService {
	
	Poem save(Poem poem);
	Poem findOne(Integer id);
	List<Poem> findAll();
	
}

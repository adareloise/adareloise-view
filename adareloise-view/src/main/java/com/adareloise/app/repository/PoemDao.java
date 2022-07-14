package com.adareloise.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adareloise.app.model.entity.Poem;

public interface PoemDao extends JpaRepository<Poem, Integer> {

}

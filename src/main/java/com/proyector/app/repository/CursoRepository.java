package com.proyector.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proyector.app.model.Curso;

public interface CursoRepository extends MongoRepository<Curso,Long> {

}

package com.proyector.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proyector.app.model.Profesor;

public interface ProfesorRepository extends MongoRepository<Profesor,Long> {

}

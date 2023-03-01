package com.proyector.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proyector.app.model.Depto;

public interface DeptoRepository extends MongoRepository<Depto,Long> {

}

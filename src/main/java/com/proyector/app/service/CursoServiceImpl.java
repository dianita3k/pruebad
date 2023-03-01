package com.proyector.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.proyector.app.model.Curso;
import com.proyector.app.repository.CursoRepository;
import com.proyector.app.repository.ProfesorRepository;



@Service
public class CursoServiceImpl extends GenericServiceImpl<Curso, Long> implements CursoService{


	@Autowired
	CursoRepository cursoRepository;

	
	@Override
	public CrudRepository<Curso, Long> getDao() {
		// TODO Auto-generated method stub
		return cursoRepository;
	}

}

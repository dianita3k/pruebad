package com.proyector.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.proyector.app.model.Depto;
import com.proyector.app.repository.DeptoRepository;

@Service

public class DeptoServiceImpl extends GenericServiceImpl<Depto, Long> implements DeptoService{
	@Autowired
	DeptoRepository deptoRepository;

	
	
	@Override
	public CrudRepository<Depto, Long> getDao() {
		// TODO Auto-generated method stub
		return deptoRepository;
	}

}

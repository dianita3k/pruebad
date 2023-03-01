package com.proyector.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.proyector.app.model.Depto;

import com.proyector.app.service.DeptoService;


@RestController
@RequestMapping("/api/depto")
public class DeptoController {
	
	@Autowired
    DeptoService deptoService;

	  @GetMapping("/listar")
	    public ResponseEntity<List<Depto>> listarDept() {
	        return new ResponseEntity<>(deptoService.findByAll(),
	                HttpStatus.OK);
	    }

    @PostMapping("/crear")
    public ResponseEntity<Depto> crearDep(
            @RequestBody Depto p) {
        return new ResponseEntity<>(deptoService.save(p),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Depto> actualizarDept(@PathVariable Long id, @RequestBody Depto p) {
    	Depto pENcontrada = deptoService.findById(id);
        if (pENcontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
            	pENcontrada.setNombre(p.getNombre());
            	pENcontrada.setDirector(p.getDirector());
            	pENcontrada.setDescripcion(p.getDescripcion());

            	
                return new ResponseEntity<>(deptoService.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {

                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Depto> eliminarDepto(@PathVariable Long id) {
    	deptoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);


}
	
	

}

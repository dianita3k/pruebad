package com.proyector.app.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection="Curso")
@Data
public class Curso {

	
	private static final long serialVersionUID = 1L;

    @Id
    private Long curso_id;

    private String nombre;

    private String nivel ;

    private String descripcion ;
    
    private List <Profesor> listprofesor;

}

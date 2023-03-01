package com.proyector.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection="Depto")
@Data
public class Depto {
	
	
	private static final long serialVersionUID = 1L;

    @Id
    private Long depto_id;

    private String nombre;

    private String director ;

    private String descripcion ;

}

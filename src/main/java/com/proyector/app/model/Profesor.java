package com.proyector.app.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection="Profesor")
@Data
public class Profesor {

	private static final long serialVersionUID = 1L;

    @Id
    private Long prof_id;

    private String nombre;

    private String direccion ;

    private String telefono ;
    
    private List<Depto> listdepto ;

    

}

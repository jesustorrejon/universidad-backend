package com.springsimplespasos.universidad.universidad.backend;

import com.springsimplespasos.universidad.universidad.backend.modelo.entidades.Alumno;
import com.springsimplespasos.universidad.universidad.backend.modelo.entidades.Direccion;
import com.springsimplespasos.universidad.universidad.backend.modelo.entidades.Persona;
import com.springsimplespasos.universidad.universidad.backend.servicios.contratos.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UniversidadBackendApplication {

	@Autowired
	private AlumnoDAO servicio;

	public static void main(String[] args) {
		String[] beanDefinitionNames = SpringApplication.run(UniversidadBackendApplication.class, args).getBeanDefinitionNames();
//
//		for (String str : beanDefinitionNames){
//			System.out.println(str);
//		}


	}

	@Bean
	public CommandLineRunner runner(){
		return args -> {
			Direccion direccion = new Direccion("calle falsa", "123", "1623", "", "", "Junio");
			Persona alumno = new Alumno(null, "Raul", "Perez", "111111111", direccion);

			Persona save = servicio.save(alumno);
			System.out.println(save.toString());
		};
	}

}

package com.springsimplespasos.universidad.universidad.backend;

import com.springsimplespasos.universidad.universidad.backend.modelo.entidades.Carrera;
import com.springsimplespasos.universidad.universidad.backend.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CarreraComandos implements CommandLineRunner {

    @Autowired
    private CarreraDAO servicio;

    @Override
    public void run(String... args) throws Exception {
//        Carrera ingSistemas = new Carrera(null, "Ingeniería de Sistemas", 50, 5);
//
//        Carrera save = servicio.save(ingSistemas);
//        System.out.println(save.toString());

    }
}

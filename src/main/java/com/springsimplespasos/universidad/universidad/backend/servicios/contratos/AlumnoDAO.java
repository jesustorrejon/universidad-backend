package com.springsimplespasos.universidad.universidad.backend.servicios.contratos;

import com.springsimplespasos.universidad.universidad.backend.modelo.entidades.Persona;

import java.util.Optional;

public interface AlumnoDAO {

    Optional<Persona> findById(Integer id);
    Persona save(Persona carrera);
    Iterable<Persona> findAll();
    void deleteById(Integer id);
}

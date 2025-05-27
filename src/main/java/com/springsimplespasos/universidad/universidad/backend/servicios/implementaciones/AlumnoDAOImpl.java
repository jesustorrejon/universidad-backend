package com.springsimplespasos.universidad.universidad.backend.servicios.implementaciones;

import com.springsimplespasos.universidad.universidad.backend.modelo.entidades.Persona;
import com.springsimplespasos.universidad.universidad.backend.repositorios.PersonaRepository;
import com.springsimplespasos.universidad.universidad.backend.servicios.contratos.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AlumnoDAOImpl implements AlumnoDAO {

    @Autowired
    @Qualifier("repositorioAlumnos")
    private PersonaRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Optional<Persona> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Persona save(Persona carrera) {
        return repository.save(carrera);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Persona> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}

package com.springsimplespasos.universidad.universidad.backend.servicios.implementaciones;

import com.springsimplespasos.universidad.universidad.backend.modelo.entidades.Carrera;
import com.springsimplespasos.universidad.universidad.backend.repositorios.CarreraRepository;
import com.springsimplespasos.universidad.universidad.backend.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CarreraDAOImpl implements CarreraDAO {

    @Autowired
    private CarreraRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Optional<Carrera> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Carrera save(Carrera carrera) {
        return repository.save(carrera);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Carrera> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}

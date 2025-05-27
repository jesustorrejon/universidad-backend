package com.springsimplespasos.universidad.universidad.backend.repositorios;

import com.springsimplespasos.universidad.universidad.backend.modelo.entidades.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PersonaRepository extends CrudRepository<Persona, Integer> {


}

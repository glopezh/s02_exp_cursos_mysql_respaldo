package com.cjava.demo.model.repositories;

import com.cjava.demo.model.entities.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, String> {
}

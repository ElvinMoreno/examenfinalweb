package com.registro.usuarios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.usuarios.modelo.Typedb;

@Repository
public interface TypedbRepositorio extends JpaRepository<Typedb, Integer> {

}

package com.registro.usuarios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.usuarios.modelo.Connectiontoken;


@Repository
public interface ConnectiontokenRepositorio extends JpaRepository<Connectiontoken, Long> {

	
}

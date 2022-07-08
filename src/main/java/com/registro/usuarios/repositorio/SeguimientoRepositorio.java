package com.registro.usuarios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.usuarios.modelo.Seguimiento;


@Repository
public interface SeguimientoRepositorio extends JpaRepository<Seguimiento, Integer> {

	
}
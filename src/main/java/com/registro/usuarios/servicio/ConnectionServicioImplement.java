package com.registro.usuarios.servicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registro.usuarios.modelo.Connectiontoken;
import com.registro.usuarios.repositorio.ConnectiontokenRepositorio;
@Service
public class ConnectionServicioImplement implements ConnectionServicio{
	
	
	@Autowired
	private ConnectiontokenRepositorio repositorio;

	@Override
	public List<Connectiontoken> listConnectiontoken() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Connectiontoken insertConnectiontoken(Connectiontoken c) {
		// TODO Auto-generated method stub
		return repositorio.save(c);
	}

	@Override
	public Connectiontoken selectConnectiontoken(long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).get();
	}

	@Override
	public Connectiontoken updateConnectiontoken(Connectiontoken c) {
		// TODO Auto-generated method stub
		return repositorio.save(c);
	}

	@Override
	public void deleteConnectiontoken(long id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}



}

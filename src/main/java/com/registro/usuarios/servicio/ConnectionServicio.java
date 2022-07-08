package com.registro.usuarios.servicio;

import java.util.List;

import com.registro.usuarios.modelo.Connectiontoken;




public interface ConnectionServicio {
	
public List<Connectiontoken> listConnectiontoken();
	
	public Connectiontoken insertConnectiontoken(Connectiontoken articulo);
	
	public Connectiontoken selectConnectiontoken(long id);
	
	public Connectiontoken updateConnectiontoken(Connectiontoken articulo);
	
	public void deleteConnectiontoken(long id);

}

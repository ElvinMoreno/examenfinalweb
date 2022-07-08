package com.registro.usuarios.modelo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "typedb")
public class Typedb {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name = "description",nullable = false,length = 100)
	private String description;
	
	@Column(name = "driver",nullable = false,length = 200)
	private String driver;
	
	@Column(name = "aditonial",nullable = false,length = 100)
	private String aditonial;
	
	@OneToMany(mappedBy = "typedb_id", cascade = CascadeType.ALL)
	private Set<Connectiontoken> cs = new HashSet<>();
	

	public int getId() {
		return id;
	}
	
	


	public Typedb(int id, String description, String driver, String aditonial, Set<Connectiontoken> cs) {
		super();
		this.id = id;
		this.description = description;
		this.driver = driver;
		this.aditonial = aditonial;
		this.cs = cs;
	}




	public void setId(int id) {
		this.id = id;
	}
	

	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDriver() {
		return driver;
	}


	public void setDriver(String driver) {
		this.driver = driver;
	}


	public String getAditonial() {
		return aditonial;
	}


	public void setAditonial(String aditonial) {
		this.aditonial = aditonial;
	}


	public Set<Connectiontoken> getCs() {
		return cs;
	}


	public void setCs(Set<Connectiontoken> cs) {
		this.cs = cs;
		for (Connectiontoken connectiontoken : cs) {
			connectiontoken.setTypedb(this);
		}
	}


	
	
}

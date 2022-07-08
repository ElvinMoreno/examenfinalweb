package com.registro.usuarios.modelo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "reporte")
public class Reporte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "connectiontoken_id",nullable = false)
	private Connectiontoken connectiontoken;
	
	@Column(name = "datecreate",length = 500)
	private String datecreate;
	
	@Column(name = "date",length = 50)
	private String date;
	
	@Column(name = "state",length = 500)
	private String state;
	
	@Column(name = "description",length = 1)
	private String description;
	
	@Column(name = "name",length = 500)
	private String name;
	
	@OneToMany(mappedBy = "reporte", cascade = CascadeType.ALL)
	private Set<Seguimiento> seguimientos = new HashSet<>();
	
	

	public Set<Seguimiento> getSeguimientos() {
		return seguimientos;
	}

	public void setSeguimientos(Set<Seguimiento> seguimientos) {
		this.seguimientos = seguimientos;
		for (Seguimiento seguimiento : seguimientos) {
			seguimiento.setReporte(this);
		}
	}

	public Reporte(int id, Connectiontoken connectiontoken, String datecreate, String date, String state,
			String description, String name) {
		super();
		this.id = id;
		this.connectiontoken = connectiontoken;
		this.datecreate = datecreate;
		this.date = date;
		this.state = state;
		this.description = description;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Connectiontoken getConnectiontoken() {
		return connectiontoken;
	}

	public void setConnectiontoken(Connectiontoken connectiontoken) {
		this.connectiontoken = connectiontoken;
	}

	public String getDatecreate() {
		return datecreate;
	}

	public void setDatecreate(String datecreate) {
		this.datecreate = datecreate;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Reporte [id=" + id + ", connectiontoken=" + connectiontoken + ", datecreate=" + datecreate + ", date="
				+ date + ", state=" + state + ", description=" + description + ", name=" + name + "]";
	}
	
	

	
	
}

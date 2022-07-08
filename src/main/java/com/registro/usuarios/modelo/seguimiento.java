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
@Table(name = "estado")
public class Seguimiento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "reporte_id",nullable = false)
	private Reporte reporte;
	
	@Column(name = "dategenerate",nullable = false,length = 50)
	private String dategenerate;
	
	@Column(name = "state",nullable = false,length = 50)
	private String state;
	
	@Column(name = "result",nullable = false,length = 50)
	private String result;
	
	@Column(name = "detalle",nullable = false,length = 50)
	private String detalle;
	
	@Column(name = "type",nullable = false,length = 50)
	private String type;
	
	@Column(name = "filegenerate",nullable = false,length = 50)
	private String filegenerate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Reporte getReporte() {
		return reporte;
	}

	public void setReporte(Reporte reporte) {
		this.reporte = reporte;
	}

	public String getDategenerate() {
		return dategenerate;
	}

	public void setDategenerate(String dategenerate) {
		this.dategenerate = dategenerate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFilegenerate() {
		return filegenerate;
	}

	public void setFilegenerate(String filegenerate) {
		this.filegenerate = filegenerate;
	}

	public Seguimiento(int id, Reporte reporte, String dategenerate, String state, String result, String detalle,
			String type, String filegenerate) {
		super();
		this.id = id;
		this.reporte = reporte;
		this.dategenerate = dategenerate;
		this.state = state;
		this.result = result;
		this.detalle = detalle;
		this.type = type;
		this.filegenerate = filegenerate;
	}

	@Override
	public String toString() {
		return "seguimiento [id=" + id + ", reporte=" + reporte + ", dategenerate=" + dategenerate + ", state=" + state
				+ ", result=" + result + ", detalle=" + detalle + ", type=" + type + ", filegenerate=" + filegenerate
				+ "]";
	}


	

}

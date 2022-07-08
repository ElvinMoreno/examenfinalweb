package com.registro.usuarios.modelo;

import java.sql.Timestamp;
import java.util.Date;
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
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "connectiontoken")
public class Connectiontoken {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;
	
	@Column(name = "host",length = 200)
	private String host;
	
	@Column(name = "userdb", length = 50)
	private String userdb;
	
	@Column(name = "pass", length = 100)
	private String pass;
	
	@Column(name = "db",length = 50)
	private String db;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "typedb_id",nullable = false)
	private Typedb typedb;
	
	@Column(name = "token",length = 500)
	private String token;
	
	@Column(name = "port",length = 500)
	private String port;
	
	@Column(name = "state",length = 500)
	private String vacio;
	
	@OneToMany(mappedBy = "connectiontoken", cascade = CascadeType.ALL)
	private Set<Reporte> reportes = new HashSet<>();
	
	
	
	public Set<Reporte> getReportes() {
		return reportes;
	}

	public void setReportes(Set<Reporte> reportes) {
		this.reportes = reportes;
		for (Reporte reporte : reportes) {
			reporte.setConnectiontoken(this);
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	

	public String getUserdb() {
		return userdb;
	}

	public void setUserdb(String userdb) {
		this.userdb = userdb;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public Typedb getTypedb() {
		return typedb;
	}

	public void setTypedb(Typedb typedb) {
		this.typedb = typedb;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getVacio() {
		return vacio;
	}

	public void setVacio(String vacio) {
		this.vacio = vacio;
	}

	public Connectiontoken(Long id, Usuario usuario, String host, String userdb, String pass, String db, Typedb typedb,
			String token, String port, String vacio) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.host = host;
		this.userdb = userdb;
		this.pass = pass;
		this.db = db;
		this.typedb = typedb;
		this.token = token;
		this.port = port;
		this.vacio = vacio;
	}

	public Connectiontoken(Usuario usuario, String host, String userdb, String pass, String db, Typedb typedb,
			String token, String port, String vacio) {
		super();
		this.usuario = usuario;
		this.host = host;
		this.userdb = userdb;
		this.pass = pass;
		this.db = db;
		this.typedb = typedb;
		this.token = token;
		this.port = port;
		this.vacio = vacio;
	}

	public Connectiontoken() {
		super();
	}

	@Override
	public String toString() {
		return "Connectiontoken [id=" + id + ", usuario=" + usuario + ", host=" + host + ", userdb=" + userdb
				+ ", pass=" + pass + ", db=" + db + ", typedb=" + typedb + ", token=" + token + ", port=" + port
				+ ", vacio=" + vacio + "]";
	}


	
	
	
	
	
	
}

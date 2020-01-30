package br.org.facugenerosa.sistemafaculdade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tblaluno")
public class Aluno {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private int    id;
	
	@Column(name="nome", length=100)
	private String nome;
	
	@Column(name="email", length= 200)
	private String email;
	
	@Column(name="telefone", length=200)
	private String telefone;
	
	@Column(name="linkFoto", length=200)
	private String linkFoto;
	
	
	@ManyToOne // Aqui é varios para um(significa que um produto só pode ter um departamentos)
	private Curso curso;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getLinkFoto() {
		return linkFoto;
	}
	public void setLinkFoto(String linkFoto) {
		this.linkFoto = linkFoto;
	}
	

	
	
}

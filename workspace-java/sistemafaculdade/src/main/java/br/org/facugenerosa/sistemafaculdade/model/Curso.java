package br.org.facugenerosa.sistemafaculdade.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tblCurso")
public class Curso{
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
private int    id;
 
@Column(name="nome", length=100)
private String nome;
 
@Column(name="localizacao", length=40)
private String localização;

@OneToMany(cascade = CascadeType.ALL, mappedBy = "curso" ) //aqui é um para muitos(um departamento pode ter varios produtos)
private List<Curso> curso;
 
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
public String getLocalização() {
	return localização;
}
public void setLocalização(String localização) {
	this.localização = localização;
}
 
 

}

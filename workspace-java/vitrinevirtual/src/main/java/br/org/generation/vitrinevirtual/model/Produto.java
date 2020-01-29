package br.org.generation.vitrinevirtual.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tblproduto")
public class Produto {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private int id;

@Column(name="nome", length = 100)
private String nome;

@Column(name="detalhes", length=500)
private String detalhes;

@Column(name= "preco", length=200)
private float  preco;

@Column(name="linkFoto", length=200)
private String linkFoto;


@ManyToOne // Aqui é varios para um(significa que um produto só pode ter um departamentos)
private Departamento departamento;


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
public String getDetalhes() {
	return detalhes;
}
public void setDetalhes(String detalhes) {
	this.detalhes = detalhes;
}
public float getPreco() {
	return preco;
}
public void setPreco(float preco) {
	this.preco = preco;
}
public String getLinkFoto() {
	return linkFoto;
}
public void setLinkFoto(String linkFoto) {
	this.linkFoto = linkFoto;
}


}

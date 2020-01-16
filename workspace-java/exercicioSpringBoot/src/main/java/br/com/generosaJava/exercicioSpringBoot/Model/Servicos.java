package br.com.generosaJava.exercicioSpringBoot.Model;

public class Servicos {

	private int id;
	private String titulo;
	private String detalhes;
	private float preco;
	private float QtdEstoque;
	private String LinkFoto;

	public Servicos(int id, String titulo, String detalhes, float preco, float qtdEstoque, String linkFoto) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.detalhes = detalhes;
		this.preco = preco;
		QtdEstoque = qtdEstoque;
		LinkFoto = linkFoto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	public float getQtdEstoque() {
		return QtdEstoque;
	}

	public void setQtdEstoque(float qtdEstoque) {
		QtdEstoque = qtdEstoque;
	}

	public String getLinkFoto() {
		return LinkFoto;
	}

	public void setLinkFoto(String linkFoto) {
		LinkFoto = linkFoto;
	}

	@Override
	public String toString() {
		return "Servicos {id:" + id + ", titulo:\"" + titulo + "\", detalhe:\"" + detalhes + "\", preco:\"" + preco
				+ "\", QtdEstoque:\"" + QtdEstoque + "\" LinkFoto:\"" + LinkFoto + "\" }";
	}

}

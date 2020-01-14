
public class PRODUTO {
	 private int id;
	 private String nome;
	 private String detalhe;
	 private Float preco;
	 private Float qestoque;
	 
	 
	 //declaracao do constructor
	 public PRODUTO(int id, String nome, String detalhe, float qestoque) {
		this.id = id;
		this.nome = nome;
		this.detalhe = detalhe;
		this.preco = preco;
		this.qestoque = qestoque;
	 }
	 
	 public PRODUTO() {
		 
	 }
	
 public void setId(int id) {
	 this.id = id;
	 if(id<= 0) {
		throw new RuntimeException("o id nao pode ser menor ou igual a 0") ;
	 }
 }
	 
 public int getid() {
	return id; 
 }

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	if(nome == null || nome.length()==0) {
	throw new RuntimeException("Nome não pode ser vazio");
	}
	
	
	this.nome = nome;
}

public String getDetalhe() {
	return detalhe;
}

public void setDetalhe                                                                                                                                                                                                                                                    (String detalhe) {
	if (detalhe == null || detalhe.length()==0) {
	throw new RuntimeException("Digite os detalhes dos produtos");
	}
	this.detalhe = detalhe;
}

public Float getPreco() {
	return preco;
}

public void setPreco(Float preco) {
	this.preco = preco;
	if(preco<=0) {
	throw new RuntimeException("o preco nao pode ser menor igual a 0");
	}
}

public Float getQestoque() {
	return qestoque;
}

public void setQestoque(Float qestoque) {
	this.qestoque = qestoque;
	if((qestoque<=0)) {
	throw new RuntimeException("a quantidade de estoque não pode ser menor ou igual a 0");
	}
}

public int getId() {
	return id;
}

}

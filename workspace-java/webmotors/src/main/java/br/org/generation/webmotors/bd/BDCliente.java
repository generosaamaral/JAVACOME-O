package br.org.generation.webmotors.bd;

import java.util.ArrayList;

import br.org.generation.webmotors.model.Cliente;



public class BDCliente {
 private ArrayList<Cliente> lista;

public BDCliente() {
	lista = new ArrayList<Cliente>();
}
//correspondente ao CREATE
public void gravar (Cliente c) {
this.lista.add(c);	
}
//correspondente ao READ
public Cliente buscar(int id) {
Cliente c = null;
for (Cliente cli: lista) { // para cada variável do tipo cli ele vai pegar cada posição da lista do tipo cli
	if (cli.getId()== id) {
		c = cli;
		break;
	}
}
return c;

}
// Para atualizar um objeto tem que passar o objeto inteiro
//Correspondente ao UPDATE
public void atualizar(Cliente c) {
	int posicao=-1;
	for (int i=0; i< lista.size(); i++) {
		if (lista.get(i).getId()== c.getId()) {
			posicao = i;
			break;
		}
	}
	if (posicao >=0) {
		lista.set(posicao,c);
	}
}

// Para apagar um objeto basta passar i Id dele
// Correspondente a DELETE
public boolean apagar(int id) {
	int posicao= -1;
	for (int i=0; i< lista.size(); i++) {
	if (lista.get(i).getId() == id) {
		posicao = i;
		break;
	}
	
	}
	if (posicao >=0) {
		lista.remove(posicao);
		return true;
	}
	return false;
}

public ArrayList<Cliente>buscarTodos(){
	return lista;
}
}

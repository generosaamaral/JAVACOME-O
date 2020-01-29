package br.org.generation.vitrinevirtual.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.vitrinevirtual.dao.ProdutoRepo;
import br.org.generation.vitrinevirtual.model.Produto;

@Component
public class ProdutoServiceImpl implements IProdutoService {

	@Autowired // declaramos a interface do DAO que criamos
	private ProdutoRepo repo; // e a anotação Autowired busca uma implementação dentro do JPA

	@Override
	public List<Produto> recuperarTodos() {

		return (List<Produto>)repo.findAll();
	}
	
	public Produto recuperarPorId(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Produto RecuperarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}

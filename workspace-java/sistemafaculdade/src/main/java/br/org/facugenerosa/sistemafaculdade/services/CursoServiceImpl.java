package br.org.facugenerosa.sistemafaculdade.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.facugenerosa.sistemafaculdade.dao.CursoRepo;
import br.org.facugenerosa.sistemafaculdade.model.Curso;

@Component
public class CursoServiceImpl implements ICursoService {

@Autowired

private CursoRepo repo;

@Override
public void AdicionarNovoCurso(Curso curs) {
	repo.save(curs);
}

@Override
public Curso recuperarDetalhes(int id) {
	return repo.findById(id).get();
}

@Override
public List<Curso> recuperarTodos(){
	return (List<Curso>)repo.findAll();
}
}

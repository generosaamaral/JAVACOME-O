package br.org.facugenerosa.sistemafaculdade.services;

import java.util.List;

import br.org.facugenerosa.sistemafaculdade.model.Curso;

public interface ICursoService {
	
public void AdicionarNovoCurso(Curso curs);
public Curso recuperarDetalhes(int id);
public List<Curso> recuperarTodos();

}

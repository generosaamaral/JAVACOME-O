package br.org.facugenerosa.sistemafaculdade.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.facugenerosa.sistemafaculdade.model.Aluno;

public interface CursoRepo extends CrudRepository<Aluno, Integer>{

}

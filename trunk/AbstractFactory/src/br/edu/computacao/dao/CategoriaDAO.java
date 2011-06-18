package br.edu.computacao.dao;

import java.util.List;

import br.edu.computacao.model.Categoria;

public interface CategoriaDAO {

	void save(Categoria categoria);
	void delete(Categoria categoria);
	List<Categoria> findAll();
	Categoria findById(Long codigo);
}

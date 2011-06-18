package br.edu.computacao.dao;

import java.util.List;

import br.edu.computacao.model.Produto;

public interface ProdutoDAO {

	void save(Produto produto);
	void delete(Produto produto);
	List<Produto> findAll();
	Produto findById(Long codigo);

}

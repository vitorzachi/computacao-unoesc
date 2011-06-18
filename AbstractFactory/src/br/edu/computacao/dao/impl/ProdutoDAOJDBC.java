package br.edu.computacao.dao.impl;

import java.util.List;

import br.edu.computacao.dao.ProdutoDAO;
import br.edu.computacao.model.Produto;

public class ProdutoDAOJDBC implements ProdutoDAO {

	@Override
	public void save(Produto produto) {
		System.out.println("JDBC: Produto salvo");
	}

	@Override
	public void delete(Produto produto) {
		System.out.println("JDBC: Produto delete");
	}

	@Override
	public List<Produto> findAll() {
		System.out.println("JDBC: Produto findAll");
		return null;
	}

	@Override
	public Produto findById(Long codigo) {
		System.out.println("JDBC: Produto findByID");
		return null;
	}

}

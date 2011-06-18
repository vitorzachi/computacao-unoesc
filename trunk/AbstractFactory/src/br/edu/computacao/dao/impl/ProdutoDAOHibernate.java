package br.edu.computacao.dao.impl;

import java.util.List;

import br.edu.computacao.dao.ProdutoDAO;
import br.edu.computacao.model.Produto;

public class ProdutoDAOHibernate implements ProdutoDAO {

	@Override
	public void save(Produto produto) {
		System.out.println("Hibernate: Produto salvo");
	}

	@Override
	public void delete(Produto produto) {
		System.out.println("Hibernate: Produto delete");
	}

	@Override
	public List<Produto> findAll() {
		System.out.println("Hibernate: Produto findAll");
		return null;
	}

	@Override
	public Produto findById(Long codigo) {
		System.out.println("Hibernate: Produto findById");
		return null;
	}

}

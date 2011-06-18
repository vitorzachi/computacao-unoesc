package br.edu.computacao.dao.impl;

import java.util.List;

import br.edu.computacao.dao.CategoriaDAO;
import br.edu.computacao.model.Categoria;

public class CategoriaDAOJDBC implements CategoriaDAO {

	@Override
	public void save(Categoria categoria) {
		System.out.println("JDBC: Categoria salvo");
	}

	@Override
	public void delete(Categoria categoria) {
		System.out.println("JDBC: Categoria delete");
	}

	@Override
	public List<Categoria> findAll() {
		System.out.println("JDBC: Categoria findAll");
		return null;
	}

	@Override
	public Categoria findById(Long codigo) {
		System.out.println("JDBC: Categoria findById");
		return null;
	}

}

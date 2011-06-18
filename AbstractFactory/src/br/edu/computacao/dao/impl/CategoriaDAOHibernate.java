package br.edu.computacao.dao.impl;

import java.util.List;

import br.edu.computacao.dao.CategoriaDAO;
import br.edu.computacao.model.Categoria;

public class CategoriaDAOHibernate implements CategoriaDAO {

	@Override
	public void save(Categoria categoria) {
		System.out.println("Hibernate: Categoria salvo");
	}

	@Override
	public void delete(Categoria categoria) {
		System.out.println("Hibernate: Categoria delete");
	}

	@Override
	public List<Categoria> findAll() {
		System.out.println("Hibernate: Categoria findAll");
		return null;
	}

	@Override
	public Categoria findById(Long codigo) {
		System.out.println("Hibernate: Categoria findById");
		return null;
	}

}

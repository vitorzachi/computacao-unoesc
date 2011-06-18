package br.edu.computacao.dao.impl;

import br.edu.computacao.dao.CategoriaDAO;
import br.edu.computacao.dao.DAOFactory;
import br.edu.computacao.dao.ProdutoDAO;

public class HibernateFactory implements DAOFactory {

	@Override
	public ProdutoDAO getProdutoDAO() {
		return new ProdutoDAOHibernate();
	}

	@Override
	public CategoriaDAO getCategoriaDAO() {
		return new CategoriaDAOHibernate();
	}

}

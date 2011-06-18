package br.edu.computacao.dao;

public interface DAOFactory {

	ProdutoDAO getProdutoDAO();
	CategoriaDAO getCategoriaDAO();
}

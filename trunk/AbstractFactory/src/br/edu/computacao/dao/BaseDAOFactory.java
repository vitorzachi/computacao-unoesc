package br.edu.computacao.dao;

public class BaseDAOFactory {

	private static DAOFactory factory;

	public static void setFactory(DAOFactory factory) {
		BaseDAOFactory.factory = factory;
	}

	public static DAOFactory getFactory() throws Exception {
		if(factory != null){
			return factory;
		} else {
			throw new Exception("Não foi possivel carregar a fabrica");
		}

	}
}

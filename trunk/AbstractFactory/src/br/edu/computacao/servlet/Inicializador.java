package br.edu.computacao.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import testDAO.TestDAO;
import br.edu.computacao.dao.BaseDAOFactory;
import br.edu.computacao.dao.DAOFactory;

public class Inicializador implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		ServletContext sc = arg0.getServletContext();
		String daoFactory = sc.getInitParameter("daoFactory");

		if(daoFactory != null){
			try {
					DAOFactory factory = (DAOFactory)Class
						.forName(daoFactory)
						.newInstance();
					BaseDAOFactory.setFactory(factory);
				} catch (InstantiationException e) {
				} catch (IllegalAccessException e) {
				} catch (ClassNotFoundException e) {
				}
			}
	}

}

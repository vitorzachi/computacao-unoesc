package testDAO;

import br.edu.computacao.dao.BaseDAOFactory;
import br.edu.computacao.dao.DAOFactory;
import br.edu.computacao.dao.ProdutoDAO;
import br.edu.computacao.model.Produto;

public class TestDAO {

	public static void main(String[] args) {
		try {
			DAOFactory factory = (DAOFactory)Class
				.forName("br.edu.computacao.dao.impl.HibernateFactory")
				.newInstance();
			BaseDAOFactory.setFactory(factory);
			new TestDAO().tela1();
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		} catch (ClassNotFoundException e) {
		}


	}

	public void tela1(){
		try {
			ProdutoDAO produtoDAO = BaseDAOFactory.getFactory()
											.getProdutoDAO();
			produtoDAO.save(new Produto());
			produtoDAO.delete(new Produto());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

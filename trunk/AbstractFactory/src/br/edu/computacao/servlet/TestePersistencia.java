package br.edu.computacao.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.computacao.dao.BaseDAOFactory;
import br.edu.computacao.dao.ProdutoDAO;
import br.edu.computacao.model.Produto;

/**
 * Servlet implementation class TestePersistencia
 */
@WebServlet("/TestePersistencia")
public class TestePersistencia extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestePersistencia() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ProdutoDAO produtoDAO = BaseDAOFactory.
										getFactory().getProdutoDAO();
			produtoDAO.save(new Produto());
			produtoDAO.delete(new Produto());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

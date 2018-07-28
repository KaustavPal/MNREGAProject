package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.C_ProjectBean;
import bean.ERegBean;
import dao.SearchEmployeeProjectDAO;

/**
 * Servlet implementation class SearchEmployeeProjectServlet
 */
@WebServlet("/SearchEmployeeProjectServlet")
public class SearchEmployeeProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchEmployeeProjectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("pid");
		
		try {
			SearchEmployeeProjectDAO calldao = new SearchEmployeeProjectDAO();
			Collection<ERegBean> list=calldao.getAllMembers(name);
			//Collection<C_ProjectBean>list1=calldao.getPname(name);
			request.setAttribute("LIST", list);
			//request.setAttribute("LIST1", list1);
			request.setAttribute("NAME", name);
			RequestDispatcher rd=request.getRequestDispatcher("/SearchEmployeeProjectResult.jsp?");
			rd.forward(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

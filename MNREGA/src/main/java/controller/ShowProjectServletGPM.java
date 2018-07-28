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

import dao.ShowProjectDAO;
import dao.ShowProjectGPMDAO;

/**
 * Servlet implementation class ShowProjectServlet
 */
@WebServlet("/ShowProjectServletGPM")
public class ShowProjectServletGPM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowProjectServletGPM() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("nm");
		try {
			ShowProjectGPMDAO dao=new ShowProjectGPMDAO(name);
			Collection<C_ProjectBean> list=dao.getAllProject();
			request.setAttribute("LIST", list);
			RequestDispatcher rd=request.getRequestDispatcher("/ShowProjectGPM.jsp");
			rd.forward(request,response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.sendError(420,"Error in class loading: "+e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.sendError(421,"Error in SQL: "+e.getMessage());
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

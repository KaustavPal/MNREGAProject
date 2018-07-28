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


import bean.DelGPMBean;

import dao.DelGPMDAO;

/**
 * Servlet implementation class DelGPMServlet
 */
@WebServlet("/DelGPMServlet")
public class DelGPMServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelGPMServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			DelGPMDAO dao=new DelGPMDAO();
			Collection<DelGPMBean> list=dao.getAllMembers();
			request.setAttribute("LIST", list);
			RequestDispatcher rd=request.getRequestDispatcher("/DelGPM.jsp");
			rd.forward(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.sendError(421,"Error in SQL: "+e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.sendError(421,"Error in Class Loading: "+e.getMessage());
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uid=request.getParameter("userid");
		DelGPMDAO calldao = null;
		try {
			calldao = new DelGPMDAO();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean b1 = calldao.deleteGPM(uid);
		if(b1)
			response.sendRedirect("GPMDeleteSuccessful.html");
		else
			response.sendRedirect("GPMDeleteUnsuccessful.html");
	}
		
		
		
	}



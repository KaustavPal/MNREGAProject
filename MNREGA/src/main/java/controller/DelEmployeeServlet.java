package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bean.DelEmployeeBean;
import bean.DelGPMBean;
import dao.DelEmployeeDAO;
import dao.DelGPMDAO;

/**
 * Servlet implementation class DelEmployeeServlet
 */
@WebServlet("/DelEmployeeServlet")
public class DelEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=LoggerFactory.getLogger(DelEmployeeServlet.class); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			DelEmployeeDAO dao=new DelEmployeeDAO();
			Collection<DelEmployeeBean> list=dao.getAllMembers();
			request.setAttribute("LIST", list);
			RequestDispatcher rd=request.getRequestDispatcher("/DelEmployee.jsp");
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
		PrintWriter out=response.getWriter();
		DelEmployeeDAO calldao = null;
		try {
			calldao = new DelEmployeeDAO();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean b1 = calldao.deleteEmployee(uid);
		if(b1)
			out.println("<p align=center><font size=5>Employee Deleted...</font></p>");
		else
			out.println("<p align=center><font size=5 color=red>Employee Not Found...!! Try Another User ID</font></p>");
	}
		
	}



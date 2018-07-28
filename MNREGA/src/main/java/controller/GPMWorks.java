package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.GPMLoginDAO;

/**
 * Servlet implementation class GPMLoginServlet
 */
@WebServlet("/GPMWorks")
public class GPMWorks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GPMWorks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		String nm=(String) request.getSession(false).getAttribute("NM");
				
		if("View Assigned Project".equals(action))
			response.sendRedirect("ShowProjectServletGPM?nm="+nm);

		else if("Create New Employee".equals(action))
			response.sendRedirect("ERegistration.jsp?");
		else if("Delete Employee".equals(action))
			response.sendRedirect("DelEmployeeServlet?");
		else if("Search Employee".equals(action))
			response.sendRedirect("SearchEmployee.jsp");
		else if("Search Project".equals(action))
			response.sendRedirect("SearchEmployeeProject.jsp");
		else if("Employee attendence".equals(action))
			response.sendRedirect("EmployeeAttendence.html");
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	}



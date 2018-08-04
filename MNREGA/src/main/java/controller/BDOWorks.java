package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class BDOWorks
 */
@WebServlet("/BDOWorks")
public class BDOWorks extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=LoggerFactory.getLogger(BDOWorks.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BDOWorks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		if("Add New Gram Panchayet member".equals(action))
			response.sendRedirect("AddGPM.jsp?");
		else if("Delete Gram Panchayet member".equals(action))
			response.sendRedirect("DelGPMServlet?");
		else if("Search Gram Panchayet member".equals(action))
			response.sendRedirect("SearchGPM.jsp?");
		else if("Create New Project".equals(action))
			response.sendRedirect("CreateProject.jsp?");
		else if("View List Of Project".equals(action))
			response.sendRedirect("ShowProjectServlet?");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

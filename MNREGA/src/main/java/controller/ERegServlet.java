package controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bean.ERegBean;
import dao.ERegDAO;

/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/reg")
public class ERegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=LoggerFactory.getLogger(ERegServlet.class);   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ERegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ERegBean user = new ERegBean();
		user.setUserid(request.getParameter("userid"));
		user.setName(request.getParameter("name"));
		user.setGender(request.getParameter("gender"));
		user.setDob(request.getParameter("dob"));
		user.setAddress(request.getParameter("address"));
		user.setMobileno(request.getParameter("mobileno"));
		user.setPid(request.getParameter("pid"));
		
		
		ERegDAO callregdao = new ERegDAO();
		boolean b1 = callregdao.insertData(user);
		PrintWriter out = response.getWriter();
		if(b1)
		{
			
			out.println("<p align=center size=5>Employee Registration Successful</p>");
		}
		else
			out.println("<p align=center size=5><font color=red>Employee Registration Unsuccessful...Please Try Again</font></p>");
			/*request.setAttribute("errorMessage", "Error in Storing Data. Please Try Again...");
			RequestDispatcher rd=request.getRequestDispatcher("/Registration.jsp");            
			rd.include(request, response);*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

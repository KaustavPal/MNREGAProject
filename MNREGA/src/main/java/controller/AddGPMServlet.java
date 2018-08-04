package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bean.AddGPMBean;
import dao.AddGPMDAO;

/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/AddGPM")
public class AddGPMServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=LoggerFactory.getLogger(AddGPMServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddGPMServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AddGPMBean user = new AddGPMBean();
		user.setUserid(request.getParameter("userid"));
		user.setPassword(request.getParameter("password"));
		user.setName(request.getParameter("name"));
		user.setGender(request.getParameter("gender"));
		user.setDob(request.getParameter("dob"));
		user.setAddress(request.getParameter("address"));
		user.setMobileno(request.getParameter("mobileno"));
		user.setEmailid(request.getParameter("emailid"));
		
		AddGPMDAO callregdao = new AddGPMDAO();
		boolean b1 = callregdao.insertData(user);
		if(b1)
		{
			logger.info("Registration Successful");
			response.sendRedirect("GPMRegSuccess.jsp");
		}
			
		else
			request.setAttribute("errorMessage", "Registration Unsuccessful...!! Please Try Again...");
			RequestDispatcher rd=request.getRequestDispatcher("/AddGPM.jsp");            
			rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

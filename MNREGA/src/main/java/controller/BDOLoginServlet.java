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

import bean.BDOLoginBean;

import dao.BDOLoginDAO;


/**
 * Servlet implementation class BDOLoginServlet
 */
@WebServlet("/BDOLoginServlet")
public class BDOLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=LoggerFactory.getLogger(BDOLoginServlet.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BDOLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		//BDOLoginBean user = new BDOLoginBean();
		
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		
		
		BDOLoginDAO calllogdao = new BDOLoginDAO();
		 boolean b1=calllogdao.login(userid, password);
		
	
		
		 if(b1){ 
			 logger.info("Login Successful");
		    	response.sendRedirect("BDOWork.jsp");
		    	
		    	
		         
		    }  
		    else{    
		    	request.setAttribute("error","Invalid Username or Password");
		    	RequestDispatcher rd=request.getRequestDispatcher("/BDOLogin.jsp");            
		    	rd.include(request, response);
		        
		    }  
	}

}

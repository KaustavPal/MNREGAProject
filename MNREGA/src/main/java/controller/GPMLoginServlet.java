package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.AddGPMBean;
import dao.GPMLoginDAO;

/**
 * Servlet implementation class GPMLoginServlet
 */
@WebServlet("/GPMLoginServlet")
public class GPMLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public GPMLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    

    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		//PrintWriter out = response.getWriter();
		
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		
		
		GPMLoginDAO calllogdao = new GPMLoginDAO();
		 //boolean b1=calllogdao.login(userid, password);
		AddGPMBean c = null;
		try {
			c = calllogdao.login(userid, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		 if(c!=null){ 
			 String nm = c.getUserid();
			 request.setAttribute("NAME",nm);
			 request.getRequestDispatcher("/GPMWork.jsp").forward(request, response);
		    	//response.sendRedirect("GPMWork.jsp?nm="+c.getName());
		    	
		    	
		         
		    }  
		    else{    
		    	request.setAttribute("error","Invalid Username or Password");
		    	RequestDispatcher rd=request.getRequestDispatcher("/GPMLogin.jsp");            
		    	rd.include(request, response);
		        
		    }  
		
	}
	}



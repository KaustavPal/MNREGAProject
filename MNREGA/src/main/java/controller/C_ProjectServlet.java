package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bean.C_ProjectBean;
import dao.C_ProjectDAO;


/**
 * Servlet implementation class C_ProjectServlet
 */
@WebServlet("/C_ProjectServlet")
public class C_ProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=LoggerFactory.getLogger(C_ProjectServlet.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_ProjectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	C_ProjectBean user=new C_ProjectBean();
		
		user.setPid(request.getParameter("pid"));
		user.setPname(request.getParameter("pname"));
		user.setPlocation(request.getParameter("plocation"));
		user.setPduration(request.getParameter("pduration"));
		user.setPhead(request.getParameter("phead"));
		user.setPgpm(request.getParameter("pgpm"));
		
		
		C_ProjectDAO calldaoreg = new C_ProjectDAO();
		boolean b1= calldaoreg.insertData(user);
		
		PrintWriter out = response.getWriter();
		
		if(b1)
			out.print("<p align=center><font size=5>Project Created...</font></p>");
		else
			out.print("<p align=center><font size=5>Error creating project...!!</font></p>");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

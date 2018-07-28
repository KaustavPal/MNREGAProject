package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.AttendenceBean;
import dao.AttendenceDAO;
import dao.ERegDAO;

/**
 * Servlet implementation class AttendenceServlet
 */
public class AttendenceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AttendenceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AttendenceBean user=new AttendenceBean();
		user.setUserid(request.getParameter("userid"));
		user.setDate(request.getParameter("date"));
		AttendenceDAO callregdao = new AttendenceDAO();
		boolean b1 = callregdao.insertData(user);
		PrintWriter out = response.getWriter();
		if(b1)
		{
			
			out.println("<p align=center size=5>Attendence Sheet Updated</p>");
		}
		else
			out.println("<p align=center size=5><font color=red>Error Updating Attendence Sheet</font></p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

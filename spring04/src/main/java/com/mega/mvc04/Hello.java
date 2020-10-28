package com.mega.mvc04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String id2 = null;
	String pw2 = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		id2 = config.getInitParameter("id");
		//System.out.println(id);
		pw2 = config.getInitParameter("pw");
		//System.out.println(pw);
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("welcome!! get!!");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h1>origin login id= "+id2);
		out.println("<h1>origin login pw= "+pw2);
		out.println("<h1>login id= "+id);
		out.println("<h1>pw= "+pw);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("welcome!! post!!");
	}

}

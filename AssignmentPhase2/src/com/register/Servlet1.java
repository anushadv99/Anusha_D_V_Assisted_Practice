package com.register;

import java.io.IOException;
import java.io.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			String n=request.getParameter("username");
			String p=request.getParameter("password");
			
			out.print("welcome " + n +" "+p);
			
			Cookie ck=new Cookie("username",n);
			response.addCookie(ck);
			Cookie ck1=new Cookie("password",p);
			response.addCookie(ck1);
			
			
			out.print("<form action='Servlet2'>");
			out.print("<input type='submit' value='go'>");
			out.println("</form>");
			out.close();
			
		}
		catch (Exception e){
			System.out.println(e);
		}
		doGet(request, response);
	}

}

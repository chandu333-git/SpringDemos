package com.student.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.model.Student;

/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int roll=Integer.parseInt(request.getParameter("roll"));
        String name=request.getParameter("name");
        int marks=Integer.parseInt(request.getParameter("marks"));
		
        Student student=new Student();
		student.setRoll(roll);
		student.setName(name);
		student.setMarks(marks);
		
		RequestDispatcher view=request.getRequestDispatcher("disp.jsp");
		request.setAttribute("studentdetails",student);
		view.forward(request,response);		
		
		
	}

}

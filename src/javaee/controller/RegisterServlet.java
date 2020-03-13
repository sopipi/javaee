package javaee.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaee.domain.User;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		User user = new User();
		request.setCharacterEncoding("UTF-8");
		String userName = request.getParameter("userName");
		String studentId= request.getParameter("studentId");
		String sex= request.getParameter("sex");
		String college= request.getParameter("college");
		String major= request.getParameter("major");
		String[] hobby = request.getParameterValues("hobby");
		List<String> hobbies = Arrays.asList(hobby);
		String introduce =  request.getParameter("introduce");
		
		user.setUserName(userName);
		user.setStudentId(studentId);
		user.setSex(sex);
		user.setCollege(college);
		user.setMajor(major);
		user.setHobbies(hobbies);
		user.setIntroduce(introduce); 
		
		System.out.println(user.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

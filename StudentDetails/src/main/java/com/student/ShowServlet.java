package com.student;

import java.io.*;
import javax.servlet.http.*;


public class ShowServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("Text/Html");
		PrintWriter out= res.getWriter();
		String name=req.getParameter("name");
		String regdNo=req.getParameter("RegdNo");
		String gender[]=req.getParameterValues("gender");
		String semester[]=req.getParameterValues("sem");
		String course[]=req.getParameterValues("course");
		String lang[]=req.getParameterValues("language");
		String hobby=req.getParameter("hobby");
		out.print("<html>\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "<h1>Student Details</h1>\r\n"
				+ "\r\n"
				+ "<b>name:</b>"+name+"<br>\r\n"
				+ "<b>Regd. No:</b>"+regdNo+"<br>\r\n"
				+ "<b>Gender:</b>"+gender[0]+"<br>\r\n"
				+ "<b>Semester:</b>"+semester[0]+"<br>\r\n"
				+ "<b>Course:</b>"+course[0]+"<br>\r\n"
				+ "<b>Language:</b>"+lang[0]+"<br>"
				+ "<b>Your hobbies are: </b>"+hobby+"<br><br>"
				+ "</body>\r\n"
				+ "</html>");
	}

}

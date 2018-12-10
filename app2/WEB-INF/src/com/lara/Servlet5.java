package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;

public class Servlet5 extends HttpServlet
{
    public void service(HttpServletRequest request,
    HttpServletResponse response) 
    throws IOException,ServletException
    {
        PrintWriter out = response.getWriter();
        String firstName = request.getParameter("firstName");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String gender = request.getParameter("gender");
        String skill = request.getParameter("skill");
        String education = request.getParameter("education");

        out.println("First Name : "+firstName);
        out.println("Password : "+password);
        out.println("Address : "+address);
        out.println("Gender : "+gender);
        out.println("skill : "+skill);
        out.println("Education : "+education);
    }
}

/*
if you are not checking radio box then those values will not be going to 
servlet.
*/
package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;

public class Servlet3 extends HttpServlet
{
    public void service(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException,IOException
    {
        PrintWriter out = response.getWriter();

        String s1 = request.getParameter("firstName");
        String s2 = request.getParameter("lastName");
        String s3 = request.getParameter("companyName");
        String s4 = request.getParameter("address");

        out.println("From servlet3");
        out.println("FirstName : "+s1);
        out.println("LastName : "+s2);
        out.println("CompanyName : "+s3);
        out.println("Address : "+s4);
    }
}
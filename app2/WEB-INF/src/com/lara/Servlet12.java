package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.util.*;

public class Servlet12 extends HttpServlet
{
    public void service(HttpServletRequest request,
    HttpServletResponse response) 
    throws IOException,ServletException
    {
        ServletContext context = getServletContext();//one of the inherited method
        PrintWriter out = response.getWriter();
        String s1 = context.getInitParameter("con1");
        String s2 = context.getInitParameter("password");

        out.println("From Servlet12");
        out.println(s1);
        out.println(s2);
    }
}
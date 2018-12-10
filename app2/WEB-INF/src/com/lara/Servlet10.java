package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.util.*;

public class Servlet10 extends HttpServlet
{
    public void service(HttpServletRequest request,
    HttpServletResponse response) 
    throws IOException,ServletException
    {
        
        PrintWriter out = response.getWriter();
        String s1 = getInitParameter("driver");
        String s2 = getInitParameter("reduction");
        out.println("from Servlet10 ");
        out.println(s1);
        out.println(s2);
    }
}
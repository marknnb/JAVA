package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.util.*;

public class Servlet13 extends HttpServlet
{
    public void service(HttpServletRequest request,
    HttpServletResponse response) 
    throws IOException,ServletException
    {
        ServletContext context = getServletContext();//one of the inherited method
        PrintWriter out = response.getWriter();
        Enumeration names = context.getInitParameterNames();
        String name, value;
        while(names.hasMoreElements())
        {
            name = (String)names.nextElement();
            value = context.getInitParameter(name);
            out.println(name+":"+value);
        }
    }
}
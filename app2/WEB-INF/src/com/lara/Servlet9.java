package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.util.*;

public class Servlet9 extends HttpServlet
{
    public void service(HttpServletRequest request,
    HttpServletResponse response) 
    throws IOException,ServletException
    {
        
        PrintWriter out = response.getWriter();
        Enumeration<String> names = request.getParameterNames();
        String name, values[];

        while(names.hasMoreElements())
        {
            name = names.nextElement();
            values = request.getParameterValues(name);
            out.println(name+" : "+ Arrays.toString(values));
        }
    }
}
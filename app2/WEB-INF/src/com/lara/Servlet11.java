package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.util.*;

public class Servlet11 extends HttpServlet
{
    public void service(HttpServletRequest request,
    HttpServletResponse response) 
    throws IOException,ServletException
    {
        PrintWriter out = response.getWriter();
        Enumeration names = getInitParameterNames();
        String name,value;
        while(names.hasMoreElements())
        {
            name = (String)names.nextElement();
            value = getInitParameter(name);
            out.println(name + ":" + value);
        }
    }
}
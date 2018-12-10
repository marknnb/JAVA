package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.util.*;

public class Servlet7 extends HttpServlet
{
    public void service(HttpServletRequest request,
    HttpServletResponse response) 
    throws IOException,ServletException
    {
        PrintWriter out = response.getWriter();
        String queryString = request.getQueryString();
        if(queryString!=null)
        {
             String params [] = queryString.split("&");
            String name,value;
            int index;
            for(String param : params)
            {
                index = param.indexOf("=");
                name  = param.substring(0,index);
                value = param.substring(index + 1,param.length());
                out.println(param + " ==> "+ name + ":"+value);
            }
        }else{
            out.println("submit the form through get method");
        }
    }
}

/*
if method=post then getQuery method returns null
*/

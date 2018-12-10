package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.util.*;

public class Servlet6 extends HttpServlet
{
    public void service(HttpServletRequest request,
    HttpServletResponse response)
    throws IOException,ServletException
    {
        PrintWriter out = response.getWriter();
        out.println("Hi from servlet6");

        String [] firstName = request.getParameterValues("firstName");
        String [] password  = request.getParameterValues("password");
        String [] address   = request.getParameterValues("address");
        String [] gender    = request.getParameterValues("gender");
        String [] skill     = request.getParameterValues("skill");
        String [] education = request.getParameterValues("education");

        out.println("firstName :"+Arrays.toString(firstName));
        out.println("password  :"+Arrays.toString(password));
        out.println("address   :"+Arrays.toString(address));
        out.println("gender    :"+Arrays.toString(gender));
        out.println("skill     :"+Arrays.toString(skill));
        out.println("education :"+Arrays.toString(education));
    }
}
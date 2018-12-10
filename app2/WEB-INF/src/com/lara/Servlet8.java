package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.util.*;

public class Servlet8 extends HttpServlet
{
    public void service(HttpServletRequest request,
    HttpServletResponse response)
    throws IOException,ServletException
    {
        PrintWriter out = response.getWriter();
        Map params = request.getParameterMap();

        String [] firstName = (String[])params.get("firstName");
        String [] password  = (String[])params.get("password");
        String [] address   = (String[])params.get("address");
        String [] gender    = (String[])params.get("gender");
        String [] skill     = (String[])params.get("skill");
        String [] education = (String[])params.get("education");

        out.println("firstName :"+Arrays.toString(firstName));
        out.println("password  :"+Arrays.toString(password));
        out.println("address   :"+Arrays.toString(address));
        out.println("gender    :"+Arrays.toString(gender));
        out.println("skill     :"+Arrays.toString(skill));
        out.println("education :"+Arrays.toString(education));
    }
}
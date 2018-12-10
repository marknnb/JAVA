package com.lara;
import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;

public class Servlet2 extends HttpServlet
{
    public void service(HttpServletRequest request,
                        HttpServletResponse response)
                        throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
        String s1 = request.getParameter("param1");
        String s2 = request.getParameter("param2");
        out.println("From Servlet2 : "+s1+", "+s2);
    }
}
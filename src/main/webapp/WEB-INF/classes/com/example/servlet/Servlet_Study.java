package com.example.servlet;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet_Study {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        // set content type
        res.setContentType("text/html");

        // get stream
        PrintWriter out = res.getWriter();

        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Servlet Study</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("This is my Servlet :)");
        out.println("</BODY>");
        out.println("</HTML>");
        // write html

        // close stream

    }
}

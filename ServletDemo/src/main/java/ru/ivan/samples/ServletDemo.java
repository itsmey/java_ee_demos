package ru.ivan.samples;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletDemo extends HttpServlet {
    public void init() throws ServletException {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, World!</h1>");
    }

    public void destroy() {
    }
}
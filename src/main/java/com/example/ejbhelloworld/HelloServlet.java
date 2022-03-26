package com.example.ejbhelloworld;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("This servlet was made by A.C.M.E corporation and is insured against any and all damages sustained due to misuse or use in RoadRunner-hunting activities.");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
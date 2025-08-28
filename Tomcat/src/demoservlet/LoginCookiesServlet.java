/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoservlet;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

/**
 *
 * @author asyla
 */

public class LoginCookiesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Hardcoded credentials for demo
        if ("admin".equals(username) && "1234".equals(password)) {
            Cookie userCookie = new Cookie("username", username);
            userCookie.setMaxAge(60 * 60); // 1 hour
            response.addCookie(userCookie);

            response.sendRedirect("WelcomeServlet");
        } else {
            out.println("<p style='color:red;'>Invalid credentials. Try again.</p>");
            request.getRequestDispatcher("LoginCookies.html").include(request, response);
        }
    }
}

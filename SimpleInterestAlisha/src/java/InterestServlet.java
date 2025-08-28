/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author asyla
 */
@WebServlet(urlPatterns = {"/InterestServlet"})
public class InterestServlet extends HttpServlet {

//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet InterestServlet</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet InterestServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}















//import java.io.IOException;
//import java.io.PrintWriter;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/InterestServlet")
//public class InterestServlet extends HttpServlet {

 

//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        // Redirect GET requests to the form page
//        response.sendRedirect("interestForm.html");
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        response.setContentType("text/html;charset=UTF-8");
//        try ( PrintWriter out = response.getWriter()) {
//
//            // Read form parameters
//            double principal = Double.parseDouble(request.getParameter("principal"));
//            double time = Double.parseDouble(request.getParameter("time"));
//            double rate = Double.parseDouble(request.getParameter("rate"));
//
//            // Calculate simple interest
//            double interest = (principal * time * rate) / 100;
//
//            // Display result
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Simple Interest Result</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h2>Simple Interest Calculator</h2>");
//            out.println("<p>Principal: " + principal + "</p>");
//            out.println("<p>Time: " + time + " years</p>");
//            out.println("<p>Rate: " + rate + "%</p>");
//            out.println("<h3>Simple Interest = " + interest + "</h3>");
//            out.println("<br><a href='interestForm.html'>Calculate Again</a>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
//}





    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        displayForm(response, 0, 0, 0, 0, false);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        double principal = Double.parseDouble(request.getParameter("principal"));
        double time = Double.parseDouble(request.getParameter("time"));
        double rate = Double.parseDouble(request.getParameter("rate"));
        double interest = (principal * time * rate) / 100;

        displayForm(response, principal, time, rate, interest, true);
    }

    private void displayForm(HttpServletResponse response,
                             double principal, double time, double rate, double interest, boolean showResult)
            throws IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>Simple Interest Calculator</title></head>");
            out.println("<body>");
            out.println("<h2>Simple Interest Calculator</h2>");
            out.println("<form method='post'>");
            out.println("Principal (P): <input type='number' name='principal' required><br><br>");
            out.println("Time (T in years): <input type='number' name='time' required><br><br>");
            out.println("Rate (R %): <input type='number' step='0.01' name='rate' required><br><br>");
            out.println("<input type='submit' value='Calculate'>");
            out.println("</form>");

            if (showResult) {
                out.println("<h3>Result:</h3>");
                out.println("<p>Principal: " + principal + "</p>");
                out.println("<p>Time: " + time + " years</p>");
                out.println("<p>Rate: " + rate + " %</p>");
                out.println("<p>Simple Interest = " + interest + "</p>");
            }

            out.println("</body>");
            out.println("</html>");
        }
    }
}
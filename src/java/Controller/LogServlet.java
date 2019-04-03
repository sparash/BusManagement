/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import Model.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
public class LogServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String uname=request.getParameter("username");
        String email=request.getParameter("email");
        String pwd=request.getParameter("password");
        String AccType=request.getParameter("AccType");
        User u=new User();
        u.setEmail(email);
        u.setPwd(pwd);
        u.setType(AccType);
        
        UserDAO access=new UserDAO();
        System.out.println(access.check(u));
        if(access.check(u))
        {
            HttpSession session=request.getSession();
            session.setAttribute("email",email);
            if(u.getType().equals("admin")){
                RequestDispatcher rd=request.getRequestDispatcher("index1.html");
                rd.forward(request,response);
            }
            else if(u.getType().equals("staff"))
            {
                RequestDispatcher rd=request.getRequestDispatcher("faculty.html");
                rd.forward(request,response);
            }
            else if(u.getType().equals("student")||u.getType().equals("faculty"))
            {
                RequestDispatcher rd=request.getRequestDispatcher("studant.html");
                rd.forward(request,response);
            }
        }
        else {
            System.out.println(u.getType());
            response.sendRedirect("index.html");
        }
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
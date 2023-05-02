package com.firstPage;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{
            PrintWriter out = response.getWriter();
            Connection con = new SQLcon().mySqlconnetion();
            String logn = request.getParameter("loguser");
            String logp = request.getParameter("logpassword");

            String getSQL = "select name from users where name=? and password=?";
            PreparedStatement pst = con.prepareStatement(getSQL);
            pst.setString(1,logn);
            pst.setString(2,logp);
            ResultSet rs = pst.executeQuery();

            if (rs.next())
            {
//                RequestDispatcher rd = request.getRequestDispatcher("welcomepage.jsp");
//                rd.forward(request,response);
                if(logn == null || logp == null) {
                    response.sendRedirect("loginPage.jsp");
                } else {
                    HttpSession session = request.getSession();
                    session.setAttribute("username" , logn);
                    response.sendRedirect("welcomepage.jsp");
                }

            }else {
                response.sendRedirect("loginPage.jsp");
            }
            //System.out.println(name1 + " - " + password1);


        }catch (Exception e){
            throw new ServletException("No login detais available", e);
        }



    }
}

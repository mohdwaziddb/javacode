package com.firstPage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/CreateServlet")
public class CreateServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String name = request.getParameter("inname");
        String dob = request.getParameter("indob");
        String mobile = request.getParameter("inmobile");
        String email = request.getParameter("inemail");
        String password = request.getParameter("inpassword");
        String reference = request.getParameter("inreference");
        String userid= null;
        String youruserid= null;



        try {
            Connection con =  new SQLcon().mySqlconnetion();
            String insertSQL = "INSERT INTO users (name, dob, mobile, email, password, reference) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(insertSQL);

            pst.setString(1,name);
            pst.setString(2,dob);
            pst.setString(3,mobile);
            pst.setString(4,email);
            pst.setString(5,password);
            pst.setString(6,reference);
            pst.executeUpdate();
            //con.close();
            //System.out.println(insertSQL + " -insertSQL");


            String getuserIdSQL = "select user_id from users where name=? and password=?";
            PreparedStatement pst1 = con.prepareStatement(getuserIdSQL);
            pst1.setString(1,name);
            pst1.setString(2,password);
            ResultSet rs = pst1.executeQuery();
            if(rs.next()){
                userid = rs.getString("user_id");
            }else {
                //
            }
            //System.err.println("userid- " + userid);

            String insertrefid = "update users set your_reference_id =? where user_id = '"+userid+"'";
            PreparedStatement pst2 = con.prepareStatement(insertrefid);
            pst2.setString(1,"DB-"+userid);
            youruserid = "DB-"+userid;
            System.out.println(youruserid + " -youruserid");
            //System.err.println("-- query - " + insertrefid);
            pst2.executeUpdate();
            con.close();


        }catch (Exception e){
            throw new ServletException("Unable to insert user", e);
//            System.err.println(e.getMessage());
        }
        if(name == null || dob == null || mobile == null || email == null || password == null || reference == null) {
            response.sendRedirect("index.jsp");
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("username" , name);
            session.setAttribute("userdob", dob);
            session.setAttribute("usermobile", mobile);
            session.setAttribute("useremail", email);
            session.setAttribute("userreference", reference);
            session.setAttribute("youruserid12", youruserid);
            //System.out.println(userid + " userid");

            response.sendRedirect("welcomepage.jsp");
        }




    }
}

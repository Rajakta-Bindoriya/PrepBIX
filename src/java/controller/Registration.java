/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.UserDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ToRegister;

/**
 *
 * @author Raja
 */
public class Registration extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.sendRedirect("login.html");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String fullname = request.getParameter("fullName");
        String username = request.getParameter("userName");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String gender = request.getParameter("gender");
        String password = request.getParameter("pass");
        
        System.out.println(fullname);
        System.out.println(username);
        System.out.println(email);
        System.out.println(mobile);
        System.out.println(gender);
        System.out.println(password);
        
        UserDTO user = new UserDTO();
        user.setFullName(fullname);
        user.setUsername(username);
        user.setEmail(email);
        user.setMobile(mobile);
        user.setGender(gender);
        user.setPassword(password);
        
        ToRegister tr1 = new ToRegister();
        boolean register = tr1.isRegister(user);
        
        if(register)
        {
            HttpSession session = request.getSession(true);
            session.setAttribute("username",username);
            response.sendRedirect("registered.jsp");
            System.out.println("Registered successfully........ :)");
        }
        else
        {
            response.sendRedirect("login.html");
            
        }
        
    }
}

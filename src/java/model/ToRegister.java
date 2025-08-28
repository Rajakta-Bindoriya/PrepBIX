/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.UserDTO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Raja
 */
public class ToRegister 
{
    public boolean isRegister(UserDTO user )
    {
        boolean status=false;
        String fullName= user.getFullName();
        String username= user.getUsername();
        String email= user.getEmail();
        String mobile= user.getMobile();
        String password= user.getPassword();
        
        try
        {
            Statement st =DBConnector.getStatement();
            
            String query="INSERT INTO userData VALUES('"+fullName+"','"+username+"','"+email+"','"+mobile+"','"+password+"')";
            System.out.println("Query="+query);
            
            int i= st.executeUpdate(query);
            
            if(i>0)
            {
                //System.out.println("Record Updated.....");
                status=true;

            }
            else
            {   System.out.println("...Record Updation Failed...");
                
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        if(status)
        {
            return true;
        }
        return false;
        
    }
    
}

package com.coforge.Day_08_07_2026_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateApp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        
        
        
        String url="jdbc:mysql://localhost:3306/empdb";
        String uname="root";
        String pwd="mysql";
        //2
        Connection con=DriverManager.getConnection(url,uname,pwd);
        
        
        //3
        
        String qry="Update employeesalary set salary=? where emp_name=?";
        PreparedStatement ps=con.prepareStatement(qry);
        ps.setDouble(1, 900000.0);
        ps.setString(2, "Atharva");
        
       
        
        int noOfRows= ps.executeUpdate();
        
        System.out.println(noOfRows+" got updated");
	}
	
	
	

}

package com.coforge.Day_08_07_2026_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteApp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        
        
        
        String url="jdbc:mysql://localhost:3306/empdb";
        String uname="root";
        String pwd="mysql";
        //2
        Connection con=DriverManager.getConnection(url,uname,pwd);
        
        
        //3
        
        String qry = "DELETE FROM employeesalary WHERE emp_id = ?";

        PreparedStatement ps=con.prepareStatement(qry);
        ps.setInt(1, 103);
        
       
        
        int noOfRows= ps.executeUpdate();
        
        System.out.println(noOfRows+" got updated");
	}
	
	
	

}

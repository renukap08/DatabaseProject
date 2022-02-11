package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteExample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO Auto-generated method stub
        
        Class.forName("com.mysql.cj.jdbc.Driver");  
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");
        
        Statement stm = con.createStatement();
        
        stm.executeUpdate("delete from eproduct where name='Mobile';");
        
        ResultSet result = stm.executeQuery("select * from eproduct");
        
        while(result.next()) {
            
            System.out.println(result.getString("name"));
        }
        
        con.close();
	}
}

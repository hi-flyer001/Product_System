package com.CRUD;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Connection.Jdbc_connection;
import com.Entity.Product;

public class Session {
	
	public static void save(Product p1) throws ClassNotFoundException, IOException, SQLException {
		
		String query = "insert into Product (product_id,product_quantity,product_name) values(?,?,?)";
		
		Connection con = Jdbc_connection.getConnection();
		
		PreparedStatement pis = con.prepareStatement(query);
		
		pis.setInt(1, p1.getId());
		
		pis.setInt(2, p1.getQuantity());
		
		pis.setString(3, p1.getName());
		
		pis.executeUpdate();
		
		System.out.println("Inserted Successfully");
		
	}
	
	public static Product get(int id) throws ClassNotFoundException, IOException, SQLException {
		
		String query = "select * from Product where product_id=?";
		
		Product p =null;
		
		Connection con = Jdbc_connection.getConnection();
		
		PreparedStatement pis = con.prepareStatement(query);
		
		pis.setInt(1, id);
		
		ResultSet rs = pis.executeQuery();
		
		while(rs.next()) {
			p = new Product();
			
			p.setId(rs.getInt("product_id"));
			p.setQuantity(rs.getInt("product_quantity"));
			p.setName(rs.getString("product_name"));
			System.out.println(rs.getInt("product_id"));
			System.out.println(rs.getInt("product_quantity"));
			System.out.println(rs.getString("product_name"));
			
		}
		return p;
	}

}

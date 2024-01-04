package com.sathya;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class UserDao {
		
		public int createProduct(String pid,String pname,String price,String brand,String madein,String manufacturingDate,String expiryDate,String productImage) {
			
			Connection connection = DatabaseUtils.createConnection();
			
			int result =0;
			try {
				
				PreparedStatement preparedStatement = connection.prepareStatement("insert into products22 values(?,?,?,?,?,?,?,?)");
				preparedStatement.setString(1, pid);
				preparedStatement.setString(2, pname);
				preparedStatement.setString(3, price);
				preparedStatement.setString(4, brand);
				preparedStatement.setString(5, madein);
				preparedStatement.setString(6, manufacturingDate);
				preparedStatement.setString(7, expiryDate);
				preparedStatement.setString(8, productImage);
				
			    result=	preparedStatement.executeUpdate();
				
				
			}
			catch(SQLException e) {
				e.printStackTrace();
				
			}
			return result;
			
			
		}

	}



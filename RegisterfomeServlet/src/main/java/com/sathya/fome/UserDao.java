package com.sathya.fome;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

	public class UserDao {
		
		public void saveUser(User user)
		{	Connection connection = DatabaseUtils.createConnection();	
			try {
				PreparedStatement preparedStatement = connection.prepareStatement("insert into user_data values(?,?,?,?,?,?,?,?)");
				preparedStatement.setString(1, user.getUsername());
				preparedStatement.setString(2, user.getPassword());
				preparedStatement.setString(3, user.getQualifications());
				preparedStatement.setString(4, user.getGender());
				preparedStatement.setString(5, user.getTechnologies());
				preparedStatement.setString(6, user.getType());
				preparedStatement.setString(7, user.getAddress());
				preparedStatement.setString(8, user.getComments());
				preparedStatement.executeUpdate();
			}
			catch(SQLException e)
			{	e.printStackTrace();
			}
			
		}
		public boolean logincheck(String username,String password)
		{	Connection connection = DatabaseUtils.createConnection();
		    boolean status=false;
			try {
				PreparedStatement preparedStatement = connection.prepareStatement("select * from USER_DATA where username=? and password=?");
				preparedStatement.setString(1, username);
				preparedStatement.setString(2, password);
				ResultSet resultSet= preparedStatement.executeQuery();
				if(resultSet.next())
				{
					status=true;
				}
			}
			catch(SQLException e)
			{	e.printStackTrace();
			}
			return status;
		}
	}

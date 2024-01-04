package com.sathyauserreg;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

public int saveUser(String username,String password,String email,String mobile)
{
int result=0;
//create the Connection
Connection connection = DatabaseUtils.createConnection();

try {
//store the data into data base
PreparedStatement preparedStatement = connection.prepareStatement("insert into  USERREGISTION values(?,?,?,?)");
preparedStatement.setString(1, username);
preparedStatement.setString(2, password);
preparedStatement.setString(3, email);
preparedStatement.setString(4, mobile);
result = preparedStatement.executeUpdate();
}
catch(SQLException e)
{
e.printStackTrace();
}
return result;

}

//search by the email
public Userinfo findByEmail(String email)
{
Userinfo userinfo=null;
//create the connection
Connection connection=DatabaseUtils.createConnection();

try {
PreparedStatement preparedStatement=connection.prepareStatement("select * from  USERREGISTION where email=(?)");
preparedStatement.setString(1, email);
ResultSet resultSet=preparedStatement.executeQuery();
resultSet.next();
//read the data from resultSet
userinfo=new Userinfo();
userinfo.setUsername(resultSet.getString(1));
userinfo.setPassword(resultSet.getString(2));
userinfo.setEmail(resultSet.getString(3));
userinfo.setMobile(resultSet.getString(4));


} catch (Exception e) {
e.printStackTrace();
}


return userinfo;
}
public int deleteuser(String mobile){
int result=0;
Connection connection=DatabaseUtils.createConnection();
try {
PreparedStatement preparedStatement=connection.prepareStatement("delete  from  USERREGISTION where mobile=(?)");
preparedStatement.setString(1, mobile);
result = preparedStatement.executeUpdate();

} catch (SQLException e) {
e.printStackTrace();
}

return result;
}

public List<Userinfo> getAllUsers()
{
List<Userinfo> listofUsers= new ArrayList<Userinfo>();
Connection connection=DatabaseUtils.createConnection();
try {
	Statement statement=connection.createStatement();
    ResultSet resultset=statement.executeQuery("select * from USERREGISTION ");
while (resultset.next())
{
Userinfo Userinfo=new Userinfo();
Userinfo.setUsername (resultset.getString(1)); 
Userinfo.setPassword (resultset.getString (2)); 
Userinfo.setEmail(resultset.getString (3)); 
Userinfo.setMobile (resultset.getString (4));
listofUsers.add(Userinfo);
}
}
catch (SQLException e) {
	e.printStackTrace();
}
return listofUsers;
   }

}



	
		





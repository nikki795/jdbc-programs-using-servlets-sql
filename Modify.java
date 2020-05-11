import java.sql.*;  
class Modify
{  
public static void main(String args[]) throws Exception
{  
//step1 load the driver class  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","root");  
  
//step3 create the statement object  
Statement stmt=con.createStatement();  
  
//step4 execute query

stmt.executeQuery("update Students set Sage=25 where Sid in (1,4)");  
  System.out.println("table modified");
  ResultSet rs=stmt.executeQuery("select * from Students");  
while(rs.next()) //step-6 getting the result 
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3) + " " + rs.getString(4) + "\n");  

//step5 close the connection object  
con.close();  
}  
}  
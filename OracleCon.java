import java.sql.*;  //STEP-1 Importing 
class OracleCon
{  
public static void main(String args[]) throws Exception
{  
//step2 load the driver class  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step3 create  the connection object  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");  
  
//step4 create the statement object  
Statement stmt=con.createStatement();  
  
//step5 execute query  
ResultSet rs=stmt.executeQuery("Sid number,SName varchar2(10),SRollnum number,Sage number");
while(rs.next()) //step-6 getting the result 
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
  
//step7 close the connection object  
con.close();  
}  
}  

 
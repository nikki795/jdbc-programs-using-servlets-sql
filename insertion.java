import java.sql.*; 
import java.util.*;
public class Insertion
{  
public static void main(String args[]) throws Exception
{  
Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");  
Statement st=con.createStatement();   
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("Enter student no");
int id=sc.nextInt();
System.out.println("Enter student name");
String Name=sc.next();
System.out.println("Enter student Rollnum");
int Rollnum=sc.nextInt();
System.out.println("Enter student age");
int age=sc.nextInt();
String sqlq=String.format("insert into Students values(%d,'%s','%d','%d')",id,Name,Rollnum,age);
st.executeUpdate(sqlq);
System.out.println("record inserted successfully");
System.out.println("insert more again Y/N");
String choice= sc.next();
if(choice.equalsIgnoreCase("N"))
{
break;
}  
}  
con.close();
}
}
package connection;
import java.sql.*;
public class MyConnection
{
    static
    {
      try
      {
        Class.forName("com.mysql.jdbc.Driver");
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
              
    }
            
    public static Connection getConnection()
    {
        Connection con=null;
        try
        {
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Library?autoReconnect=true&useSSL=false", "root", "root");
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
}

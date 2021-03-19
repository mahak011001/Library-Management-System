

<%@page import="connection.MyConnection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            body{
                background-image: url("images/download20.jpg");
                background-repeat: no-repeat;
                background-size: cover;
                
            }
            table{
                border-collapse: collapse;
                border: 1px solid black;
                padding: 50px 50px 50px 50px;
                
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <script>
        function check()
              {
                var name=document.myform.name.value;
                var pass=document.myform.pass.value;
                
                if(name==null || name=="")
                {
                    alert("Name is a mandatory field.");
                    return false;
                }
                if(pass==null || pass=="")
                {
                    alert("Password is a mandatory field.");
                    return false;
                }
                if(pass.length<6)
                {
                    alert("Password must contain 6 character(minimum)");
                    return false;
                }
            }
        </script>
        <center>
           <font color="white"><h1> Faculty Sign Up Page</h1></font>
        <form method="post" action="fsignup.jsp" name="myform" onsubmit="return check()">
            <table border="5" bgcolor="silver">
                <tr>
                    <th>Username</th>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <th>Password</th>
                    <td><input type="password" name="pass"></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <center><input type="submit">
                        <input type="reset"></center>
                    </td>
                </tr>
            
            
            </table>
        
        
        </form>
            </center>
    <%
        String user,pass;
        user=request.getParameter("name");
        pass=request.getParameter("pass");
        if(user!=null || pass!=null)
        {
         Connection con=null;
         PreparedStatement ps=null;
         try
         {
             con=MyConnection.getConnection();
             String sql;
             sql="insert into flogin values(?,?)";
             ps=con.prepareStatement(sql);
             ps.setString(1,user);
             ps.setString(2,pass);
             if(ps.executeUpdate()>0)
             {
                 response.sendRedirect("flogin.jsp");
             }
         }
         catch(Exception e)
         {}
        }
    %>
    </body>
</html>

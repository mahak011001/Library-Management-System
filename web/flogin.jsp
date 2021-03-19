<%@page import="dao.LibraryDAO" %>
 <%@page session="true" %>
<html>
    <head>
         <style>
            body{
                background-image: url("images/download20.jpg");
                background-repeat: no-repeat;
                background-size: cover;
                
            }
         </style>
        <title>www.online.com</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body bgcolor="orange">
    <center>
       <font color="white"><h1>Faculty Login Page</h1></font>
        <form method="post" action="flogin.jsp">
            <table border="5" bgcolor="silver" >
                <tr>
                    <th>Username</th>
                    <td><input type="text" name="name">
                </tr>
                <tr>
                    <th>Password</th>
                    <td><input type="password" name="pass">
                </tr>
                <tr>
                    <th colspan="2"><input type="submit">
                    <input type="reset"></th>
                    
                </tr>
            </table>
        </form>
            <%
                String user=null,pass=null;
                
                user=request.getParameter("name");
                pass=request.getParameter("pass");
                if(user!=null && pass!=null)
                {
                 if(LibraryDAO.chechkFLogin(user, pass))
                 {
                     session.setAttribute("username", user);
                     session.setAttribute("password", pass);
                     response.sendRedirect("fheader.jsp");
                 }
                     else
                     out.println("<font size=5 color=red>Invalid username or password</font>");
                }
            %>
        </center>
    </body>
</html>

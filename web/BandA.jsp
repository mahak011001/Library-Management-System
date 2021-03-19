<%@page import="model.Book"%>
<%@page import="dao.LibraryDAO"%>
<%@include file="sheader.jsp" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 30%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
    </head>
    <body>
        <br><br><br><br>
        <center>
        <form action="BandA.jsp" method="post">
            <table bgcolor="" border="5">
                <tr>
                    <th colspan="2"><center>Search By Book Name And Author Name</center></th>
                </tr>
                <tr>
                    <th>Book Name</th>
                    <td><input type="text" name="b_name"></td>
                </tr>
                 <tr>
                     <th>Author Name</th>
                    <td><input type="text" name="a_name"></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <center><input type="submit">
                        <input type="reset"></center>
                    </td>
                </tr>
            </table>
            <br><br><br><br>
        </form>
            <%
                        String b_name,a_name;
                        b_name=request.getParameter("b_name");
                        a_name=request.getParameter("a_name"); 
                        if(b_name!=null)
                        {
                            Book B=null;
                            LibraryDAO ld=new LibraryDAO();
                            B=ld.checkByBookNameAndAuthorName(b_name, a_name);
                            if(B==null)
                            {
                                out.println("<font size=5 color=red>Record Not Found.....</font>");
                            }
                            else
                            {
                               %>
                                   <table border="5" bgcolor="">
                                    <tr>
                                        <th>Book Name</th><th>Author Name</th><th>edition</th><th>Avaibility</th>
                                    </tr>
                                    <tr>
                                       
                                        <td><%=B.getB_name() %></td>
                                        
                                        <td><%=B.getA_name() %></td>
                                       
                                        <td><%=B.getEddition() %></td>
                                        <td><%=B.getAva() %></td>
                                    </tr>
            </table>
        
                <%
                            }
                        }
            %>
            </center>
    </body>
</html>

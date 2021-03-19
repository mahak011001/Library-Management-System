<%@page import="dao.LibraryDAO"%>
<%@page import="java.util.List"%>
<%@page import="dao.StudentDAO"%>
<%@page import="model.Book"%>
<%@include file="fheader.jsp" %>
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
        <center>
        <table border="5" bgcolor="">
            <br><br><br><br><br>
            <tr>
                    <th colspan="7"><center>Records of All Books</center></th>
                </tr>
            <tr>
                <th>Book ID</th><th>Book</th><th>Subject</th><th>Author</th><th>Department</th><th>Edition</th><th>Avaibility</th>
            </tr>
        <%
            LibraryDAO ld=new LibraryDAO();
            List<Book> mylist;
            mylist=ld.ShowAll();
            for(Book B:mylist)
            {
                %>
                <tr>
                      <td><%=B.getB_id() %></td>
                      <td><%=B.getB_name() %></td>
                      <td><%=B.getSub() %></td>
                      <td><%=B.getA_name() %></td>
                      <td><%=B.getDepartment() %></td>
                      <td><%=B.getEddition() %></td>
                      <td><%=B.getAva() %></td>
                </tr>
        <%
            }
        %>
        </table>
        </center>
        </body>
</html>

<%@page import="model.Student"%>
<%@page import="dao.LibraryDAO"%>
<%@page import="java.util.List"%>
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
                    <th colspan="4"><center>Records of All Students</center></th>
            </tr>
            <tr>
                <th>Student Id</th><th>Student Name</th><th>Issued Date</th><th>Book Id</th>

            </tr>
        <%
            LibraryDAO ld=new LibraryDAO();
            List<Student> mylist;
            mylist=ld.ShowAllStud();
            for(Student B:mylist)
            {
                %>
                <tr>
                      <td><%=B.getId() %></td>
                      <td><%=B.getName() %></td>
                      <td><%=B.getDate() %></td>
                      <td><%=B.getB_id() %></td>
                </tr>
        <%
            }
        %>
        </table>
        </center>
        </body>
</html>

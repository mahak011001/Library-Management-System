<%@page import="java.util.List"%>
<%@page import="model.Book"%>
<%@page import="dao.LibraryDAO"%>
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
        <br><br><br><br>
        <center>
        <form action="ShowAllByDepartment.jsp" method="post">
            <table bgcolor="" border="5">
                <tr>
                    <th colspan="2"><center>Search By Department</center></th>
                </tr>
                <tr>
                    <th>Department</th>
                    <td><input type="text" name="dept"></td>
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
                        String dept,sub;
                        dept=request.getParameter("dept");
                        if(dept!=null)
                        {
                            
                            LibraryDAO ld=new LibraryDAO();
                            List<Book> mylist;
                            mylist=ld.ShowByDepartment(dept);
                        %>
                                   <table border="5" bgcolor="">
                                    <tr>
                                        <th>Book Id</th><th>Book</th><th>Subject</th><th>Author</th><th>Department</th><th>edition</th><th>Avaibility</th>
                                    </tr>
                                    <%
                                        for(Book b:mylist)
                                        {
                                    %>
                                    <tr>
                                        <td><%=b.getB_id() %></td>
                                        <td><%=b.getB_name() %></td>
                                        <td><%=b.getSub() %></td>
                                        <td><%=b.getA_name() %></td>
                                        <td><%=b.getDepartment() %></td>
                                        <td><%=b.getEddition() %></td>
                                        <td><%=b.getAva() %></td>
                                    </tr>
            
        
                <%
                            
                        }%>
 </table>  
                <%
                    }
            %>
            
        </center>
 
    </body>
</html>

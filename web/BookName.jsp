<%@page import="java.util.List"%>
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
        <form action="BookName.jsp" method="post">
            <table bgcolor="" border="5">
                <tr>
                    <th colspan="2"><center>Search By Book Name</center></th>
                </tr>
                <tr>
                    <th>Book Name</th>
                    <td><input type="text" name="id"></td>
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
                        String b_name;
                        b_name=request.getParameter("id");
                        if(b_name!=null)
                        {
                            
                            LibraryDAO ld=new LibraryDAO();
                            List<Book> mylist;
                            mylist=ld.checkByBookName(b_name);
                            
                           
                               %>
                                   <table border="5" bgcolor="">
                                    <tr>
                                        <th>Book Name</th><th>Author Name</th><th>edition</th><th>Avaibility</th>
                                    </tr>
                                    <%
                                        for(Book b:mylist)
                                        {
                                    %>
                                    <tr>
                                        
                                        <td><%=b.getB_name() %></td>
                                        
                                        <td><%=b.getA_name() %></td>
                                        
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


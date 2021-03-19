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
        <form action="FBook_id.jsp" method="post">
            <table bgcolor="" border="5">
                <tr>
                    <th colspan="2"><center>Search By Book Id</center></th>
                </tr>
                <tr>
                    <th>Book Id</th>
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
                        String b_id;
                        b_id=request.getParameter("id");
                        if(b_id!=null)
                        {
                            Book B=null;
                            LibraryDAO ld=new LibraryDAO();
                            B=ld.checkById(b_id);
                            if(B==null)
                            {
                                out.println("<font size=5 color=red>Record Not Found.....</font>");
                            }
                            else
                            {
                               %>
                                   <table border="5" bgcolor="">
                                    <tr>
                                        <th>Book Id</th><th>Book Name</th><th>Subject</th><th>Author Name</th><th>Department</th><th>edition</th><th>Avaibility</th>
                                    </tr>
                                    <tr>
                                        <td><%=B.getB_id() %></td>
                                        <td><%=B.getB_name() %></td>
                                        <td><%=B.getSub() %></td>
                                        <td><%=B.getA_name() %></td>
                                        <td><%=B.getDepartment() %></td>
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

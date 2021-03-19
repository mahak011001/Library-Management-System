<%@page import="model.Student"%>
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
        <form action="ShowBySId.jsp" method="post">
            <table bgcolor="" border="5">
                <tr>
                    <th colspan="2"><center>Search By Student Id</center></th>
                </tr>
                <tr>
                    <th>Student Id</th>
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
                           Student B=null;
                            LibraryDAO ld=new LibraryDAO();
                            B=ld.checkBySId(b_id);
                            if(B==null)
                            {
                                out.println("<font size=5 color=red>Record Not Found.....</font>");
                            }
                            else
                            {
                               %>
                                   <table border="5" bgcolor="">
                                    <tr>
                                        <th>Student Id</th><th>Student Name</th><th>Issued Date</th><th>Book Id</th>
                                    </tr>
                                    <tr>
                                        <td><%=B.getId() %></td>
                                        <td><%=B.getName() %></td>
                                        <td><%=B.getDate() %>
                                        <td><%=B.getB_id() %></td>
                                    </tr>
            </table>
        
                <%
                            }
                        }
            %>
            </center>
    </body>
</html>

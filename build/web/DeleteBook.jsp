<%@page import="dao.LibraryDAO"%>
<%@page import="model.Book"%>
<%@include file="fheader.jsp" %>
<%@page session="true" %>
<%! Book s; %>
<html>
    <head>
        <title>www.delete.com</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
        <br><br><br>
        <center>
            <form method="post" action="DeleteBook.jsp" >
               <table border="5" bgcolor="">
                   <tr>
                    <th colspan="2"><center>Delete Book By Id</center></th>
                </tr>
                <tr>
                    <th>Book ID</th>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <center><input type="submit">
                        <input type="reset"></center>
                    </td>
                </tr>
               </table>
            </form><br><br>
            <%
                String id;
                id=request.getParameter("id");
                if(id!=null)
                {
                    session.setAttribute("id", id);
                    
                    Book s;
                    LibraryDAO ld=new LibraryDAO();
                    s=ld.checkById(id);
                    if(s==null)
                        out.println("<font size=5 color=red>Record Not Found</font>");
                    else
                    {
                        %>
                        <form method="post" action="DeleteData.jsp">
                            <table border="5">
                                <tr>
                                    <th>Book Id</th>
                                    <th>Book Name</th>
                                    <th>Subject</th>
                                    <th>Author Name</th>
                                    <th>Department</th>
                                    <th>Edition</th>
                                    <th>Avaibilty</th>
                                </tr>
                                <tr>
                                    <td><%= s.getB_id()%></td>
                                    <td><%= s.getB_name()%></td>
                                    <td><%= s.getSub()%></td>
                                    <td><%= s.getA_name()%></td>
                                    <td><%= s.getDepartment()%></td>
                                    <td><%= s.getEddition()%></td>
                                    <td><%= s.getAva()%></td>
                                </tr>
                                <tr>
                                    
                                        <td colspan="7"><center><input type="submit" value="Delete" ></center></td>
                        
                                </tr>
                            </table>
                         </form>

                        <%
                    }
                }
            %>
        </center>
    </body>
</html>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.Student"%>
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
  width: 40%;
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
            <form method="post" action="Return.jsp" >
               <table border="5" bgcolor="">
                   <tr>
                    <th colspan="2"><center>Returned Book</center></th>
                </tr>
                <tr>
                    <th>Student ID</th>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <center><input type="submit">
                        <input type="reset"></center>
                    </td>
                </tr>
               </table>
            </form>
              <%!
            int penalty=0;
        %>
            <%
                String id;
                id=request.getParameter("id");
                if(id!=null)
                {
                    session.setAttribute("id", id);
                    
                    Student s;
                    LibraryDAO ld=new LibraryDAO();
                    s=ld.checkBySId(id);
                    if(s==null)
                        out.println("<font size=5 color=red>Record Not Found</font>");
                    else
                    {
                         SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
                         Date date = new Date();
                         String date2;
                         date2=formatter.format(date);  
                         String date1;
                         date1=ld.penalty(id);
                         int n=15,charge=5;
                          try {
                             Date dateBefore = formatter.parse(date1);
                             Date dateAfter = formatter.parse(date2);
                             long difference = dateAfter.getTime() - dateBefore.getTime();
                             float daysBetween = (difference / (1000*60*60*24));
                             if(daysBetween>n)
                             {
                             penalty=charge*(int)((daysBetween-n));
                             
                             }
                             else
                             {
                                 penalty=0;
                             }
                          //  out.println("Number of Days between dates: <h1>"+daysBetween);
                                 } catch (Exception e) {
             
                                }
                          
                        %>
                        <form method="post" action="ReturnData.jsp"><br><br>
                            <table border="5">
                                <tr>
                                    <th>Student Id</th><th>Student Name</th><th>Issued Date</th><th>Book Id</th><th>Penalty</th>
                                </tr>
                                <tr>
                                    <td><%=s.getId() %></td>
                                    <td><%=s.getName() %></td>
                                    <td><%=s.getDate() %>
                                    <td><%=s.getB_id() %></td>
                                    <td><%=penalty%>rs</td>
                                </tr>
                                <tr>
                                    
                                        <td colspan="5"><center><input type="submit" value="Delete" ></center></td>
                                    </form>
                                </tr>
                            </table>
                        <%
                    }
                }
            %>
        </center>
    </body>
</html>

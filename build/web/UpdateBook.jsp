<%@page import="model.Book"%>
<%@page import="dao.LibraryDAO"%>
<%@include file="fheader.jsp" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script>
            function check()
            {
                var id=document.myform.b_id.value;
                var bname=document.myform.b_name.value;
                var sub=document.myform.sub.value;
                var aname=document.myform.a_name.value;
                var dept=document.myform.department.value;
                var ed=document.myform.eddition.value;
                var ava=document.myform.ava.value;
                if(id==null || id=="")
                {
                    alert("Id can not be blank");
                    return false;
                }
                if(bname==null || bname=="")
                {
                    alert("Book name can not be blank");
                    return false;
                }
                if(sub==null || sub=="")
                {
                    alert("Subject can not be blank");
                    return false;
                }
                if(aname==null || aname=="")
                {
                    alert("Author name can not be blank");
                    return false;
                }
                if(dept==null || dept=="")
                {
                    alert("Department can not be blank");
                    return false;
                }
                if(ed==null || ed=="")
                {
                    alert("Edition can not be blank");
                    return false;
                }
                if(ava==null || ava=="")
                {
                    alert("Avaibility can not be blank");
                    return false;
                }
            }
        </script>
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><center><br><br>
        <form method="post" action="UpdateBook.jsp">
            <table border="5" bgcolor="">
                <tr>
                    <th colspan="2"><center>Update Book Record</center></th>
                </tr>
                <tr>
                    <th>Book Id</th>
                    <td><input type="text" name="b_id"></td>
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
         String b_id;
                b_id=request.getParameter("b_id");
                if(b_id!=null)
                {
                    Book s;
                    LibraryDAO ld=new LibraryDAO();
                    s=ld.checkById(b_id);
                    if(s==null)
                        out.println("<font size=5 color=red>Record Not Found</font>");
                    else
                    {
        
        
        %>
        <table border="5" bgcolor="">
            <form name=myform action="UpdateData.jsp" method="post" onsubmit="return check()">
                <tr>
                    <th>Book Id</th>
                    <td><input type="text" name="b_id" value="<%=s.getB_id()%>" ></td>
                </tr>
                <tr>
                    <th>Book Name</th>
                    <td><input type="text" name="b_name" value="<%=s.getB_name()%>"></td>
                </tr>
                <tr>
                    <th>Subject</th>
                    <td><input type="text" name="sub" value="<%=s.getSub()%>"></td>
                </tr>
                <tr>
                    <th>Author Name</th>
                    <td><input type="text" name="a_name" value="<%=s.getA_name()%>"></td>
                </tr>
                <tr>
                    <th>Department</th>
                    <td><input type="text" name="department" value="<%=s.getDepartment()%>"></td>
                </tr>
                <tr>
                    <th>Edition</th>
                    <td><input type="text" name="eddition" value="<%=s.getEddition()%>"></td>
                </tr>
                <tr>
                    <th>Avaibilty</th>
                    <td><input type="text" name="ava" value="<%=s.getAva()%>"></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <center><input type="submit" value="update">
                        <input type="reset"></center>
                    </td>
            </form>
        </table>
                <%
                    }
                }
                %>
    </center>
    </body>
</html>

<%@page import="dao.LibraryDAO"%>
<%@include file="fheader.jsp" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script>
            function check()
            {
                var b_id=document.myform.b_id.value;
                 var id=document.myform.id.value;
                var name=document.myform.name.value;
                var sub=document.myform.con.value;
                var aname=document.myform.date.value;
                
                if(b_id==null || b_id=="")
                {
                    alert("Id can not be blank");
                    return false;
                }
                if(id==null || id=="")
                {
                    alert("Id can not be blank");
                    return false;
                }
                
                if(name==null || name=="")
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
         <%!
            int n;
        %>
        <%
          n=LibraryDAO.autoIncr();
        %>
        
        <table border="5" bgcolor="">
            <form name=myform action="InsertData.jsp" method="post" onsubmit="return check()">
                <tr>
                    <th colspan="2"><center>Insert Book Record</center></th>
                </tr>
                <tr>
                    <th>Book Id</th>
                    <td><input type="text" name="b_id" value="<%=n%>"></td>
                </tr>
                <tr>
                    <th>Book Name</th>
                    <td><input type="text" name="b_name"></td>
                </tr>
                <tr>
                    <th>Subject</th>
                    <td><input type="text" name="sub"></td>
                </tr>
                <tr>
                    <th>Author Name</th>
                    <td><input type="text" name="a_name"></td>
                </tr>
                <tr>
                    <th>Department</th>
                    <td><input type="text" name="department"></td>
                </tr>
                <tr>
                    <th>Edition</th>
                    <td><input type="text" name="eddition"></td>
                </tr>
                <tr>
                    <th>Avaibilty</th>
                    <td><input type="text" name="ava"></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <center><input type="submit">
                        <input type="reset"></center>
                    </td>
            </form>
        </table>
    </center>
    </body>
</html>

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
                var sid=document.myform.id.value;
                var bname=document.myform.name.value;
                var sub=document.myform.con.value;
                var aname=document.myform.date.value;
               
                if(id==null || id=="")
                {
                    alert(" Book Id can not be blank");
                    return false;
                }
                if(sid==null || sid=="")
                {
                    alert("Student Id can not be blank");
                    return false;
                }
                if(bname==null || bname=="")
                {
                    alert("Name can not be blank");
                    return false;
                }
                if(sub==null || sub=="")
                {
                    alert("Contact can not be blank");
                    return false;
                }
                if(aname==null || aname=="")
                {
                    alert("Date name can not be blank");
                    return false;
                }
                if(sub.length<10 || sub.length>10)
                {
                     alert("Contact no. should contain 10 digit");
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
        
        <table border="5" bgcolor="">
            <form name=myform action="SaveStud.jsp" method="post" onsubmit="return check()">
                <tr>
                    <th colspan="2"><center>Insert Student Record For Issuing Book</center></th>
                </tr>
                <tr>
                    <th>Student Id</th>
                    <td><input type="text" name="id"></td>
                </tr>
                 <tr>
                    <th>Book Id</th>
                    <td><input type="text" name="b_id"></td>
                </tr>
                
                <tr>
                    <th>Student Name</th>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <th>Contact</th>
                    <td><input type="text" name="con"></td>
                </tr>
                <tr>
                    <th>Date</th>
                    <td><input type="text" name="date"></td>
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

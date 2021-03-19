

<%@page import="dao.LibraryDAO"%>
<%@include file="fheader.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            out.println("<br><br><br><br><br><br><br>");
            String id;
            id=session.getAttribute("id").toString();
            LibraryDAO ld=new LibraryDAO();
            if(ld.deleteBookById(id))
                out.println("<center><font color=green size=10>Record Deleted.....</font></center>");
        %>
    </body>
</html>

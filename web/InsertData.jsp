<%@page import="model.Book"%>
<%@page import="dao.LibraryDAO"%>
<%@include file="fheader.jsp" %>

<br><br><br><center>
    <jsp:useBean class="model.Book" id="b">
        <jsp:setProperty name="b" property="*"></jsp:setProperty>        
    </jsp:useBean>
    <%
       
     LibraryDAO ld=new LibraryDAO();
      if(ld.insertBook(b))
          out.println("<center><font color=green size=5>Record Inserted......</font></center>");
      
    %>
    </center>

<%@page import="model.Book"%>
<%@page import="dao.LibraryDAO"%>
<%@include file="fheader.jsp" %>

<br><br><br><center>
    <jsp:useBean class="model.Book" id="s">
        <jsp:setProperty name="s" property="*"></jsp:setProperty>        
    </jsp:useBean>
    <%
      LibraryDAO ld=new LibraryDAO();
      if(ld.updateBook(s))
          out.println("<center><font color=green size=5>Record Updated......</font></center>");
      else
        out.println("<center><font color=red size=5>Record not updated...</font></center>");
    %>
    </center>

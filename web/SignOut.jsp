<%
    session.invalidate();
    session=null;
    response.sendRedirect("front.jsp");
%>
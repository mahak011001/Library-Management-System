package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import connection.MyConnection;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class fsignup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-image: url(\"images/download20.jpg\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                border: 1px solid black;\n");
      out.write("                padding: 50px 50px 50px 50px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("        function check()\n");
      out.write("              {\n");
      out.write("                var name=document.myform.name.value;\n");
      out.write("                var pass=document.myform.pass.value;\n");
      out.write("                \n");
      out.write("                if(name==null || name==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Name is a mandatory field.\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(pass==null || pass==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Password is a mandatory field.\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(pass.length<6)\n");
      out.write("                {\n");
      out.write("                    alert(\"Password must contain 6 character(minimum)\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <center>\n");
      out.write("           <font color=\"white\"><h1> Faculty Sign Up Page</h1></font>\n");
      out.write("        <form method=\"post\" action=\"fsignup.jsp\" name=\"myform\" onsubmit=\"return check()\">\n");
      out.write("            <table border=\"5\" bgcolor=\"silver\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Username</th>\n");
      out.write("                    <td><input type=\"text\" name=\"name\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Password</th>\n");
      out.write("                    <td><input type=\"password\" name=\"pass\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        <center><input type=\"submit\">\n");
      out.write("                        <input type=\"reset\"></center>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </table>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("            </center>\n");
      out.write("    ");

        String user,pass;
        user=request.getParameter("name");
        pass=request.getParameter("pass");
        if(user!=null || pass!=null)
        {
         Connection con=null;
         PreparedStatement ps=null;
         try
         {
             con=MyConnection.getConnection();
             String sql;
             sql="insert into flogin values(?,?)";
             ps=con.prepareStatement(sql);
             ps.setString(1,user);
             ps.setString(2,pass);
             if(ps.executeUpdate()>0)
             {
                 response.sendRedirect("flogin.jsp");
             }
         }
         catch(Exception e)
         {}
        }
    
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

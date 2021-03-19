package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.LibraryDAO;

public final class InsertBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            int n;
        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/fheader.jsp");
  }

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

      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("  background-image: url(\"images/l9.jpg\");\n");
      out.write("  background-image: center;\n");
      out.write("   background-size: 1370px 650px;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("      \n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar {\n");
      out.write("  overflow: hidden;\n");
      out.write("  height: 50;\n");
      out.write("  width: 85%;\n");
      out.write("  margin: 0px auto;\n");
      out.write("  background-color: green;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar a {\n");
      out.write("  float: left;\n");
      out.write("  font-size: 25px;\n");
      out.write("  color: white;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("  float: left;\n");
      out.write("  overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown .dropbtn {\n");
      out.write("  font-size: 25px;  \n");
      out.write("  border: none;\n");
      out.write("  outline: none;\n");
      out.write("  color: white;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  background-color: inherit;\n");
      out.write("  font-family: inherit;\n");
      out.write("  margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar a:hover, .dropdown:hover .dropbtn {\n");
      out.write("  background-color: red;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("  display: none;\n");
      out.write("  position: absolute;\n");
      out.write("  background-color: #f9f9f9;\n");
      out.write("  min-width: 160px;\n");
      out.write("  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("  z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("  float: none;\n");
      out.write("  color: black;\n");
      out.write("  padding: 12px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: block;\n");
      out.write("  text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"navbar\">\n");
      out.write("    <a href=\"fhome.jsp\">Home&nbsp;&nbsp;</a>\n");
      out.write("<!--  <a href=\"#news\">Search</a>-->\n");
      out.write("  <div class=\"dropdown\">\n");
      out.write("    <button class=\"dropbtn\">Search Book By&nbsp;&nbsp;\n");
      out.write("      <i class=\"fa fa-caret-down\"></i>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"FBookName.jsp\">Book Name</a>\n");
      out.write("      <a href=\"FBandA.jsp\">Book Name and Author Name</a>\n");
      out.write("      <a href=\"FDandS.jsp\">Department & Subject</a>\n");
      out.write("      <a href=\"FBook_id.jsp\">Book Id</a>\n");
      out.write("      <a href=\"ShowAllByDepartment.jsp\">Department Name</a>\n");
      out.write("       <a href=\"ShowAll.jsp\">Show All</a>\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("    <div class=\"dropdown\">\n");
      out.write("    <button class=\"dropbtn\">Book Record&nbsp;&nbsp;\n");
      out.write("      <i class=\"fa fa-caret-down\"></i>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"InsertBook.jsp\">Insert</a>\n");
      out.write("      <a href=\"DeleteBook.jsp\">Delete</a>\n");
      out.write("      <a href=\"UpdateBook.jsp\">Update</a>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"dropdown\">\n");
      out.write("    <button class=\"dropbtn\">Student Record&nbsp;&nbsp;\n");
      out.write("      <i class=\"fa fa-caret-down\"></i>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"InsertStud.jsp\">Issued</a>\n");
      out.write("      <a href=\"BandA.jsp\">Returned</a>\n");
      out.write("      <a href=\"DandS.jsp\">Search</a>\n");
      out.write("      <a href=\"Book_id.jsp\">Show All</a>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("      </div>\n");
      out.write("    <a href=\"FAboutUs.jsp\">About Us&nbsp;&nbsp;</a>\n");
      out.write("    <a href=\"FContactUs.jsp\">Contact Us</a>\n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script>\n");
      out.write("            function check()\n");
      out.write("            {\n");
      out.write("                var b_id=document.myform.b_id.value;\n");
      out.write("                 var id=document.myform.id.value;\n");
      out.write("                var name=document.myform.name.value;\n");
      out.write("                var sub=document.myform.con.value;\n");
      out.write("                var aname=document.myform.date.value;\n");
      out.write("                \n");
      out.write("                if(b_id==null || b_id==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Id can not be blank\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(id==null || id==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Id can not be blank\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                if(name==null || name==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Book name can not be blank\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(sub==null || sub==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Subject can not be blank\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(aname==null || aname==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Author name can not be blank\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(dept==null || dept==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Department can not be blank\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(ed==null || ed==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Edition can not be blank\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(ava==null || ava==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Avaibility can not be blank\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("table {\n");
      out.write("  font-family: arial, sans-serif;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 30%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td, th {\n");
      out.write("  border: 1px solid #dddddd;\n");
      out.write("  text-align: left;\n");
      out.write("  padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {\n");
      out.write("  background-color: #dddddd;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body><center><br><br>\n");
      out.write("         ");
      out.write("\n");
      out.write("        ");

          n=LibraryDAO.autoIncr();
        
      out.write("\n");
      out.write("        \n");
      out.write("        <table border=\"5\" bgcolor=\"\">\n");
      out.write("            <form name=myform action=\"InsertData.jsp\" method=\"post\" onsubmit=\"return check()\">\n");
      out.write("                <tr>\n");
      out.write("                    <th colspan=\"2\"><center>Insert Book Record</center></th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Book Id</th>\n");
      out.write("                    <td><input type=\"text\" name=\"b_id\" value=\"");
      out.print(n);
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Book Name</th>\n");
      out.write("                    <td><input type=\"text\" name=\"b_name\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Subject</th>\n");
      out.write("                    <td><input type=\"text\" name=\"sub\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Author Name</th>\n");
      out.write("                    <td><input type=\"text\" name=\"a_name\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Department</th>\n");
      out.write("                    <td><input type=\"text\" name=\"department\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Edition</th>\n");
      out.write("                    <td><input type=\"text\" name=\"eddition\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Avaibilty</th>\n");
      out.write("                    <td><input type=\"text\" name=\"ava\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        <center><input type=\"submit\">\n");
      out.write("                        <input type=\"reset\"></center>\n");
      out.write("                    </td>\n");
      out.write("            </form>\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Book;
import dao.LibraryDAO;

public final class FBook_005fid_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("  width: 80%;\n");
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
      out.write("    <a href=\"fhome.jsp\">Home&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>\n");
      out.write("<!--  <a href=\"#news\">Search</a>-->\n");
      out.write("  <div class=\"dropdown\">\n");
      out.write("    <button class=\"dropbtn\">Search&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
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
      out.write("    <button class=\"dropbtn\">Book Record&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("      <i class=\"fa fa-caret-down\"></i>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"InsertBook.jsp\">Insert</a>\n");
      out.write("      <a href=\"DeleteBook.jsp\">Delete</a>\n");
      out.write("      <a href=\"UpdateBook.jsp\">Update</a>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"dropdown\">\n");
      out.write("    <button class=\"dropbtn\">Student Record&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
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
      out.write("    <a href=\"FAboutUs.jsp\">About Us&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>\n");
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br><br><br><br>\n");
      out.write("        <center>\n");
      out.write("        <form action=\"Book_id.jsp\" method=\"post\">\n");
      out.write("            <table bgcolor=\"\" border=\"5\">\n");
      out.write("                <tr>\n");
      out.write("                    <th colspan=\"2\"><center>Search By Book Id</center></th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Book Id</th>\n");
      out.write("                    <td><input type=\"text\" name=\"id\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        <center><input type=\"submit\">\n");
      out.write("                        <input type=\"reset\"></center>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <br><br><br><br>\n");
      out.write("        </form>\n");
      out.write("            ");

                        String b_id;
                        b_id=request.getParameter("id");
                        if(b_id!=null)
                        {
                            Book B=null;
                            LibraryDAO ld=new LibraryDAO();
                            B=ld.checkById(b_id);
                            if(B==null)
                            {
                                out.println("<font size=5 color=red>Record Not Found.....</font>");
                            }
                            else
                            {
                               
      out.write("\n");
      out.write("                                   <table border=\"5\" bgcolor=\"pink\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Book Id</th><th>Book Name</th><th>Subject</th><th>Author Name</th><th>Department</th><th>edition</th><th>Avaibility</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>");
      out.print(B.getB_id() );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(B.getB_name() );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(B.getSub() );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(B.getA_name() );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(B.getDepartment() );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(B.getEddition() );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(B.getAva() );
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("            </table>\n");
      out.write("        \n");
      out.write("                ");

                            }
                        }
            
      out.write("\n");
      out.write("            </center>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      <a href=\"BookName.jsp\">Book Name</a>\n");
      out.write("      <a href=\"BandA.jsp\">Book Name and Author Name</a>\n");
      out.write("      <a href=\"DandS.jsp\">Department & Subject</a>\n");
      out.write("      <a href=\"Book_id.jsp\">Book Id</a>\n");
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
      out.write("      <a href=\"BookName.jsp\">Insert</a>\n");
      out.write("      <a href=\"BandA.jsp\">Delete</a>\n");
      out.write("      <a href=\"DandS.jsp\">Update</a>\n");
      out.write("      <a href=\"Book_id.jsp\">Issue</a>\n");
      out.write("      <a href=\"Book_id.jsp\">Return</a>\n");
      out.write("    </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"dropdown\">\n");
      out.write("    <button class=\"dropbtn\">Student Record&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("      <i class=\"fa fa-caret-down\"></i>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"BookName.jsp\">Issued</a>\n");
      out.write("      <a href=\"BandA.jsp\">Returned</a>\n");
      out.write("      <a href=\"DandS.jsp\">Search</a>\n");
      out.write("      <a href=\"Book_id.jsp\">Show All</a>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("      </div>\n");
      out.write("    <a href=\"AboutUs.jsp\">About Us&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>\n");
      out.write("    <a href=\"ContactUs.jsp\">Contact Us</a>\n");
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
      out.write("        <title>home</title>\n");
      out.write("    </head>\n");
      out.write("    <body><br><br><br>\n");
      out.write("        <font size=\"10\"><marquee><h1>Library Management System</h1></marquee></font>\n");
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

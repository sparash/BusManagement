package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Route1Form_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Route1 page</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                overflow: hidden;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("           .main{\n");
      out.write("            display:flex;\n");
      out.write("            background-color:#e6e6e6;\n");
      out.write("            margin-top: auto;\n");
      out.write("            height:1000px;\n");
      out.write("            flex-direction: row;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            }\n");
      out.write("            .sub1{\n");
      out.write("                display:flex;\n");
      out.write("                background-color:#800000;\n");
      out.write("                padding:80px;\n");
      out.write("            }\n");
      out.write("            .sub2{\n");
      out.write("                display: flex;\n");
      out.write("                background-color:#800000;\n");
      out.write("                padding:80px;\n");
      out.write("            }\n");
      out.write("            .tb{\n");
      out.write("                margin-top: 100px;\n");
      out.write("                border:1px solid black;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width:150%;\n");
      out.write("            }\n");
      out.write("            .tb th{\n");
      out.write("                border:1px solid black;\n");
      out.write("                font-family: Courier;\n");
      out.write("                text-align: center;\n");
      out.write("                padding:10px;\n");
      out.write("                background-color: #800000;\n");
      out.write("                color:#e6e600;\n");
      out.write("                padding: 15px;\n");
      out.write("            }\n");
      out.write("            .tb td{\n");
      out.write("                  border:1px solid black;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 15px;\n");
      out.write("            }\n");
      out.write("            tr:nth-child(even) {background-color: #f2f2f2;}\n");
      out.write("            .wrap{\n");
      out.write("                display: flex;\n");
      out.write("                /* justify-content: center; */\n");
      out.write("                align-items: center;\n");
      out.write("                flex-direction: column;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .btn{\n");
      out.write("            display: block;\n");
      out.write("            margin:auto;\n");
      out.write("            background:#800000;\n");
      out.write("            padding:5px 60px;\n");
      out.write("            color:#e6e600;\n");
      out.write("            border-radius:4px;\n");
      out.write("            border: 1px solid black;\n");
      out.write("            text-align: center;\n");
      out.write("            cursor:pointer;\n");
      out.write("            font-family:Courier;\n");
      out.write("            font-size: 35px;\n");
      out.write("            margin-top: 10px;\n");
      out.write("            }\n");
      out.write("            .btn:hover{\n");
      out.write("            transition-duration: 0.5s;\n");
      out.write("            transform: translate(0px,-5px);\n");
      out.write("            box-shadow: 0px 10px 20px black; \n");
      out.write("             }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"sub1\"></div>\n");
      out.write("            <div class=\"wrap\">\n");
      out.write("            <table class=\"tb\">\n");
      out.write("                <tr>\n");
      out.write("                    <th colspan=\"4\">Stops of route HP101:-</th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <th>Sno.</th>\n");
      out.write("                <th>Stops</th>\n");
      out.write("                <th>Arrival Time</th>\n");
      out.write("                <th>Departure Time</th>\n");
      out.write("                </tr>\n");
      out.write("                  \n");
      out.write("                <tr>\n");
      out.write("                    <td>1.</td>\n");
      out.write("                    <td>18-7-8-17 Chowk,PKL</td>\n");
      out.write("                    <td>7:30A.M.</td>\n");
      out.write("                    <td>8:45A.M.</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>2.</td>\n");
      out.write("                    <td>17-8-9-16 Chowk,PKL</td>\n");
      out.write("                    <td>7:35A.M.</td>\n");
      out.write("                    <td>8:45A.M.</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>3.</td>\n");
      out.write("                    <td>11-10-15-14 Chowk,PKL</td>\n");
      out.write("                    <td>7:45A.M.</td>\n");
      out.write("                    <td>8:45A.M.</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>4.</td>\n");
      out.write("                    <td>Rally Chowk,PKL</td>\n");
      out.write("                    <td>7:55A.M.</td>\n");
      out.write("                    <td>8:45A.M.</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>5.</td>\n");
      out.write("                    <td>Pinjore Police Station</td>\n");
      out.write("                    <td>8:20A.M.</td>\n");
      out.write("                    <td>8:45A.M.</td>\n");
      out.write("                </tr>\n");
      out.write("           </table>\n");
      out.write("                <a href=\"Route1FormX.jsp\" style=\"text-decoration:none;\"><button class=\"btn\">Create</button></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"sub2\"></div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

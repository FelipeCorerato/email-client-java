/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2019-06-18 06:28:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>eMali: gerenciador de emails em JSP</title>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("    .mg{\n");
      out.write("\n");
      out.write("    margin-top: 50px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .iwrapper{\n");
      out.write("    position: relative;\n");
      out.write("    width: 100%;\n");
      out.write("    text-align: center;\n");
      out.write("    transition: transform 0.6s;\n");
      out.write("    transform-style: preserve-3d;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    .rotate  {\n");
      out.write("    transform: rotateY(180deg);\n");
      out.write("    }\n");
      out.write("    .rotateb {\n");
      out.write("    transform: rotateY(0deg);\n");
      out.write("    z-index: 3;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .front, .back {\n");
      out.write("    position: absolute;\n");
      out.write("    width: 100%;\n");
      out.write("    backface-visibility: hidden;\n");
      out.write("    }\n");
      out.write("    .front{\n");
      out.write("\n");
      out.write("    z-index: 2;\n");
      out.write("    }\n");
      out.write("    .back{\n");
      out.write("    transform: rotateY(180deg);\n");
      out.write("    z-index: 1;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    html, body, wrapper {\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("        height: 100%;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    #login {\n");
      out.write("    \tbackground-color: #121212;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .background {\n");
      out.write("        position: absolute;\n");
      out.write("        width: 100%;\n");
      out.write("        height: 100%;\n");
      out.write("        top: 0;\n");
      out.write("        left: 0;\n");
      out.write("        z-index: -1;\n");
      out.write("        background-color: #303030;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .input-field {\n");
      out.write("    \tcolor: #673AB7;\t\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    textarea:focus {\n");
      out.write("\t\tborder-bottom: 1px solid orange !important\n");
      out.write("\t\t-webkit-box-shadow: 0 1px 0 0 orange;\n");
      out.write("\t\t-moz-box-shadow: 0 1px 0 0 orange;\n");
      out.write("\t\tbox-shadow: 0 1px 0 0 orange;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<br/>\n");
      out.write("\t\t<br/>\n");
      out.write("\t\t<br/>\n");
      out.write("\t\t<br/>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"iwrapper\" id=\"iwp\">\n");
      out.write("\t\t<div class=\"valign-wrapper row login-box front\">\n");
      out.write("\t\t  <div class=\"col card s10 pull-s1 m6 pull-m3 l4 pull-l4\">\n");
      out.write("\t\t    <form method=\"POST\" action=\"login.jsp\">\n");
      out.write("\t\t      <div class=\"card-content\">\n");
      out.write("\t\t        <span class=\"card-title\">login</span>\n");
      out.write("\t\t        <a class=\"btn-floating halfway-fab waves-effect waves-light red\" id=\"bt\">\n");
      out.write("\t\t        \t<i class=\"material-icons\">add</i>\n");
      out.write("\t\t        </a>\n");
      out.write("\t\t        <div class=\"row\">\n");
      out.write("\t\t          <div class=\"input-field col s12\">\n");
      out.write("\t\t            <label for=\"email\">endereço de email</label>\n");
      out.write("\t\t            <input type=\"email\" class=\"validate\" name=\"email\" id=\"email\" />\n");
      out.write("\t\t          </div>\n");
      out.write("\t\t          <div class=\"input-field col s12\">\n");
      out.write("\t\t            <label for=\"password\">senha</label>\n");
      out.write("\t\t            <input type=\"password\" class=\"validate\" name=\"senha\" id=\"senha\" />\n");
      out.write("\t\t          </div>\n");
      out.write("\t\t        </div>\n");
      out.write("\t\t      </div>\n");
      out.write("\t\t      <div class=\"card-action center-align\">\n");
      out.write("\t\t        <input type=\"reset\" id=\"reset\" class=\"btn-flat pink-text darken-1 waves-effect offset-s2 col s4\">\n");
      out.write("\t\t        <input type=\"submit\" class=\"btn pink darken-1 white-text col s4\" value=\"Entrar\">\n");
      out.write("\t\t        <br>\n");
      out.write("\t\t        <br>\n");
      out.write("\t\t      </div>\n");
      out.write("\t\t    </form>\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"valign-wrapper row login-box back\">\n");
      out.write("\t\t  <div class=\"col card s10 pull-s1 m6 pull-m3 l4 pull-l4\">\n");
      out.write("\t\t    <form method=\"POST\" action=\"cadastro.jsp\">\n");
      out.write("\t\t      <div class=\"card-content\">\n");
      out.write("\t\t        <span class=\"card-title\">cadastro</span>\n");
      out.write("\t\t        <a class=\"btn-floating halfway-fab waves-effect waves-light red\" id=\"bt2\">\n");
      out.write("\t\t        \t<i class=\"material-icons\">close</i>\n");
      out.write("\t\t        </a>\n");
      out.write("\t\t        <div class=\"row\">\n");
      out.write("\t\t          <div class=\"input-field col s12\">\n");
      out.write("\t\t            <label for=\"email\">nome</label>\n");
      out.write("\t\t            <input type=\"text\" class=\"validate\" name=\"nome\" id=\"nome\" />\n");
      out.write("\t\t          </div>\n");
      out.write("\t\t          <div class=\"input-field col s12\">\n");
      out.write("\t\t            <label for=\"email\">endereço de email</label>\n");
      out.write("\t\t            <input type=\"email\" class=\"validate\" name=\"email\" id=\"email\" />\n");
      out.write("\t\t          </div>\n");
      out.write("\t\t          <div class=\"input-field col s6\">\n");
      out.write("\t\t            <label for=\"password\">senha</label>\n");
      out.write("\t\t            <input type=\"password\" class=\"validate\" name=\"senha\" id=\"senha\" />\n");
      out.write("\t\t          </div>\n");
      out.write("\t\t          <div class=\"input-field col s6\">\n");
      out.write("\t\t            <label for=\"password\">confirmar senha</label>\n");
      out.write("\t\t            <input type=\"password\" class=\"validate\" name=\"confirmarSenha\" id=\"confirmarSenha\" />\n");
      out.write("\t\t          </div>\n");
      out.write("\t\t        </div>\n");
      out.write("\t\t      </div>\n");
      out.write("\t\t      <div class=\"card-action center-align\">\n");
      out.write("\t\t        <input type=\"reset\" id=\"reset\" class=\"btn-flat pink-text darken-1 waves-effect offset-s2 col s4\">\n");
      out.write("\t\t        <input type=\"submit\" class=\"btn pink darken-1 white-text col s4\" value=\"Cadastrar\">\n");
      out.write("\t\t        <br>\n");
      out.write("\t\t        <br>\n");
      out.write("\t\t      </div>\n");
      out.write("\t\t    </form>\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t");
 
	
		if(session.getAttribute("usuario") != null)
			response.sendRedirect("principal.jsp");
	
		if(session.getAttribute("erroLogin") != null) {
			
	
      out.write("\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tM.toast({html: '");
      out.print( session.getAttribute("erroLogin") );
      out.write("', classes: \"rounded\"});\n");
      out.write("\t\t</script>\n");
      out.write("\t");
 
			session.removeAttribute("erroLogin");
		}
	
      out.write("\n");
      out.write("\t\n");
      out.write("\t<canvas class=\"background\"></canvas>\n");
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\">\t\t\n");
      out.write("\t\twindow.onload = function() {\n");
      out.write("            Particles.init({\n");
      out.write("                selector: '.background',\n");
      out.write("                color: ['#DA0463', '#404B69', '#DBEDF3'],\n");
      out.write("                connectParticles: true,\n");
      out.write("                maxParticles: 250,\n");
      out.write("                speed: 0.5\n");
      out.write("        \t});\n");
      out.write("\t\t};\n");
      out.write("\t\t\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t        $(\"#bt\").click(function(){\n");
      out.write("\t        if ($('.rotate').length > 0) {\n");
      out.write("\t          $(\"#iwp\").removeClass(\"rotate\");\n");
      out.write("\t        }  \n");
      out.write("\t        if ($('.rotateb').length > 0) {\n");
      out.write("\t          $(\"#iwp\").removeClass(\"rotateb\");\n");
      out.write("\t\n");
      out.write("\t        }  \n");
      out.write("\t        $(\"#iwp\").addClass(\"rotate\");\n");
      out.write("\t\n");
      out.write("\t        });\n");
      out.write("\t        $(\"#bt2\").click(function(){\n");
      out.write("\t\n");
      out.write("\t         if ($('.rotate').length > 0) {\n");
      out.write("\t          $(\"#iwp\").removeClass(\"rotate\");\n");
      out.write("\t         }\n");
      out.write("\t         if ($('.rotateb').length > 0) {\n");
      out.write("\t          $(\"#iwp\").removeClass(\"rotateb\");\n");
      out.write("\t        }  \n");
      out.write("\t         $(\"#iwp\").addClass(\"rotateb\");\n");
      out.write("\t\n");
      out.write("\t        });\n");
      out.write("        });\n");
      out.write("\t</script>\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/particlesjs/2.2.2/particles.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

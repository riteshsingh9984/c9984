/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.30
 * Generated at: 2016-05-07 06:06:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.v_005f1_005f0_005f0.college;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-3.0.5.RELEASE.jar", Long.valueOf(1460277405000L));
    _jspx_dependants.put("jar:file:/media/shiv/68F0AC0BF0ABDD96/WorkStation-Zone/Ubuntu/Curiosity/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/collegemachine/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1460277532000L));
    _jspx_dependants.put("jar:file:/media/shiv/68F0AC0BF0ABDD96/WorkStation-Zone/Ubuntu/Curiosity/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/collegemachine/WEB-INF/lib/spring-webmvc-3.0.5.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1287571886000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005fenctype_005faction;

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
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005fenctype_005faction.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!-- /* ************************************\n");
      out.write(" *\n");
      out.write(" * @update:  RITESH SINGH, 4 May 2016\n");
      out.write(" * @Section: Global\n");
      out.write(" * @auth0r:  RITESH SINGH\n");
      out.write(" * @version: v.1.0.0, 4 May 2016\n");
      out.write("************************************* */\n");
      out.write(" -->\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\t\n");
      out.write("\t<!-- Head of page -->\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>College Machine+</title>\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../../helpers/material-lite-loader.jsp", out, false);
      out.write("</head>\n");
      out.write("\t\n");
      out.write("\t<style>\n");
      out.write("\t<!-- Square card -->\n");
      out.write("\t\t.demo-card-square.mdl-card {\n");
      out.write("\t\t  width: 320px;\n");
      out.write("\t\t  height: 320px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.demo-card-square > .mdl-card__title {\n");
      out.write("\t\t  color: #fff;\n");
      out.write("\t\t  background:\n");
      out.write("\t\t    url('resources/m-lite-image/lion1.jpg') bottom right 0% no-repeat #46B6AC;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("\t \n");
      out.write("\t<!-- body of page -->\n");
      out.write("\t<body style=\"background-color:#7B7D7D;\" >\n");
      out.write("\t\t<div class=\"demo-layout-waterfall mdl-layout mdl-js-layout\">\n");
      out.write("<!-- =============================My Page Header & Left-drawer======================================================= -->\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../../helpers/header.jsp", out, false);
      out.write("<!-- =============================My Page Header & Left-drawer Done====================================================== -->\n");
      out.write("\t\t\n");
      out.write("\t\t\t<main class=\"mdl-layout__content\">\n");
      out.write(" <!-- =============================My Page Body============================================================ -->\t\t\t\n");
      out.write("\t\t    \t<div class=\"page-content\">\n");
      out.write("\t\t    \t\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("<!-- =============================My Page Body Done============================================================ -->\t\t\t    \t\n");
      out.write("\t\t  \t</main>\n");
      out.write("\t\t</div>\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
      out.write("<script>\n");
      out.write("\tfunction getImage(){\n");
      out.write("\t\tvar d = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ data.imageData}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("\t\tvar imageData = base64_encode(file_get_contents(d));\n");
      out.write("\t\tvar src = 'data: '+mime_content_type($image)+';base64,'+imageData;\n");
      out.write("\t\talert(src);\n");
      out.write("\t}\n");
      out.write("</script>");
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

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005fenctype_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/pages/v_1_0_0/college/create.jsp(49,8) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setModelAttribute("collegeCreate");
    // /WEB-INF/pages/v_1_0_0/college/create.jsp(49,8) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction("collegeSave");
    // /WEB-INF/pages/v_1_0_0/college/create.jsp(49,8) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("post");
    // /WEB-INF/pages/v_1_0_0/college/create.jsp(49,8) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setEnctype("multipart/form-data");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<div class=\"container\" style=\"margin-top:2%; width:100%;\" >hello/\n");
          out.write("\t\t    \t\t\t\t<div class=\"row\">\n");
          out.write("\t\t    \t\t\t\t\t<div class=\"col-sm-12\">\n");
          out.write("\t<!-- =============================My Page Card============================================================ -->\t\t\t\t\t\t      \n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"demo-card-square mdl-card mdl-shadow--8dp\" style=\"width:100%; height:100%;background-color:#EAECEE;\" >\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<!-- <div class=\"mdl-card__title mdl-card--expand\" style=\"height:100px;\">\n");
          out.write("\t\t\t\t\t\t\t\t\t    \t<h2 class=\"mdl-card__title-text\">PROJECT-CREATE</h2>\n");
          out.write("\t\t\t\t\t\t\t\t\t  \t</div> -->\n");
          out.write("\t\t\t\t\t\t\t\t\t  \t\n");
          out.write("\t<!-- =============================My Page Card Body============================================================ -->\t\t\t\t\t\t\t\t  \t\n");
          out.write("\t\t\t\t\t\t\t\t\t  \t<div class=\"mdl-card__supporting-text\">\n");
          out.write("\t\t\t\t\t\t\t\t\t    \t\n");
          out.write("\t\t\t\t\t\t\t\t\t    \t<div class=\"row\">\n");
          out.write("\t\t\t\t\t\t\t\t\t    \t\t<div class=\"col-sm-12\">\n");
          out.write("\t\t\t\t\t\t\t<!-- Collapse Data -->\t\t    \t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t    \t\t\t\n");
          out.write("\t\t\t\t\t\t    \t\t\t\t\t<div class=\"panel-group\" id=\"accordion\" style=\"margin-left:10%;\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t    <div class=\"panel panel-default panel-border\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t      <div class=\"panel-heading panel_AWB_bg \" >\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t       <h4 class=\"panel-title\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t      <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse1\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          Basic Information<span style=\"color:red\">*</span>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t      </a> \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t      </h4> \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t      </div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t      <div id=\"collapse1\" class=\"panel-collapse collapse in \">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t        <div class=\"panel-body  list-group-item \" style=\"background-color:#F8F9F9;\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t        \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t        \t<div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t        \t\t<div class=\"row\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t<!-- Left Content -->\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t<div class=\"col-sm-6\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t<div class=\"row\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t<div class=\"col-sm-6\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <input name=\"id\" class=\"mdl-textfield__input\" type=\"text\" pattern=\"-?[0-9]*(\\.[0-9]+)?\" id=\"id\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <label class=\"mdl-textfield__label\" for=\"id\"><smal >ID</smal></label>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <span class=\"mdl-textfield__error\">Input is not a number!</span>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  </div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t<div class=\"col-sm-6\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <input name=\"code\" class=\"mdl-textfield__input\" type=\"text\" id=\"taskName\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <label class=\"mdl-textfield__label\" for=\"projectName\"><smal >College Code</smal></label>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  </div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t<br/>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t<!-- Right Content -->\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t<div class=\"col-sm-6 \">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t<div class=\"row\" style=\"margin-left:4%\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t<div class=\"col-sm-6\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <input name=\"name\" class=\"mdl-textfield__input\" type=\"text\" id=\"projectLeaderId\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <label class=\"mdl-textfield__label\" for=\"projectLeaderId\"><smal >College Name</smal></label>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  </div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t<div class=\"col-sm-6 \">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <input name=\"type\" class=\"mdl-textfield__input\" type=\"text\" id=\"projectVoiceLeaderId\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <label class=\"mdl-textfield__label\" for=\"projectVoiceLeaderId\"><smal >Type</smal></label>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  </div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t<br/>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t<br/>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t<div class=\"row\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t<!-- Left Content -->\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t<div class=\"col-sm-6\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t<div class=\"row\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t<div class=\"col-sm-6\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <input name=\"approvedTo\" class=\"mdl-textfield__input\" type=\"text\" id=\"id\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <label class=\"mdl-textfield__label\" for=\"id\"><smal >Approved To</smal></label>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  </div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t<div class=\"col-sm-6\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <input name=\"registrationDate\" class=\"mdl-textfield__input\" type=\"text\" id=\"taskName\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <label class=\"mdl-textfield__label\" for=\"projectName\"><smal >Registration Date</smal></label>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  </div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t<br/>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t<!-- Right Content -->\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t<div class=\"col-sm-6 \">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t<div class=\"row\" style=\"margin-left:4%\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t<div class=\"col-sm-6\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <input name=\"registrationNo\" class=\"mdl-textfield__input\" type=\"text\" id=\"projectLeaderId\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <label class=\"mdl-textfield__label\" for=\"projectLeaderId\"><smal >Registration No</smal></label>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  </div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t<div class=\"col-sm-6 \">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <input name=\"founderName\" class=\"mdl-textfield__input\" type=\"text\" id=\"projectVoiceLeaderId\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <label class=\"mdl-textfield__label\" for=\"projectVoiceLeaderId\"><smal >College Founder Name</smal></label>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  </div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t<br/>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t<br/>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t        \t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t        \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t        </div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t      </div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t     </div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t     \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t     \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t     <div class=\"panel panel-default panel-border\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t      <div class=\"panel-heading panel_AWB_bg \">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t       <h4 class=\"panel-title\">\t<a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse2\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t      \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t         Status<span style=\"color:red\">*</span>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t        \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t      </a>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t      </h4>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t      </div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t      <div id=\"collapse2\" class=\"panel-collapse collapse\" >\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t        <div class=\"panel-body list-group-item \" style=\"background-color:#F8F9F9;\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t        \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t        \t<div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t        \t\t<div class=\"row\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t<!-- Left Content -->\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t<div class=\"col-sm-6\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t<input type=\"file\" name=\"fileData\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t<br/>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t<!-- Right Content -->\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t<div class=\"col-sm-6\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t<br/>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t        \t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t        \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t        </div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t      </div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t      </div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t     \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t </div><br/>\n");
          out.write("\t\t\t\t\t\t\t\t\t    \t\t<div class=\"\" style=\"margin-left:10%;\">\n");
          out.write("\t\t\t\t\t\t\t\t\t    \t\t\t<input type=\"submit\" value=\"Create\"\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\" btn btn-success btn-sm \" />\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"reset\" value=\"Reset\"\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\" btn btn-danger btn-sm \" />\n");
          out.write("\t\t\t\t\t\t\t\t\t    \t\t</div>\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t   <!-- Done Collapse --> \t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t    \t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t    \t</div>\t\n");
          out.write("\t\t\t\t\t\t\t\t\t  \t</div>\n");
          out.write("\t<!-- =============================My Page Card Body Done============================================================ -->\n");
          out.write("\t\t\t\t\t\t\t\t\t  \t\n");
          out.write("\t<!-- =============================My Page Card Footer============================================================ -->\t\t\t\t\t\t\t\t  \t\n");
          out.write("\t\t\t\t\t\t\t\t\t  \t\n");
          out.write("\t\t\t\t\t\t\t\t\t  \t<div class=\"mdl-card__actions mdl-card--border\">\n");
          out.write("\t\t\t\t\t\t\t\t\t    \t<a class=\"mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect\">\n");
          out.write("\t\t\t\t\t\t\t\t\t      \t\tView Updates\n");
          out.write("\t\t\t\t\t\t\t\t\t    \t</a>\n");
          out.write("\t\t\t\t\t\t\t\t\t  \t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\n");
          out.write("\t<!-- =============================My Page Card Footer Done============================================================ -->\t\t\t\t\t\t\t\t  \t\n");
          out.write("\t\t\t\t\t\t\t\t\t  \t\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\n");
          out.write("\t<!-- =============================My Page Card Done============================================================ -->\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t    </div>\n");
          out.write("\t\t    \t\t\t\t</div>\n");
          out.write("\t\t    \t\t\t</div>\n");
          out.write("\t\t    \t\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005fenctype_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }
}

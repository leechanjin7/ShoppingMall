/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-09-13 02:48:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class replyUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.js\"\r\n");
      out.write("	integrity=\"sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("/* 창 여분 없애기 */\r\n");
      out.write("body {\r\n");
      out.write("	margin: 0;\r\n");
      out.write("}\r\n");
      out.write("/* 전체 배경화면 색상 */\r\n");
      out.write(".wrapper_div {\r\n");
      out.write("	background-color: #f5f5f5;\r\n");
      out.write("	height: 100%;\r\n");
      out.write("}\r\n");
      out.write("/* 팝업창 제목 */\r\n");
      out.write(".subject_div {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	background-color: #7b8ed1;\r\n");
      out.write("	color: white;\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 컨텐츠, 버튼 영역 padding */\r\n");
      out.write(".input_wrap {\r\n");
      out.write("	padding: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn_wrap {\r\n");
      out.write("	padding: 5px 30px 30px 30px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 버튼 영역 */\r\n");
      out.write(".cancel_btn {\r\n");
      out.write("	margin-right: 5px;\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("	width: 130px;\r\n");
      out.write("	background-color: #5e6b9f;\r\n");
      out.write("	padding-top: 10px;\r\n");
      out.write("	height: 27px;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	font-size: 14px;\r\n");
      out.write("	line-height: 18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".enroll_btn {\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("	width: 130px;\r\n");
      out.write("	background-color: #7b8ed1;\r\n");
      out.write("	padding-top: 10px;\r\n");
      out.write("	height: 27px;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	font-size: 14px;\r\n");
      out.write("	line-height: 18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 책제목 영역 */\r\n");
      out.write(".bookName_div h2 {\r\n");
      out.write("	margin: 0;\r\n");
      out.write("}\r\n");
      out.write("/* 평점 영역 */\r\n");
      out.write(".rating_div {\r\n");
      out.write("	padding-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".rating_div h4 {\r\n");
      out.write("	margin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("select {\r\n");
      out.write("	margin: 15px;\r\n");
      out.write("	width: 100px;\r\n");
      out.write("	height: 40px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("	font-weight: 600;\r\n");
      out.write("}\r\n");
      out.write("/* 리뷰 작성 영역 */\r\n");
      out.write(".content_div {\r\n");
      out.write("	padding-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".content_div h4 {\r\n");
      out.write("	margin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("textarea {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 100px;\r\n");
      out.write("	border: 1px solid #dadada;\r\n");
      out.write("	padding: 12px 8px 12px 8px;\r\n");
      out.write("	font-size: 15px;\r\n");
      out.write("	color: #a9a9a9;\r\n");
      out.write("	resize: none;\r\n");
      out.write("	margin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write(".update_btn{\r\n");
      out.write("   	    display: inline-block;\r\n");
      out.write("	    width: 130px;\r\n");
      out.write("	    background-color: #7b8ed1;\r\n");
      out.write("	    padding-top: 10px;\r\n");
      out.write("	    height: 27px;\r\n");
      out.write("	    color: #fff;\r\n");
      out.write("	    font-size: 14px;\r\n");
      out.write("	    line-height: 18px;   	\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"wrapper_div\">\r\n");
      out.write("		<div class=\"subject_div\">\r\n");
      out.write("			리뷰 수정\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<div class=\"input_wrap\">\r\n");
      out.write("			<div class=\"bookName_div\">\r\n");
      out.write("				<h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bookInfo.bookName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h2>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"rating_div\">\r\n");
      out.write("				<h4>평점</h4>\r\n");
      out.write("				<select name=\"rating\">\r\n");
      out.write("					<option value=\"0.5\">0.5</option>\r\n");
      out.write("					<option value=\"1.0\">1.0</option>\r\n");
      out.write("					<option value=\"1.5\">1.5</option>\r\n");
      out.write("					<option value=\"2.0\">2.0</option>\r\n");
      out.write("					<option value=\"2.5\">2.5</option>\r\n");
      out.write("					<option value=\"3.0\">3.0</option>\r\n");
      out.write("					<option value=\"3.5\">3.5</option>\r\n");
      out.write("					<option value=\"4.0\">4.0</option>\r\n");
      out.write("				</select>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"content_div\">\r\n");
      out.write("				<h4>리뷰</h4>\r\n");
      out.write("				<textarea name=\"content\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${replyInfo.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"btn_wrap\">\r\n");
      out.write("			<a class=\"cancel_btn\">취소</a><a class=\"update_btn\">수정</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("\r\n");
      out.write("	$(document).ready(function(){\r\n");
      out.write("		\r\n");
      out.write("		let rating = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${replyInfo.rating}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("		\r\n");
      out.write("		$(\"option\").each(function(i,obj){\r\n");
      out.write("			\r\n");
      out.write("			if(rating === $(obj).val()){\r\n");
      out.write("				$(obj).attr(\"selected\", \"selected\");\r\n");
      out.write("			}\r\n");
      out.write("\r\n");
      out.write("		});\r\n");
      out.write("\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	/* 취소 버튼 */\r\n");
      out.write("	$(\".cancel_btn\").on(\"click\", function(e){\r\n");
      out.write("		window.close();\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	/* 수정 버튼 */\r\n");
      out.write("	$(\".update_btn\").on(\"click\", function(e){\r\n");
      out.write("		\r\n");
      out.write("		const replyId = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${replyInfo.replyId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("		const bookId = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${replyInfo.bookId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("		const memberId = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${memberId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("		const rating = $(\"select\").val();\r\n");
      out.write("		const content = $(\"textarea\").val();	\r\n");
      out.write("		\r\n");
      out.write("		const data = {\r\n");
      out.write("				replyId : replyId,\r\n");
      out.write("				bookId : bookId,\r\n");
      out.write("				memberId : memberId,\r\n");
      out.write("				rating : rating,\r\n");
      out.write("				content : content\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			data : data,\r\n");
      out.write("			type : 'POST',\r\n");
      out.write("			url : '/reply/update',\r\n");
      out.write("			success : function(result){\r\n");
      out.write("				$(opener.location).attr(\"href\", \"javascript:replyListInit();\");\r\n");
      out.write("				window.close();\r\n");
      out.write("\r\n");
      out.write("			}			\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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

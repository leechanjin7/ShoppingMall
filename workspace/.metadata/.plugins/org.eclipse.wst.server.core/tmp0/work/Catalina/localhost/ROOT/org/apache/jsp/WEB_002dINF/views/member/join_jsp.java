/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-09-05 10:49:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/member/join.css\">\r\n");
      out.write("<script\r\n");
      out.write("  src=\"https://code.jquery.com/jquery-3.4.1.js\"\r\n");
      out.write("  integrity=\"sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=\"\r\n");
      out.write("  crossorigin=\"anonymous\">\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("	<form id=\"join_form\" method=\"post\">\r\n");
      out.write("	<div class=\"wrap\">\r\n");
      out.write("			<div class=\"subjecet\">\r\n");
      out.write("				<span>회원가입</span>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"id_wrap\">\r\n");
      out.write("				<div class=\"id_name\">아이디</div>\r\n");
      out.write("				<div class=\"id_input_box\">\r\n");
      out.write("					<input class=\"id_input\" name=\"memberId\">\r\n");
      out.write("				</div>\r\n");
      out.write("				<span class = \"id_input_re_1\">사용 가능한 아이디입니다.</span>\r\n");
      out.write("				<span class = \"id_input_re_2\">아이디가 이미 존재합니다.</span>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"pw_wrap\">\r\n");
      out.write("				<div class=\"pw_name\">비밀번호</div>\r\n");
      out.write("				<div class=\"pw_input_box\">\r\n");
      out.write("					<input class=\"pw_input\" name=\"memberPw\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"pwck_wrap\">\r\n");
      out.write("				<div class=\"pwck_name\">비밀번호 확인</div>\r\n");
      out.write("				<div class=\"pwck_input_box\">\r\n");
      out.write("					<input class=\"pwck_input\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"user_wrap\">\r\n");
      out.write("				<div class=\"user_name\">이름</div>\r\n");
      out.write("				<div class=\"user_input_box\">\r\n");
      out.write("					<input class=\"user_input\" name=\"memberName\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"mail_wrap\">\r\n");
      out.write("				<div class=\"mail_name\">이메일</div> \r\n");
      out.write("				<div class=\"mail_input_box\">\r\n");
      out.write("					<input class=\"mail_input\" name=\"memberMail\">\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"mail_check_wrap\">\r\n");
      out.write("					<div class=\"mail_check_input_box\">\r\n");
      out.write("						<input class=\"mail_check_input\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"mail_check_button\">\r\n");
      out.write("						<span>인증번호 전송</span>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"clearfix\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"address_wrap\">\r\n");
      out.write("				<div class=\"address_name\">주소</div>\r\n");
      out.write("				<div class=\"address_input_1_wrap\">\r\n");
      out.write("					<div class=\"address_input_1_box\">\r\n");
      out.write("						<input class=\"address_input_1\" name=\"memberAddr1\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"address_button\">\r\n");
      out.write("						<span>주소 찾기</span>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"clearfix\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class =\"address_input_2_wrap\">\r\n");
      out.write("					<div class=\"address_input_2_box\">\r\n");
      out.write("						<input class=\"address_input_2\" name=\"memberAddr2\">\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class =\"address_input_3_wrap\">\r\n");
      out.write("					<div class=\"address_input_3_box\">\r\n");
      out.write("						<input class=\"address_input_3\" name=\"memberAddr3\">\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"join_button_wrap\">\r\n");
      out.write("				<input type=\"button\" class=\"join_button\" value=\"가입하기\">\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("	//회원가입 버튼(회원가입 기능 작동)\r\n");
      out.write("	$(\".join_button\").click(function(){\r\n");
      out.write("		$(\"#join_form\").attr(\"action\", \"/member/join\");\r\n");
      out.write("		$(\"#join_form\").submit();\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("//아이디 중복검사\r\n");
      out.write("$('.id_input').on(\"propertychange change keyup paste input\", function(){\r\n");
      out.write("	\r\n");
      out.write("/* 	console.log(\"keyup 테스트\"); */\r\n");
      out.write("	var memberId = $('.id_input').val();\r\n");
      out.write("	var data = {memberId : memberId}\r\n");
      out.write("	\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		type : \"post\",\r\n");
      out.write("		url : \"/member/memberIdChk\",\r\n");
      out.write("		data : data,\r\n");
      out.write("		success : function(result){\r\n");
      out.write("			//console.log(\"성공여부\" + result);\r\n");
      out.write("			if(result != 'fail'){\r\n");
      out.write("				$('.id_input_re_1').css(\"display\",\"inline-block\");\r\n");
      out.write("				$('.id_input_re_2').css(\"display\",\"none\");\r\n");
      out.write("			}else{\r\n");
      out.write("				$('.id_input_re_2').css(\"display\",\"inline-block\");\r\n");
      out.write("				$('.id_input_re_1').css(\"display\",\"none\");\r\n");
      out.write("			}\r\n");
      out.write("		}	// success 종료\r\n");
      out.write("		\r\n");
      out.write("	}); //ajax 종료\r\n");
      out.write("	\r\n");
      out.write("}); // function 종료\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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

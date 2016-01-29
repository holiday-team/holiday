<%@page import="com.hteam.holiday.activity.service.HelloWorld"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext" %>
<%@page contentType="text/html; charset=gbk"%>
<%
WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(session.getServletContext());
HelloWorld hw = context.getBean(HelloWorld.class);
%>
<html>
<body>
<h2><%=hw.sayHello("liangrui") %></h2>
</body>
</html>

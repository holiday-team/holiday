<%@page import="com.hteam.holiday.activity.service.HelloWorld"%>
<%@page
	import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@page contentType="text/html; charset=gbk"%>
<%
	WebApplicationContext context = WebApplicationContextUtils
			.getWebApplicationContext(session.getServletContext());
	HelloWorld hw = context.getBean(HelloWorld.class);
%>
<html>
<head>
<title></title>

<link
	href="http://localhost:8088/bootstrap-3.3.5-dist/css/bootstrap.min.css"
	type="text/css" rel="stylesheet"></link>
<link
	href="http://localhost:8088/bootstrap-3.3.5-dist/css/bootstrap-theme.min.css"
	type="text/css" rel="stylesheet"></link>
</head>
<body>
	<h2><%=hw.sayHello("liangrui")%></h2>


	<div id="carousel-example-generic" class="carousel slide"
		data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#carousel-example-generic" data-slide-to="0"
				class="active"></li>
			<li data-target="#carousel-example-generic" data-slide-to="1"></li>
			<li data-target="#carousel-example-generic" data-slide-to="2"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="http://localhost:8088/img/DSC01533.JPG" alt="..." style="height:454px;width:816px;">
				<div class="carousel-caption"></div>
			</div>
			<div class="item">
				<img src="http://localhost:8088/img/DSC01533.JPG" alt="..." style="height:454px;width:816px;">
				<div class="carousel-caption"></div>
			</div>
			<div class="item">
				<img alt="" src="http://localhost:8088/img/DSC01533.JPG" style="height:454px;width:816px;">
				<div class="carousel-caption"></div>
			</div>
		</div>

		<!-- Controls -->
		<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev"> <span
			class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#carousel-example-generic"
			role="button" data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>
	
	<button class="btn btn-default btn-sm">ȷ��</button>
	<script type="text/javascript"
		src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	<script type="text/javascript"
		src="http://localhost:8088/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
		
		<script type="text/javascript">
		$(".carousel").carousel();
		</script>
</body>
</html>

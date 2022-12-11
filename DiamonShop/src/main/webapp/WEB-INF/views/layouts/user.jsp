<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title> <decorator:title default="Trang chu" /> </title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<!-- Bootstrap styles -->
<link href="<c:url value="/assets/user/css/bootstrap.css"></c:url>"
	rel="stylesheet" />
<!-- Customize styles -->
<link href="<c:url value ="/assets/user/style.css" ></c:url>"
	rel="stylesheet" />
<!-- font awesome styles -->
<link
	href="<c:url value ="/assets/user/font-awesome/css/font-awesome.css" ></c:url>"
	rel="stylesheet">


<!-- Favicons -->
<link rel="shortcut icon"
	href="<c:url value ="/assets/user/ico/favicon.ico" ></c:url>">
	<decorator:head />
</head>
<body>
	<!-- 
	Upper Header Section 
-->
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="topNav">
			<div class="container">
				<div class="alignR">
					<div class="pull-left socialNw">
						<a href="#"><span class="icon-twitter"></span></a> <a href="#"><span
							class="icon-facebook"></span></a> <a href="#"><span
							class="icon-youtube"></span></a> <a href="#"><span
							class="icon-tumblr"></span></a>
					</div>
					<a class="active" href="index.html"> <span class="icon-home"></span>
						Home
						
					</a> 
					<c:if test="${not empty LoginInfo }">
					<a href=""><span class="icon-user"></span>${LoginInfo.display_name }</a> <a
						href="<c:url value="/dang-xuat"/>"><span class="icon-edit"></span>Dang xuat </a>
					</c:if>
					<c:if test="${empty LoginInfo }">
						<a href=""><span class="icon-user"></span> My Account</a> <a
						href="<c:url value="/dang-ky"/>"><span class="icon-edit"></span>Dang Ky </a>
					</c:if>
					 
						<a href="contact.html"><span class="icon-envelope"></span>
						Contact us</a> <a href="<c:url value ="/gio-hang/"></c:url>"><span
						class="icon-shopping-cart"></span> ${TotalQuantyCart} san pham - <span
						class="badge badge-warning"> ${TotalPriceCart} Đ</span></a>
				</div>
			</div>
		</div>
	</div>

	<!--
Lower Header Section 
-->
	<div class="container">
		<div id="gototop"></div>
		<%@include file ="/WEB-INF/views/layouts/user/header.jsp" %>

<decorator:body />


		<!--
Footer
-->
		<%@include file="/WEB-INF/views/layouts/user/footer.jsp"%>
	</div>
	<!-- /container -->

	
	<a href="#" class="gotop"><i class="icon-double-angle-up"></i></a>
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="<c:url value="/assets/user/js/jquery.js"></c:url>"></script>
	<script src="<c:url value="/assets/user/js/bootstrap.min.js"></c:url>"></script>
	<script
		src="<c:url value="/assets/user/js/jquery.easing-1.3.min.js"></c:url>"></script>
	<script
		src="<c:url value="/assets/user/js/jquery.scrollTo-1.4.3.1-min.js"></c:url>"></script>
	<script src="<c:url value="/assets/user/js/shop.js"></c:url>"></script>

<decorator:getProperty property="page.script"></decorator:getProperty>
</body>
</html>

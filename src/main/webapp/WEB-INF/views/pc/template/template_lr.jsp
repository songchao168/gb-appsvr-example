<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/pc/pages/common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta content="IE=edge" http-equiv="X-UA-Compatible">
<meta content="width=device-width, initial-scale=1" name="viewport">
<meta content="" name="description">
<meta content="" name="author">
<link rel="stylesheet" href="<c:url value="/resources/pc/common/css/bootstrap.min.css"/>">
<tiles:insertAttribute name="pri_link"></tiles:insertAttribute>
<script src="<c:url value="/resources/pc/common/js/jquery.min.js"/>"></script>
<script src="<c:url value="/resources/pc/common/js/bootstrap.min.js"/>"></script>
<%-- <tiles:insertAttribute name="pri_script"></tiles:insertAttribute> --%>
<title><tiles:getAsString name="title" /></title>
</head>
<body>
	<!-- head -->
	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	</div>
	<!-- body -->
	<div class="container-fluid">
		<div class="row">
			<!-- left -->
			<div class="col-sm-3 col-md-2 sidebar">
				<input type="hidden" id="active_bar_tag" value="<tiles:insertAttribute name="active_bar" />">
			<ul class="nav nav-sidebar">
					<li class="active bar_book_borrow"><a href="#">借阅</a></li>
					<li class="bar_book_manage"><a href="#">管理</a></li>
					<li class="bar_book_add"><a href="<c:url value="/book/add"/>">添加</a></li>
				</ul>
			</div>
			<!-- right -->
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<tiles:insertAttribute name="content" />
			</div>
		</div>
	</div>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/pc/pages/common/taglibs.jsp"%>
<h2 class="sub-header">Book Add</h2>
  <c:url value="/book/${ book.id}/edit" var="url_book_edit"/>
  <form:form  commandName="book" cssClass="form-horizontal" role="form" method="POST" action="${url_book_edit }">
	<form:hidden path="id"/>
	<div class="form-group">
		<form:label  path="name" cssClass="col-sm-2 control-label">书名:</form:label>
		<div class="col-sm-4">
			<form:input path="name" size="20" cssClass="form-control" />
		</div>
		<form:errors path="name" cssClass="error" element="div" />
	</div>
	
	<div class="form-group">
		<form:label  path="price" cssClass="col-sm-2 control-label">价格:</form:label>
		<div class="col-sm-4">
			<form:input path="price" size="20" cssClass="form-control" />
		</div>
		<form:errors path="price" cssClass="error" element="div" />
	</div>
	
	<div class="form-group">
		<form:label  path="isbn" cssClass="col-sm-2 control-label">ISBN:</form:label>
		<div class="col-sm-4">
			<form:input path="isbn" size="20" cssClass="form-control" />
		</div>
		<form:errors path="isbn" cssClass="error" element="div" />
	</div>

	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<button type="submit" class="btn btn-default">提交</button>
			<button type="reset" class="btn btn-default">重置</button>
		</div>
	</div>
</form:form>

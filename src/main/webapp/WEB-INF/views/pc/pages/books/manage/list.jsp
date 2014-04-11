<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="/WEB-INF/views/pc/pages/common/taglibs.jsp"%>   
<h2 class="sub-header">Book List</h2>
<div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>书名</th>
                  <th>价格</th>
                  <th>添加时间</th>
                  <th>借/还</th>
                  <th>操作</th>
                </tr>
              </thead>
              <tbody>
              <c:forEach items="${books}" var="book">
                <tr>
                  <td>${book.name }</td>
                  <td>${book.price}</td>
                  <td>${book.createTime}</td>
                  <td><c:if test="${book.state=='0'}">未借出</c:if><c:if test="${book.state!='0'}">已借出</c:if></td>
                  <td><a href="<c:url value="/book/${book.id}/edit"/>">编辑</a><span style="width:20px;"></span> <a href="<c:url value="/book/${book.id}/delete"/>">删除</a></td>
                </tr>
               </c:forEach> 
              </tbody>
            </table>
          </div>
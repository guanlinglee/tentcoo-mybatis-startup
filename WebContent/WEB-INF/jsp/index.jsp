<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Tentcoo Start Up</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/res/css/index.css">
    	<script type="text/javascript" src="${pageContext.request.contextPath}/res/js/jquery.min.js"></script>
</head>
<body>
	<h3>使用JSP呈现内容</h3>
	<table class="table">
			<tr><th>学号</th><th>姓名</th></tr>
			<c:forEach items="${requestScope.data }" var="item">
				<tr><td>${item.studentNumber }</td><td>${item.studentName }</td></tr>
			</c:forEach>
	</table>
	
	<hr>
	<h3>使用Ajax异步添加同学</h3>
	<div>姓名：<input type="text" id="studentName"></div>
	<div>学号：<input type="text" id="studentNumber"></div>
	<div>班级：<input type="text" id="className"></div>
	<button id="add" type="button">添加</button>
	<script type="text/javascript">
		$("#add").click(function(){
			$.ajax({
				url:'add_student',
				cache:false,
				data:{
					'studentName':$("#studentName").val(),
					'studentNumber':$("#studentNumber").val(),
					'className':$("#className").val()
				},
				success: function(data){
					window.location.href = './'
				}
			})
		})
	</script>
</body>
</html>
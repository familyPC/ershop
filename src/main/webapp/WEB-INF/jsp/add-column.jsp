<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String path = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html lang="en">
<head>
<script type="text/javascript" src="../jQuery/jquery.js"></script>
<link rel="stylesheet" type="text/css" href="../css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	$('#columnsub ').click(function(){
		//alert("jin");
		//alert($('.section').val());
		$('.foot').load("/column/add",{
			"content":$('.section').val()
		});
	});
</script>
<title>添加板块</title>
</head>
<body>
	<div class="list">
		<div class="list-nav">
			<span>添 加 板 块</span>
		</div>
		<div class="add-column-body">
			<form action="/column/list">
				<input  type="text" name="section" placeholder="添加板块" class="section">
				<!-- <input id="tianjia" type="submit" name="" value="提交"> -->
				<span id="columnsub">提交</span>
			</form>
		</div>
	</div>
</body>
</html>
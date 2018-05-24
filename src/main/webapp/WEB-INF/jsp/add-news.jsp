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
<title>添加公告</title>

<script type="text/javascript">
	$('#newsub').click(function(){
		//alert("jinlail");
		$(".foot").load("/news/add",{
			"content":$('.section').val()
		})
	});

</script>

</head>
<body>
	<div class="list">
		<div class="list-nav">
			<span>添 加 公 告</span>
		</div>
		<div class="add-news-body">
			<form action="/news/list">
				<textarea class="section" placeholder="发布公告信息内容········"></textarea>
				<!-- <input id="tianjia" type="submit" name="" value="提交"> -->
				<span id="newsub">提交</span>
			</form>
		</div>
	</div>
</body>



</html>
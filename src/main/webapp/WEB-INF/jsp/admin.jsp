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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../css/style.css">
	<script type="text/javascript" src="../jQuery/jquery.js"></script>
	
	<title>后台管理</title>
	<script type="text/javascript">
		$(function(){
			 $(".left-nav li").on("click",function(){
				var cate = $(this);
				var url = cate.attr("url");
				$(".foot").load(url);
				
			});
			 $(".left-nav li:eq(0)").trigger("click");
		});

		/* var msg = "${requestScope.msg}"
		if(msg==null&&msg==""){
			alert(msg);
		} */
	</script>
</head>
<body>
<div class="more">
		<div class="nav">
			
			<div class="logo">
		   		<img src="../images/head_title.png">
			</div>
			<span>超级管理员 : ${admin.getName()}</span>
	
		</div>
		<div class="left-nav">
			<ul>
	
				<li url="/user/list"> 用户管理 </li>
				<li url="/column/list">板块管理 </li>
				<li url="/goods/list">商品管理</li>			
				<li url="/news/list">公告发布 </li>
				<!-- <li url="/liuyan/list">订单管理</li>	 -->
				<li><a href="/admin/loginout">退出登录</a> </li>			
			</ul>
		</div>
		<div class="foot">
				
			
			  
		</div>
</div>
</body>
</html>
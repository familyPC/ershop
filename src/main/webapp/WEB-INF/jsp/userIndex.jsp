<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html lang="en">
<head>
<script type="text/javascript" src="../jQuery/jquery.js"></script>
	<link rel="stylesheet" type="text/css" href="../css/index.css">
	<meta charset="UTF-8">
	<title>用户后台</title>
	<script type="text/javascript">
		$(function(){
			 $(".userindex-left-nav li").on("click",function(){
				var cate = $(this);
				var url = cate.attr("url");
				$(".userindex-foot").load(url);

			});
			 $(".userindex-left-nav li:eq(0)").trigger("click");
		});

	</script>
	
</head>
<body>
	<div class="userindex-nav">
		
		<div class="userindex-logo">
		</div>
		<span>贵族 : ${name}</span>
	</div>
	<div class="userindex-left-nav">
		<ul>
			<li url="/uhoutai/grxx?id=${id}">个人信息</li>
			<li url="/uhoutai/add"> 发布商品 </li>
			<li url="/uhoutai/public?id=${id}">已发布商品 </li>		
			<li url="/uhoutai/bought">已购买的商品 </li>
			<a style="text-decoration:none;	text-align: center;padding: 34px;font-size: 18px;list-style-type: none;cursor:pointer;
	            color: #8C9BF6;" href="/uhoutai/loginout">退出登录	</a>					
		</ul>
	</div>
	<div class="userindex-foot">
			
		
		  
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	String path = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>校园二手交易平台</title>
	<script type="text/javascript" src="../jQuery/jquery.js"></script>
	<link rel="stylesheet" type="text/css" href="../css/index.css">
	<script type="text/javascript">
	$(function(){
		$('.buy1').click(function(){
			//alert("jin");
			var pic=$('img').attr('src');
			var name=$('.goodsdetail-name>span').text();
			var content=$('.goodsdetail-content>span').text();
			var price=$('.goodsdetail-price>span').text();
			var gid=$('.goodsdetail-id>span').text();
			//alert($('.goodsdetail-name>span').text());
			//alert($('img').attr('src'));
			$.ajax("/order/buybtn",{
			method:"post",
			data:{
				"pic":pic,
				"name":name,
				"content":content,
				"price":price,
				"gid":gid
				
			},success:function(){
				alert("购买成功！");
			},
			error:function(){
				alert("购买失败！");
			}
			});
		}); 
	});
	</script>
</head>
<body>	
	
		<div class="goodsdetail">
			<form action="/order/buy">
			 	<div class="goodsdetail-top">
			 		<span>商&nbsp;品&nbsp;详&nbsp;情</span>
			 	</div>
			 	
				<div class="goodsdetail-pic">
				 	<span>
				 		<img src="${goodsAndUsers.pic}">
				 	</span>
				</div>
				<div class="goodsdetail-id" >
				 	<span hidden="hidden" >${goodsAndUsers.gid}</span>
				</div>
				<div class="goodsdetail-name" >
				 	<span >${goodsAndUsers.gname}</span>
				</div>
			 	<div class="goodsdetail-content">
			 		<span>${goodsAndUsers.remark}</span>
			 	</div>
			 	<div class="goodsdetail-price">
			 		<span>${goodsAndUsers.price}</span>
			 	</div>
			 	<div class="goodsdetail-buy">
			 		<!-- <input type="submit" name="" value="购买"> -->
			 		<span class="buy1">购买</span>
			 		<span class="chakanxx">查看卖家信息</span>
			 	</div>
		 	</form>

				  
			<!-- 浮出div查看用户信息 -->
			<div class="yonghuxx">
				<div class="yonghuxx-top">
					<div >
						<span>用户信息</span>
					</div>
					<div>
						<span id="span21">关闭 </span>
					</div>
				</div>
				<div class="yonghuxx-body">
				
					<table>
						<tbody>
						<tr>
							<td ><span>name&nbsp;:&nbsp;&nbsp;</span></td>
							<td>${goodsAndUsers.users.usname}</td>
						</tr>
						<tr>
							<td><span>phone&nbsp;:&nbsp;&nbsp;</span></td>
							<td>${goodsAndUsers.users.phone}</td>
						</tr>
						<tr>
							<td><span>qq&nbsp;:&nbsp;&nbsp;</span></td>
							<td>${goodsAndUsers.users.qq}</td>
						</tr>
						<tr>
							<td><span>email&nbsp;:&nbsp;&nbsp;</span></td>
							<td>${goodsAndUsers.users.email}</td>
						</tr>
						<tr>
							<td><span>address&nbsp;:&nbsp;&nbsp;</span></td>
							<td>${goodsAndUsers.users.address}</td>
						</tr>
						</tbody>
					</table>
				 
				</div>

			</div>			

		</div>

</body>

<script type="text/javascript">
	
	$(function(){
			$(".yonghuxx").hide();
			$(".chakanxx").click(function(){
				$(".yonghuxx ").fadeIn("slow");
			});
			$("#span21").click(function(){
				$(".yonghuxx").fadeOut("slow");
			});
		});
	

	
</script>


</html>
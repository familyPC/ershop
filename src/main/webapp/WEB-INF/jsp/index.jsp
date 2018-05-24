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
<link rel="stylesheet" type="text/css" href="../css/index.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>校园二手交易平台</title>
<script type="text/javascript">
$(function(){
	 $(".goodsid").on("click",function(){
		 var id = "${sessionScope.id}";
		// alert(id);
		 if(id==null||id==""){
			 alert("请先登陆！");
		 }else{
				var cate = $(this);
				var url = cate.attr("url");
				$(".index-right").load(url);
		 }
	});
	 

	
});

function check(){
	// alert("jin");
	var usname = $('.usname').val();
	var password = $('.password').val();
/* 	alert(usname);
	alert(password); */
	if(usname==null||usname==""||password==""||password==null){
		alert("不能为空");
		return false;
	}else{
		return true;
	}
}
	
	
function checkRegist(){
	// alert("jin");
	var usname = $('.usname').val();
	var password = $('.password').val();
/* 	alert(usname);
	alert(password); */
	if(usname==null||usname==""||password==""||password==null||qq==null||qq==""||phone==null||phone==""||email==null||email==""||address==null||address==""){
		alert("不能为空");
		return false;
	}else{
		return true;
	}
}
</script>


</head>
<body>	
	<div class="index-top">
		<span><a href="/ershop/index">首页</a></span>
		<!-- <span><a>留言板</a></span> -->
		<span><a href="/user/personal?name=${name}">会员中心</a></span>
	</div>
	<div class="index-body">
		<div class="index-left-nav">
			<div class="user-login">
			 	<div class="user-login-top">
			 		<span>用 &nbsp;户 &nbsp;登 &nbsp;录 </span>
			 	</div>
			 	<div class="user-login-body">
			 		<form>
			 			<div class="biaozhi">
			 				<span id="span1">登&nbsp;&nbsp;录</span>
			 			
			 			
			 				<span id="usersregist">注&nbsp;&nbsp;册</span>
			 			</div>

			 			<div class="huanying">
			 				<span>欢&nbsp;迎&nbsp;~</span>
			 				<h4>${name}</h4>
			 				<span>到&nbsp;来&nbsp;~</span>
			 			</div>
						
			 		</form>
			 	</div>
			</div>
			<div class="user-search">
			 	<div class="user-search-top">
			 		<span>商 &nbsp;品 &nbsp;搜 &nbsp;索</span>
			 	</div>
				<div class="user-search-body">
				
					<form >
						<span>商品名称</span>
						
						<input class="goods-search-input" type="text">
						
						<span id="chaxun">查询</span>
						<input id="chongzhi" type="reset" value="重置">
					</form>
				</div>
			</div>
			<div class="user-gonggao">
				<div class="user-gonggao-top">
			 		<span>网 &nbsp;站 &nbsp;公 &nbsp;告</span>
			 	</div>
			 	<c:forEach items="${newsList}" var="smalist">
			 		<ul >
			 			<li style=" font-size:16px;font-weight:bold; color:#FB2222;"> ${smalist.messages}</li>
			 		</ul>
			 	</c:forEach>
				
			</div>
		</div>
		 <div class="index-right">
			 <c:forEach items="${columnAndGoodsList}" var="smalist">	
			 	<div class="index-right-column">
			 	 	<div class="index-right-column-top">
			 	 		<span>${smalist.cname}</span>
			 	 	</div>
			 	 
			 	 	<div class="index-right-column-body" >						
						<c:forEach items="${smalist.goods}" var="goods">
							
							<a url="/goods/detail?id=${goods.gid}" class="goodsid">&nbsp;${goods.gname}
			  					<span style="float: right;margin-right: 5px;"><fmt:formatDate  value="${goods.uploaddate}" pattern="yyyy-mm-dd HH:mm"/></span>
							</a>
							
						</c:forEach>			 	 		
			 	 	</div>
			 	</div>
			 
			 </c:forEach>	
		 </div>
		 
		 <!-- 弹出登录界面 -->
		 <div id="div1">
			<div class="div2">
				<span id="span3">用户登录</span>
				<span id="span2" >关闭</span>
			</div>
			
			<div class="text-out">					
				<form action="/user/login" onsubmit="return check()">	
					<div>
						<div>
							<span>用户名</span>
						</div>
						<div>
							<input type="text" name="usname" class="usname">
						</div>

					</div>
					<div>
						<div>
							<span>密&nbsp;&nbsp;码</span>
						</div>
						<div>
							<input type="password" name="password" class="password">
						</div>
					</div>
					<div id="div-input">
						<input type="submit" name="" value="登录" >
						<input type="reset" name="" value="取消">
					</div>
				</form>							
			</div>
		</div>
		
		<!-- 弹出注册页面 -->
		
		<div id="register">
			<div class="div2">
				<span id="span3">用户注册</span>
				<span id="span6" >关闭</span>
			</div>
			
			<div class="text-out">
						<form action="/user/register" onsubmit="return checkRegist() ">	
							<div>
								<div>
									<span>用户名</span>
								</div>
								<div>
									<input type="text" name="usname" class="usname">
								</div>

							</div>
							<div>
								<div>
									<span>密&nbsp;&nbsp;码</span>
								</div>
								<div>
									<input type="password" name="password" class="password">
								</div>
							</div>
							<div>
								<div>
									<span>Q&nbsp;&nbsp;Q</span>
								</div>
								<div>
									<input type="text" name="qq" class="qq">
								</div>
							</div>
							<div>
								<div>
									<span>手&nbsp;&nbsp;机</span>
								</div>
								<div>
									<input type="text" name="phone" class="phone">
								</div>
							</div>
							<div>
								<div>
									<span>邮&nbsp;&nbsp;箱</span>
								</div>
								<div>
									<input type="text" name="email" class="email">
								</div>
							</div>
							<div>
								<div>
									<span>地&nbsp;&nbsp;址</span>
								</div>
								<div>
									<input type="text" name="address" class="address">
								</div>
							</div>

							<div id="div-input">
								<input type="submit" name="" value="提交">
								<input type="reset" name="" value="取消">
							</div>
						</form>
								
			</div>
		</div>	
		
	</div>
</body>
<script type="text/javascript">
		$(function(){
			$("#div1").hide();
			$("#span1").click(function(){
				$("#div1").fadeIn("slow");
			});
			$("#span2").click(function(){
				$("#div1").fadeOut("slow");
			});
		});
		
		
		$('#chaxun').off();
		$('#chaxun').on("click",function(){
			//alert("进来了");
			//alert($('.goods-search-input').val());
			$('.index-right').load("/goods/search",{
				"gname":$('.goods-search-input').val()
			})
		});
		
		
		
		$(function(){
			$("#register").hide();
			$("#usersregist").click(function(){
				$("#register").fadeIn("slow");
			});
			$("#span6").click(function(){
				$("#register").fadeOut("slow");
			});
		});
		
</script>


</html>
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
<title>用户管理</title>
</head>
<body>
	<div class="list">
		<div class="list-nav">
			<span>用 户 管 理</span>
		</div>
		<div class="search">
			<div class="inputsearch">
				<form>
					<input type="text" name="houtaisearch" class="input-text" placeholder="输入搜索内容">
					<span id="pic" ></span>
				</form>
			</div>
		</div>
		<div class="list-body">
			<table 	width="1308px"  >
				<thead>
					<tr height="45px" bgcolor="#C5EEF9">
						<th>ID</th>
						<th>NAME</th>
						<th>PASSWORD</th>
						<th>PHONE</th>
						<th>QQ</th>
						<th>EMAIL</th>
						<th>ADDRESS</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody >
					<c:forEach items="${userList}" var="smalist">
						<tr>
							<td class="usersid">${smalist.usid}</td>
							<td>${smalist.usname}</td>
							<td>${smalist.password}</td>
							<td>${smalist.phone}</td>
							<td>${smalist.qq}</td>
							<td>${smalist.email}</td>
							<td>${smalist.address}</td>
							<td class="usersdelete">删除</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
<script type="text/javascript">
	$('#pic').off();
	$('#pic').on("click",function(){
		//alert("jin");
		//alert($('.input-text').val());
		$('.foot').load("/user/sousuo",{
			"content":$('.input-text').val()
		})
	});
	
	
	$('.usersdelete').off();
	$('.usersdelete').on('click',function(){
		//alert($(this).siblings('.usersid').text());
		$('.foot').load("/user/delete",{
			"content":$(this).siblings('.usersid').text()
			
		});
		
	});

</script>
</html>
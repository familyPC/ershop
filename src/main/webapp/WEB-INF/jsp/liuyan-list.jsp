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
<title>留言管理</title>


</head>
<body>
	<div class="list">
		<div class="list-nav">
			<span>留 言 管 理</span>
		</div>
		<div class="search">
			<div class="inputsearch">
				<form>
					<input type="text" name="houtaisearch" class="goods-input-text" placeholder="输入搜索内容">
					<span id="pic"></span>
				</form>
			</div>
		</div>
		<div class="list-body">
			<table 	width="1308px"  >
				<thead>
					<tr height="45px" bgcolor="#C5EEF9">
						<th>ID</th>
						<th>LIUYANNAME</th>
						<th>CONTENT</th>
						<th>LIUYANTIME</th>
						<th colspan="2">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${liuyanList}" var="smalist">
						<tr>
							<td class="liuyanid">${smalist.lid}</td>
							<td>${smalist.lname}</td>
							<td>${smalist.content}</td>
							<td>${smalist.liuyantime}</td>
							<td class="usersnews">查看信息</td>
							<td class="liuyandelete">删除</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	
	
	
</body>

<script type="text/javascript">	

		$('.usersnews').off();
		$('.usersnews').on('click',function(){
			$('.foot').load("/liuyan/select",{
				"content":$(this).siblings('.liuyanid').text()
			})
		});


		$('.liuyandelete').off();
		$('.liuyandelete').on('click',function(){
			$('.foot').load("/liuyan/delete",{
				"content":$(this).siblings('.liuyanid').text()
			})
		});
</script>

</html>
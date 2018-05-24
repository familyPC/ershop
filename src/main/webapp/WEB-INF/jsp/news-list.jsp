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
<title>公告发布</title>
<script type="text/javascript">
	$(function(){
		$('.zengjia span').on('click',function(){
			var cate= $(this);
			var url = cate.attr("url");
			$('.foot').load(url);
		});
	});
</script>


</head>
<body>
	<div class="list">
		<div class="list-nav">
			<span>公 告 发 布</span>
		</div>
		<div class="search">
			<div class="zengjia">
				<span class="columnInsert" url="/news/save">添加公告</span>
			</div>
			<div class="inputsearch">
				<form>
					<input type="text" name="houtaisearch" class="column-input-text" placeholder="输入搜索内容">
					<span id="pic"></span>
				</form>
			</div>
		</div>
		<div class="list-body">
			<table 	width="1308px"  >
				<thead>
					<tr height="45px" bgcolor="#C5EEF9">
						<th >ID</th>
						<th >message</th>
						<th >操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${newsList}" var="smalist">
						<tr>
							<td class="newsid">${smalist.id}</td>
							<td>${smalist.messages}</td>						
							<td class="newsdelete">删除</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
	</div>
</body>

<script type="text/javascript">
	$('.newsdelete').off();
	$('.newsdelete').on('click',function(){
		$('.foot').load("/news/delete",{
			"content":$(this).siblings('.newsid').text()
		})
	});
</script>

</html>
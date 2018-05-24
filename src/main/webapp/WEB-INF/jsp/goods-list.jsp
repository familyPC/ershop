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
	<script type="text/javascript" src="../jQuery/jquery.js"></script>
	<link rel="stylesheet" type="text/css" href="../css/style.css">
	<title>商品管理</title>
	
</head>
<body>
	<div class="list">
		<div class="list-nav">
			<span>商 品 管 理</span>
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
						<th>GOODSNAME</th>
						<th>PRICE</th>
						<th>PIC</th>
						<th>REMARK</th>
						<th>GOODSTIME</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${goodsList}" var="samlist">	
						<tr>
							<td class="goodsid">${samlist.gid}</td>
							<td>${samlist.gname}</td>
							<td>${samlist.price}</td>
							<td><img src="${samlist.pic}" width="50px" height="30px"> </td>
							<td>${samlist.remark}</td>
							<td><fmt:formatDate value="${samlist.uploaddate}" pattern="yyyy-MM-dd"/></td>
							<td class="goodsdelete">删除</td>
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
	//alert("进来了");
	//alert($('.column-input-text').val());
	$('.foot').load("/goods/sousuo",{
		"content":$('.goods-input-text').val()
	})
});


$('.goodsdelete').off();
$('.goodsdelete').on("click",function(){
	
	//alert($(this).siblings('.columnid').text());
	$('.foot').load("/goods/delete",{
		"content":$(this).siblings('.goodsid').text()
	})
});

</script>
</html>
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
<title>板块管理</title>

	<script type="text/javascript">
		
		$(function(){
			 $(".zengjia span").on("click",function(){
				var cate = $(this);
				var url = cate.attr("url");
				$(".foot").load(url);

			});
			
		});

	</script>
	
</head>
<body>
	<div class="list">
		<div class="list-nav">
			<span>板 块 管 理</span>
		</div>
		<div class="search">
			<div class="zengjia">
				<span class="columnInsert" url="/column/save">添加栏目</span>
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
						<th >COLUMNNAME</th>
						<th >操作</th>
					</tr>
				</thead>
				<tbody>	
					<c:forEach items="${columnList}" var="smalist">				
						<tr>
							<td class="columnid">${smalist.cid}</td>
							<td>${smalist.cname}</td>
							<td class="columndelete">删除</td>
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
	$('.foot').load("/column/sousuo",{
		"content":$('.column-input-text').val()
	})
});

$('.columndelete').off();
$('.columndelete').on("click",function(){
	
	//alert($(this).siblings('.columnid').text());
	$('.foot').load("/column/delete",{
		"content":$(this).siblings('.columnid').text()
	})
});

</script>

</html>
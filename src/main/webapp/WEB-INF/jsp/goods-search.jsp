<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


<script type="text/javascript">
$(function(){
	 $(".chakan11").on("click",function(){
		 var id = "${sessionScope.id}";
		 alert(id);
		 if(id==null||id==""){
			 alert("请先登陆！");
		 }else{
			    
				var cate = $(this);
				var url = cate.attr("url");
				$(".index-right").load(url);
		 }
		
		
	});
	
});


	
</script>


</head>
<body>
	
		<div class="goods-search-body">
			<table >				
				<thead>
					<tr>
						<td>商品名称</td>
						<td>商品价格</td>
						<td>商品简介</td>
						<td>商品图片</td>
						<td style="width: 85px;">操作</td>
					</tr>				
				</thead>
				<c:forEach items="${goodsByName}" var="goods">
					<tbody>
						<tr>
							
							<td >${goods.gname}</td>
							<td>${goods.price}</td>
							<td>${goods.remark}</td>
							<td><img width="40px" height="35px" src="${goods.pic}"> </td>
							<td style="font-size: 16px;cursor: pointer;color: #035EF1;font-weight: bold;"><a class="chakan11" url="/goods/detail?id=${goods.gid}">查看详情</a> </td>
						</tr>
	
					</tbody>
				</c:forEach>
			</table>

		</div>
</body>
</html>
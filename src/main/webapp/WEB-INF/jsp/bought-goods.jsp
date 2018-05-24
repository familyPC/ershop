<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html lang="en">
<head>
	<link rel="stylesheet" type="text/css" href="../css/index.css">
	<meta charset="UTF-8">
	<title>板块管理</title>

</head>
<body>
	<div class="yhht-list">


		<div class="yhht-list-body">
			<table 	width="1290px"  >
				<thead>
					<tr height="45px" bgcolor="#C5EEF9">
						
						<th >ORDERSNAME</th>
						<th >PRICE</th>
						
						<th >PIC</th>
						<th >REMARK</th>
						<th >BOUGHTDATE</th>
						<th >操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ordersListByUsid.orders}" var="orders">
						<tr>
							<th class="orderid" hidden="hidden">${orders.oid}</th>
							<th >${orders.oname}</th>
							<th >${orders.price}</th>
							<th ><img  src=" ${orders.pic}" width="50px" height="30px"></th>
							<th >${orders.remark}</th>
							<th><fmt:formatDate value="${orders.boughtdate}" pattern="yyyy-mm-dd HH:mm:ss"/></th>								
							<th class="orderdelete">删除记录</th>
						</tr>
						
					</c:forEach>
				</tbody>
			</table>

		</div>
	</div>
</body>

<script type="text/javascript">

$('.orderdelete').off();
$('.orderdelete').on("click",function(){
	
	//alert($(this).siblings('.columnid').text());
	$('.userindex-foot').load("/order/delete",{
		"content":$(this).siblings('.orderid').text()
	})
});
</script>

</html>
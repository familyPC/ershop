<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html lang="en">
<head>
	<link rel="stylesheet" type="text/css" href="../css/index.css">
	<meta charset="UTF-8">
	<title>已发布商品</title>

</head>
<body>
	<div class="yhht-list">


		<div class="yhht-list-body">
			<table 	width="1285px"  >
				<thead>
					<tr height="45px" bgcolor="#C5EEF9">
						
						<th >GOODSNAME</th>
						<th >PRICE</th>
						<th>PIC</th>
						<th >REMARK</th>
						<th >UPLOADDATE</th>
						
						
		
					</tr>
				</thead>
				<tbody>
					
					<c:forEach items="${goodsByUserId.goods}" var="goods">
						<tr>
							<th >${goods.gname}</th>
							<th >${goods.price}</th>
							<th ><img  src=" ${goods.pic}" width="50px" height="30px"></th>
							<th >${goods.remark}</th>
							<th><fmt:formatDate value="${goods.uploaddate}" pattern="yyyy-mm-dd HH:mm:ss"/></th>								
							
						</tr>
						
					</c:forEach>
				</tbody>
			</table>

		</div>
	</div>
</body>
</html>
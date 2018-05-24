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
<link rel="stylesheet" type="text/css" href="../css/style.css">
<script type="text/javascript" src="../jQuery/jquery.js"></script>
<title>添加商品</title>




</head>
<body>
	<div class="list">
		<div class="list-nav">
			<span>添 加 商 品</span>
		</div>
		<div class="add-goods-body">
			<div >
				<form action="/uhoutai/save"  method="post" enctype="multipart/form-data">
					<div>
						<span>栏&nbsp;目&nbsp;名&nbsp;称&nbsp;:</span>
						<select name="cid">
							<option>选择分类</option>
							<c:forEach items="${columnList}" var="smalist">
								<option  value="${smalist.cid}" >${smalist.cname}</option>
							</c:forEach>
						</select>													
					</div>
					<div>
						<span>商&nbsp;品&nbsp;名&nbsp;称&nbsp;:</span>
						<input type="text" name="gname">
					</div>
					<div>
						<span>商&nbsp;品&nbsp;价&nbsp;格&nbsp;:</span>
						<input type="text" name="price">
					</div>
					<div class="shangchuan">
						<span>上&nbsp;传&nbsp;图&nbsp;片&nbsp;:</span>					
						<div>
							<input class="file-input" type="file" name="file">								
						</div>					
					</div>
					<div class="jianjie">
						<span>商&nbsp;品&nbsp;简&nbsp;介&nbsp;:</span>
						<textarea name="remark" placeholder="不少于十五字......"></textarea>
					</div>
					<div>
						<input id="tijiao" type="submit" value="提交">
						<input id="quxiao" type="reset" name="" value="取消">
					</div>
				</form>
			</div>
		</div>
</body>
</html>
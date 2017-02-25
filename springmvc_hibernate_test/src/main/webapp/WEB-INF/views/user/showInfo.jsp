<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="/js/jquery/jquery-3.1.1.min.js"></script>

<script type="text/javascript">
;(function(){
	$(function(){
		$.ajax({
			type : "get",
			url : "/user/showInfos.htmls",
			dataType : "json",
			success : function(data) {
				$(data).each(
						function(i, user) {
							var p = "<p>昵称:" + user.nickName + "    电话:"
									+ user.telephone + "    注册时间:"
									+ user.registerTime + "    id:" + user.id +
							"</p>";
							$("#show_all_user").append(p);
						});
			},
			async : true
		});
	});
})();	
</script>
</head>
<body>
<p><a href="/">首页</a></p>
	用户信息 昵称： ${userInfo.nickName} 用户id：${userInfo.id}
	用户电话:${userInfo.telephone } 注册时间：
	<fmt:formatDate value="${userInfo.registerTime }"
		pattern="yyyy-MM-dd HH:mm:ss" />

	<br /> ajax显示全部用户信息：
	<div id="show_all_user"></div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.MemberBean" %>
<%
MemberBean memberBean = (MemberBean)session.getAttribute("memberBean");
%>
<!DOCTYPE html>
<html lang="ja">
	<head>
		<meta charset="UTF-8">
		<title>登録確認</title>
	</head>
	<body>
		<main>
			<p>名前：<%= memberBean.getName() %></p>
			<p>性別：<%= memberBean.getGender() %></p>
			<p>生年月日：<%= memberBean.getYear() %>年<%= memberBean.getMonth() %>月<%= memberBean.getDay() %>日</p>
			<p>メールアドレス：<%= memberBean.getEmail() %></p>
			<p>パスワード：<%= memberBean.getPassword() %></p>
			<p><a href="RegistrationFormServlet">戻る</a></p>
			<p><a href="RegistrationServlet">登録</a></p>
		</main>
	</body>
</html>
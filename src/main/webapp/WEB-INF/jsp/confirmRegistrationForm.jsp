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
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>入力内容確認</title>
		<link rel="stylesheet" href="css/style.css">
	</head>
	<body>
		<header id="header">
			<div class="flex-item wrapper">
				<h1><a href="IndexServlet">SampleSite</a></h1>
			</div>
		</header>
		<main>
			<section id="confirm-registration">
				<h2>入力内容確認</h2>
				<p>入力内容を確認の上、登録ボタンをクリックしてください。</p>
				<div class="row">
					<h3>名前</h3>
					<p><%= memberBean.getName() %></p>
				</div>
				<div class="row">
					<h3>性別</h3>
					<p><%= memberBean.getGender() %></p>
				</div>
				<div class="row">
					<h3>生年月日</h3>
					<p><%= memberBean.getYear() %>年<%= memberBean.getMonth() %>月<%= memberBean.getDay() %>日</p>
				</div>
				<div class="row">
					<h3>メールアドレス</h3>
					<p><%= memberBean.getEmail() %></p>
				</div>
				<div class="row">
					<h3>パスワード</h3>
					<p><%= memberBean.getPassword() %></p>
				</div>
				<div class="flex-button">
					<div class="white-button"><a href="RegistrationFormServlet">戻る</a></div>
					<div class="black-button"><a href="RegistrationServlet">登録</a></div>
				</div>
			</section>
		</main>
	</body>
</html>
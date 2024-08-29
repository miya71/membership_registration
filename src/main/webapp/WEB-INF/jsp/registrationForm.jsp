<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ja">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>会員登録</title>
		<link rel="stylesheet" href="css/style.css">
	</head>
	<body>
		<header id="header">
			<div class="flex-item wrapper">
				<h1><a href="IndexServlet">SampleSite</a></h1>
			</div>
		</header>
		<main>
			<section id="registration-form">
				<h2>会員登録</h2>
				<p class="red">${errorMessage}</p>
				<form action="RegistrationFormServlet" method="post">
					<div class="row">
						<label for="name" class="label-title">名前</label>
						<input type="text" name="name" id="name" class="text-box">
					</div>
					<div class="row">
						<label for="gender" class="label-title">性別</label>
						<div>
							<input type="checkbox" name="gender" id="man" value="男性">
							<label for="man">男性</label>
						</div>
						<div>
							<input type="checkbox" name="gender" id="woman" value="女性">
							<label for="woman">女性</label>
						</div>
						<div>
							<input type="checkbox" name="gender" id="none" value="選択しない">
							<label for="none">選択しない</label>
						</div>
					</div>
					<div class="row">
						<label class="label-title">生年月日</label>
						<div>
							<select name="year" id="year">
								<option value="">選択してください</option>
								<option value="1900">1900</option>
								<!-- 以下省略 -->
							</select>
							<label for="year">年</label>
						</div>
						<div>
							<select name="month" id="month">
								<option value="">選択してください</option>
								<option value="1">1</option>
								<!-- 以下省略 -->
							</select>
							<label for="month">月</label>
						</div>
						<div>
							<select name="day">
								<option value="">選択してください</option>
								<option value="1">1</option>
								<!-- 以下省略 -->
							</select>
							<label for="day">日</label>
						</div>
					</div>
					<div class="row">
						<label for="email" class="label-title">メールアドレス</label>
						<input type="email" name="email" id="email" class="text-box">
					</div>
					<div class="row">
						<label for="password" class="label-title">パスワード</label>
						<input type="password" name="password" id="password" class="text-box">
					</div>
					<input type="submit" value="登録">
				</form>
			</section>
		</main>
	</body>
</html>
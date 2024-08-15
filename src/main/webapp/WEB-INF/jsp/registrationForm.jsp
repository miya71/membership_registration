<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>登録フォーム</title>
    </head>
    <body>
        <main>
        	<p style="color:red">${errorMessage}</p>
            <form action="RegistrationFormServlet" method="post">
                <div>
                    <label for="name">名前</label>
                    <input type="text" name="name">
                </div>
                <div>
                    <label for="gender">性別</label>
                    <input type="checkbox" name="gender" value="男性"> 男性
                    <input type="checkbox" name="gender" value="女性"> 女性
                    <input type="checkbox" name="gender" value="選択しない"> 選択しない
                </div>
                <div>
                    <label for="birthday">生年月日</label>
                    <select name="year">
                        <option value="">選択してください</option>
                        <option value="1900">1900</option>
                        <!-- 以下省略 -->
                    </select> 年
                    <select name="month">
                        <option value="">選択してください</option>
                        <option value="1">1</option>
                        <!-- 以下省略 -->
                    </select> 月
                    <select name="day">
                        <option value="">選択してください</option>
                        <option value="1">1</option>
                        <!-- 以下省略 -->
                    </select> 日
                </div>
                <div>
                    <label for="email">メールアドレス</label>
                    <input type="email" name="email">
                </div>
                <div>
                    <label for="password">パスワード</label>
                    <input type="password" name="password">
                </div>
                <input type="submit" value="登録">
            </form>
        </main>
    </body>
</html>
package model;

public class CheckRegistrationForm {
	private String errorMessage;
	
	public CheckRegistrationForm() {
		errorMessage = ""; // エラーメッセージ文頭のnullを消すため
	}
	
	public String checkAll(String name, String gender, String year, String month, String day, String email, String password) {
		checkName(name);
		checkGender(gender);
		checkYear(year);
		checkMonth(month);
		checkDay(day);
		checkEmail(email);
		checkPassword(password);
		return errorMessage;
	}
    // 文字列を受け取って空かどうか判定するメソッド
    private void checkNull(String target, String targetName) {
        if(target == null || target.isEmpty()) {
            errorMessage += targetName + "が入力されていません。<br>";
        }
    }
	private void checkName(String name) {
        checkNull(name, "名前");
		// 以下チェック条件省略
	}
	private void checkGender(String gender) {
        checkNull(gender, "性別");
		// 以下チェック条件省略
	}
	private void checkYear(String year) {
        checkNull(year, "生年月日(年)");
		// 以下チェック条件省略
	}
	private void checkMonth(String month) {
        checkNull(month, "生年月日(月)");
		// 以下チェック条件省略
	}
	private void checkDay(String day) {
        checkNull(day, "生年月日(日)");
		// 以下チェック条件省略
	}
	private void checkEmail(String email) {
        checkNull(email, "メールアドレス");
		// 以下チェック条件省略
	}
	private void checkPassword(String password) {
        checkNull(password, "パスワード");
		// 以下チェック条件省略
	}
}

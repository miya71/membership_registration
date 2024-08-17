package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.MemberBean;
import model.DBLoginConfig;

public class MemberDao {
	private Connection con = null;
	private String url;
	private String user;
	private String pass;
	
	public MemberDao() throws IOException {
		DBLoginConfig dbLoginConfig = new DBLoginConfig();
		dbLoginConfig.setAll();
		url = dbLoginConfig.getUrl();
		user = dbLoginConfig.getUser();
		pass = dbLoginConfig.getPass();
	}
	
	public boolean insert(MemberBean memberBean) {
		try {
			// MySQLに接続する
			con = DriverManager.getConnection(url, user, pass);
			
			// SQL文の雛形を準備する
			String sql = "insert into members(name, gender, year, month, day, email, password) values(?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
		
			// SQL文に値をセットして実行する
			pstmt.setString(1, memberBean.getName());
			pstmt.setString(2, memberBean.getGender());
			pstmt.setString(3, memberBean.getYear());
			pstmt.setString(4, memberBean.getMonth());
			pstmt.setString(5, memberBean.getDay());
			pstmt.setString(6, memberBean.getEmail());
			pstmt.setString(7, memberBean.getPassword());
			int result = pstmt.executeUpdate();
			
			// 処理結果が1以外ならfalseを返す
			if(result != 1) {
				return false;
			}
			pstmt.close();
		} catch(SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			// MySQLの接続を切る
			try {
				if(con != null) {
					con.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}
}
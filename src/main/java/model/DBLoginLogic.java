package model;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class DBLoginLogic {
	private String url;
	private String user;
	private String pass;
	
	public void setAll() throws IOException {
		Reader fr = new FileReader("/Applications/Eclipse_2023-12.app/Contents/db_login.properties");
		Properties property = new Properties();
		property.load(fr);
		url = property.getProperty("url");
		user = property.getProperty("user");
		pass = property.getProperty("pass");
	}
	public String getUrl() {
		return url;
	}
	public String getUser() {
		return user;
	}
	public String getPass() {
		return pass;
	}
}

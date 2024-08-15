package model;

import java.io.IOException;

import bean.MemberBean;
import dao.MemberDao;

public class RegistrationLogic {
	public boolean excute(MemberBean memberBean) throws IOException {
		MemberDao memberDao = new MemberDao();
		return memberDao.insert(memberBean);
	}
}
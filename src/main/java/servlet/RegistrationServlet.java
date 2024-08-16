package servlet;

import java.io.IOException;

import bean.MemberBean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.RegistrationLogic;

public class RegistrationServlet extends HttpServlet {
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// セッションスコープからBeanのインスタンスを受け取る
		HttpSession session = request.getSession();
		MemberBean memberBean = (MemberBean)session.getAttribute("memberBean");
		// LogicにBeanのインスタンスを渡して処理結果を受け取る
		RegistrationLogic registrationLogic = new RegistrationLogic();
		if(registrationLogic.excute(memberBean)) {
			// JSPファイルを指定してフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/succeedInRegistration.jsp");
			dispatcher.forward(request, response);
		} else {
			// JSPファイルを指定してフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/failInRegistration.jsp");
			dispatcher.forward(request, response);
		}
	}
}
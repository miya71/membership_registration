package servlet;

import java.io.IOException;

import bean.MemberBean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.CheckRegistrationForm;

public class RegistrationFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // JSPファイルを指定してフォワード
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/registrationForm.jsp");
        dispatcher.forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 文字コードを指定してリクエストパラメータを受け取る
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String year = request.getParameter("year");
        String month = request.getParameter("month");
        String day = request.getParameter("day");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        // リクエストパラメータの値を引数で渡してエラーメッセージを受け取る
        CheckRegistrationForm checkRegistrationForm = new CheckRegistrationForm();
        String errorMessage = checkRegistrationForm.checkAll(name, gender, year, month, day, email, password);
        
        if(errorMessage.isEmpty()) {
        	// セッションスコープにBeanのインスタンスを保存する
        	MemberBean memberBean = new MemberBean(name, gender, year, month, day, email, password);
        	HttpSession session = request.getSession();
        	session.setAttribute("memberBean", memberBean);
        	
        	// JSPファイルを指定してフォワード
        	RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/confirmRegistrationForm.jsp");
        	dispatcher.forward(request, response);
        } else {
        	// リクエストスコープにエラーメッセージのインスタンスを保存する
        	request.setAttribute("errorMessage", errorMessage);
            
            // JSPファイルを指定してフォワード
        	RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/registrationForm.jsp");
        	dispatcher.forward(request, response);
        }

    }
}

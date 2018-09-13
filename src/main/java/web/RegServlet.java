package web;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import entity.User;
import service.RegService;
import util.DateUtils;
import util.UUIDUtils;

/**
 * Servlet implementation class AddUserServlet
 */
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String uname = request.getParameter("username");
		String nickname = request.getParameter("nickname");
		String upwd = request.getParameter("pass");
		String realname = request.getParameter("realname");
		String birthday = request.getParameter("birthday");
		Date user_birthday = DateUtils.getDBDate(birthday);
		String gender = request.getParameter("sex");
		String location = request.getParameter("quiz1")+request.getParameter("quiz2")+request.getParameter("quiz3");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String verification = request.getParameter("verification");
		try {
			RegService reg = new RegService();
			reg.saveUser(uname, upwd, nickname, realname, user_birthday, gender, location, email, phone);
			response.sendRedirect("html/user/sussess.html");
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("html/other/404.html");
		}
		
	}

}

package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegServlet
 */
public class RegServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String username = request.getParameter("username");
		String nickname = request.getParameter("nickname");
		String pass = request.getParameter("pass");
		String repass = request.getParameter("repass");
		String realname = request.getParameter("realname");
		String birthday = request.getParameter("birthday");
		String gender = request.getParameter("sex");
		String location = request.getParameter("quiz1")+request.getParameter("quiz2")+request.getParameter("quiz3");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String verification = request.getParameter("verification");
		System.out.println(username+""+nickname+""+pass+""+repass+""+realname+""+birthday+""+gender+""+location+""+email+""+phone+""+verification);

	}

}

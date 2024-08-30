package vn.ManhTuong.ConTrollers;

import java.io.IOException;
import java.io.PrintWriter;



import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = ("/login"))
public class LoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public LoginController()
	{
		super();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		String uname = req.getParameter("uname");
		String psw = req.getParameter("psw");
		PrintWriter writer = resp.getWriter();
		writer.append("<p>Username : " + uname + "</p>");
		writer.append("<p>PassWord : " + psw + "</p>");
	}
}

package com.gba.s21.server;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html;charset=UTF-8");
		resp.getWriter().write("<h1>🎉 Hola desde S21 Server!</h1>" + "<p>Puerto: " + req.getLocalPort() + "</p>"
				+ "<p>Ruta: " + req.getRequestURI() + "</p>");
	}
}

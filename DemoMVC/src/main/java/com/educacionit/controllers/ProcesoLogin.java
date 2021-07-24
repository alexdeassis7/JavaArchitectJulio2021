package com.educacionit.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.educacionit.daos.UserDAO;
import com.educacionit.modelos.PersonaVO;

@WebServlet("/ProcesoLogin")
public class ProcesoLogin extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public ProcesoLogin() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("soy el controller y me llego el request de la vista !");

		String nombreUsuario = null;
		Integer passwordUsuario = null;

		if ((request.getParameter("pass") != "" && request.getParameter("user") != "")) {
			passwordUsuario = Integer.parseInt(request.getParameter("pass"));
			nombreUsuario = request.getParameter("user");
		}

		if (nombreUsuario != null && passwordUsuario != null) {
			UserDAO uDao = new UserDAO();

			uDao.registrarUsuario(new PersonaVO(nombreUsuario, passwordUsuario));

			// redireccionamos desde el controller a otra vista
			response.sendRedirect("index.html");
			;
		} else {
			// si no se puede crear user redireccionamos al una pagina
			System.out.println("no se logro crear user ");
			response.sendRedirect("error.html");
		}

	}

}

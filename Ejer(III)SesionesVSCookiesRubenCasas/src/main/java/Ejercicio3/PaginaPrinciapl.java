package Ejercicio3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PaginaPrinciapl
 */
@WebServlet("/PaginaPrinciapl")
public class PaginaPrinciapl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PaginaPrinciapl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usuario = "";
		ArrayList<String> nombres;
		HttpSession sesion = request.getSession();
		if (sesion.getAttribute("lista") != null) {
			nombres = (ArrayList<String>) sesion.getAttribute("lista");
		} else {
			nombres = new ArrayList<>();
		}
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		if (request.getParameter("nombre") != null) {
			usuario = request.getParameter("nombre");
			nombres.add(request.getParameter("nombre"));
			sesion.setAttribute("lista", nombres);
		} else {
			usuario = "desconocido";
		}

		pw.println("<!DOCTYPE html>\r\n" + "<html lang=\"en\">\r\n" + "<head>\r\n" + "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Document</title>\r\n" + "</head>\r\n" + "<body>\r\n" + "    Hola" + usuario + "<br>\r\n"
				+ "    Bienvenicdo a mi primera Web<br>\r\n" + "    Contigo hoy me han visitado: <br>\r\n");
		if (!nombres.isEmpty()) {
			for (String persona : nombres) {
				pw.println(persona + "<br>");
			}
		} else {
			pw.println("Nadie :(<br>");
		}
		pw.println("</body>\r\n" + "</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

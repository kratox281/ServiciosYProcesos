package Ejercicio5;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PaginaPrincipal
 */
@WebServlet("/PaginaPrincipal")
public class PaginaPrincipal extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PaginaPrincipal() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Document</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <h1 style=\"font-weight: bold;\">Bienvenido a la Web Libreria. Seleccione el libro</h1>\r\n"
				+ "  \r\n"
				+ "    <form action=\"Transicion\" method=\"post\">\r\n"
				+ "\r\n"
				+ "        <b>Listado de libros</b>\r\n"
				+ "\r\n"
				+ "        <select name=\"Lenguaje\" >\r\n"
				+ "            <option value=\"Java\">Java</option>\r\n"
				+ "            <option value=\"C\">C</option>\r\n"
				+ "            <option value=\"C++\">C++</option>\r\n"
				+ "            <option value=\"Python\">Python</option>\r\n"
				+ "        </select>\r\n"
				+ "\r\n"
				+ "        <b>Unidades</b>\r\n"
				+ "\r\n"
				+ "        <input type=\"number\" name=\"cantidad\" >\r\n"
				+ "\r\n"
				+ "        <input type=\"submit\" value=\"enviar\">\r\n"
				+ "    </form>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

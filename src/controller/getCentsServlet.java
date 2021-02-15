/*Kabrina Brady, Java II, 2/15/2021*/

package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CoinConverter;

/**
 * Servlet implementation class getCentsServlet
 */
@WebServlet("/getCentsServlet")
public class getCentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCentsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String userCents = request.getParameter("userCents");
		CoinConverter userCoins = new CoinConverter(Integer.parseInt(userCents));
		PrintWriter writer = response.getWriter();
		writer.println(userCoins.toString()); //note the change to userCoins
		writer.close();
	}
}
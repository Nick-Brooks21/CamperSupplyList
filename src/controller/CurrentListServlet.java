package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Camper;
import model.Food;
import model.Supplies;

/**
 * Servlet implementation class CurrentListServlet
 */
@WebServlet("/CurrentListServlet")
public class CurrentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CurrentListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Creates a new supply list each time this method is called
		CreateCamperHelper ch = new CreateCamperHelper();
		List<Camper> campers = ch.getAllCampers();
		List<Food> food = ch.showAllFood();
		List<Supplies> supplies = ch.showAllSupplies();
		request.setAttribute("campers", campers);
		request.setAttribute("food", food);
		request.setAttribute("supplies", supplies);
		getServletContext().getRequestDispatcher("/currentList.jsp").forward(request, response);
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

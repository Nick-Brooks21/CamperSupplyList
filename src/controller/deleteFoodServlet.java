package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Food;

/**
 * Servlet implementation class deleteFoodServlet
 */
@WebServlet("/deleteFoodServlet")
public class deleteFoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteFoodServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CreateCamperHelper cch = new CreateCamperHelper();
		request.setAttribute("allFood", cch.showAllFood());
		
		if(cch.showAllFood().isEmpty()) {
			request.setAttribute("food", " ");
		}
		
		getServletContext().getRequestDispatcher("/deleteFood.jsp").forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			UpdateHelper fh = new UpdateHelper();

			Integer tempId = Integer.parseInt(request.getParameter("id"));
			Food foodToDelete = fh.searchByFoodId(tempId);

			fh.deleteFood(foodToDelete);

		} catch (NumberFormatException e) {
			System.out.println("Forgot to click a button");
		} finally {
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}		
	}

}

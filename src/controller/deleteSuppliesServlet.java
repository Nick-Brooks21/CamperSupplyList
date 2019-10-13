package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Supplies;

/**
 * Servlet implementation class deleteSuppliesServlet
 */
@WebServlet("/deleteSuppliesServlet")
public class deleteSuppliesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteSuppliesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CreateCamperHelper cch = new CreateCamperHelper();
		request.setAttribute("allSupplies", cch.showAllSupplies());
		
		if(cch.showAllSupplies().isEmpty()) {
			request.setAttribute("supply", " ");
		}
		
		getServletContext().getRequestDispatcher("/deleteSupplies.jsp").forward(request, response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UpdateHelper sh = new UpdateHelper();

		try {
			Integer tempId = Integer.parseInt(request.getParameter("id"));

			Supplies supplyToDelete = sh.searchBySupplyId(tempId);
			sh.deleteSupplies(supplyToDelete);

		} catch (NumberFormatException e) {
			System.out.println("Forgot to click a button");
		} finally {
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
				
	}

}

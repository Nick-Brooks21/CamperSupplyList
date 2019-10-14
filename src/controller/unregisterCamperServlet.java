package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Camper;

/**
 * Servlet implementation class unregisterCamperServlet
 */
@WebServlet("/unregisterCamperServlet")
public class unregisterCamperServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public unregisterCamperServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CreateCamperHelper cch = new CreateCamperHelper();
		request.setAttribute("allCampers", cch.showAllCampers());
		
		if(cch.showAllCampers().isEmpty()) {
			request.setAttribute("campers", " ");
		}
		
		getServletContext().getRequestDispatcher("/unregisterCamper.jsp").forward(request, response);	
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UpdateHelper ch = new UpdateHelper();
		
		try {
			Integer tempId = Integer.parseInt(request.getParameter("id"));
			Camper camperToDelete = ch.searchByCamperId(tempId);
						
			ch.deleteCamper(camperToDelete);
			
		} catch (NumberFormatException e) {
			System.out.println("Forgot to click a button");
		} finally {
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}	}

}

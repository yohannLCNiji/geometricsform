package geometricsform.web;

import java.io.IOException;

import geometricsform.models.Cube;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cube")
public class CubeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@Inject
	private Cube cube;
    
	@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {    	
		this.getServletContext().getRequestDispatcher("/jsp/cubeInfos.jsp").forward(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        cube.setIdCube(1);
        cube.setColorCube("bleu");
        cube.setNameCube("cubeGeneral");
        resp.sendRedirect(req.getContextPath() + "/menu");
    }
    
}

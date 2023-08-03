package geometricsform.web;

import java.io.IOException;

import geometricsform.Dao.CubeDao;
import geometricsform.Dao.DaoFactory;
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
	private CubeDao cubeDao;
	Integer id = 1; //TODO modif this value
    
	public void init() throws ServletException{
		DaoFactory daoFactory = DaoFactory.getInstance();
		this.cubeDao = daoFactory.getCubeDao();
	}
	
	@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws 
    ServletException, IOException {   
		request.setAttribute("cube", cubeDao.getId( id ) );
		this.getServletContext().getRequestDispatcher("/jsp/cubeInfos.jsp").forward(request, response);
	}
	
//	@Override
//	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws 
//	ServletException, IOException {
//		Cube cube = new Cube();
//        cube.setIdCube(1);
//        cube.setColorCube("bleu");
//        cube.setNameCube("cubeGeneral");
//        resp.sendRedirect(req.getContextPath() + "/menu");
//    }
    
}

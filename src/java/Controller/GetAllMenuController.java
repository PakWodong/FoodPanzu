/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOImpl;
import DAO.DMenu;
import Model.Menu;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author khair
 */
@WebServlet(name = "GetAllMenuController", urlPatterns = {"/GetAllMenuController"})
public class GetAllMenuController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        DMenu dao = new DAOImpl();
        List<Menu> ml = dao.getAllMenu();
        request.setAttribute("ml", ml);
        request.getRequestDispatcher("ViewAllMenu.jsp").forward(request, response);
        
    }

}

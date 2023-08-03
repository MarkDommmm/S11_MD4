package rikkei.academy;

import rikkei.academy.database.DBUtils;
import rikkei.academy.model.Dept;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/JstlCoreTags")
public class JstlCoreTags extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Dept> List = DBUtils.queryDepartments();
        req.setAttribute("departments", List);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/jsps/jstl_core_tags.jsp");
dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

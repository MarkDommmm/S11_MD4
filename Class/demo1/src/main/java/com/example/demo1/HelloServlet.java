
package com.example.demo1;

import com.example.demo1.Model.Computer;
import com.example.demo1.database.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/Home")
public class HelloServlet extends HttpServlet {
    List<Computer> getComputerList = Data.queryComputerList();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");

        if (action == null) {
            getProducts(req, resp);
        } else {
            switch (action) {
                case "DELETE":
                    getComputerList.remove(findById(Integer.parseInt(req.getParameter("id"))));
                    break;
                case "EDIT":
                    Computer computerEdit = findById(Integer.parseInt(req.getParameter("id")));
                    if (computerEdit != null) {
                        req.setAttribute("computerUpdate", computerEdit);
                        req.getRequestDispatcher("/View/UpdateProduct.jsp").forward(req, resp);
                    }
                    break;
                case "SEARCH":
                    String searchName = req.getParameter("search");
                    List<Computer> listSearch = new ArrayList<>();
                    for (Computer computer : getComputerList) {
                        if (computer.getName().toLowerCase().contains(searchName.toLowerCase())) {
                            listSearch.add(computer);
                        }
                    }
                    req.setAttribute("computer", listSearch);
                    req.getRequestDispatcher("/View/ShowProducts.jsp").forward(req, resp);

                    break;
                default:
                    break;

            }

        }
        getProducts(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action) {
            case "submit":
                String name = req.getParameter("name");
                double price = Double.parseDouble(req.getParameter("price"));
                int year = Integer.parseInt(req.getParameter("year"));
                String description = req.getParameter("description");
                int id = getNewId();
                Data.queryComputerList().add(new Computer(id, name, price, year, description));
                getProducts(req, resp);
                break;
            default:
                break;
        }
    }

    public void getProducts(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("computer", getComputerList);
        req.getRequestDispatcher("/View/ShowProducts.jsp").forward(req, resp);
    }


    public int getNewId() {
        int maxid = 0;
        for (Computer computer : Data.queryComputerList()) {
            if (computer.getId() > maxid) {
                maxid = computer.getId();
            }
        }
        return maxid + 1;
    }

    public Computer findById(int id) {
        for (Computer computer : Data.queryComputerList()) {
            if (computer.getId() == id) {
                return computer;
            }
        }
        return null;
    }

    public void destroy() {
        super.destroy();
    }
}
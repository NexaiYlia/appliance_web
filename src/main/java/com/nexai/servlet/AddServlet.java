package com.nexai.servlet;

import com.nexai.model.Appliance;
import com.nexai.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/add.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        Double capacity = Double.parseDouble(req.getParameter("capacity"));
        Double price = Double.parseDouble(req.getParameter("price"));
        String color = req.getParameter("color");


        Appliance appliance = new Appliance(name, capacity,price,color);
        Model model = Model.getInstance();
        model.add(appliance);

        req.setAttribute("applianceName", name);
        doGet(req, resp);
    }
}

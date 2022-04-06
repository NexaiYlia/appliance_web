package com.nexai.servlet;

import com.nexai.model.Appliance;
import com.nexai.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FindServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/find.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Appliance> list = new ArrayList<>();
        Double minCapacity = Double.parseDouble(req.getParameter("min-capacity"));
        Double maxCapacity = Double.parseDouble(req.getParameter("max-capacity"));
        Double minPrice = Double.parseDouble(req.getParameter("min-price"));
        Double maxPrice = Double.parseDouble(req.getParameter("max-price"));

        Model model = Model.getInstance();
        List<Appliance> applianceList = model.getModel();
        for (Appliance appliance : applianceList) {
            if ((appliance.getCapacity() >= minCapacity && appliance.getCapacity() <= maxCapacity) &&
                    (appliance.getPrice() >= minPrice && appliance.getPrice() <= maxPrice)) {
                list.add(appliance);
            }
        }

        req.setAttribute("applianceFind", list);
        doGet(req, resp);
    }
}

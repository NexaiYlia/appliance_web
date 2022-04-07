package com.nexai.servlet;

import com.nexai.comparator.ByCapacityApplianceComparator;
import com.nexai.model.Appliance;
import com.nexai.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SortServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        Model model = Model.getInstance();
        List<Appliance> applianceList = model.getModel();
        ByCapacityApplianceComparator comparator = new ByCapacityApplianceComparator();
        applianceList.sort(comparator);
        req.setAttribute("applianceNames", applianceList);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/sort.jsp");
        requestDispatcher.forward(req, resp);
    }

}


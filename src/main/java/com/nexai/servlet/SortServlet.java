package com.nexai.servlet;

import com.nexai.model.Appliance;
import com.nexai.model.Model;
import com.nexai.service.ApplianceManipulatorService;
import com.nexai.service.impl.ApplianceManipulatorServiceImpl;

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
        Model model = Model.getInstance();
        List<Appliance> names = model.getModel();
        ApplianceManipulatorService service = new ApplianceManipulatorServiceImpl();
        service.sortApplianceByPower(names);
        req.setAttribute("appliance", names);
        doGet(req, resp);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/sort.jsp");
        requestDispatcher.forward(req, resp);
    }
}
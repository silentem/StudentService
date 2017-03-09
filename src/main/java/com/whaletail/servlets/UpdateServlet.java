package com.whaletail.servlets;

import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.whaletail.dao.StudentDao;
import com.whaletail.util.JsonUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Whaletail
 */
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentDao studentDao = new StudentDao();
        long id = Long.parseLong(req.getParameter("id"));
        System.out.println(id);
        req.setAttribute("student", studentDao.getById(id));
        req.getRequestDispatcher("/jsp/update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

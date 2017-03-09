package com.whaletail.servlets;

import com.google.gson.JsonObject;
import com.whaletail.dao.StudentDao;
import com.whaletail.entities.Student;
import com.whaletail.util.JsonUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Whaletail
 */
public class DeleteDataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentDao studentDao = new StudentDao();
        long id = ((JsonObject) JsonUtil.parseJson(req)).get("id").getAsLong();
        studentDao.delete(studentDao.getById(id));
        resp.sendRedirect("/view");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

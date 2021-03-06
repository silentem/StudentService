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
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Whaletail
 */
public class UpdateDataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            StudentDao studentDao = new StudentDao();
            JsonObject jo = ((JsonObject) JsonUtil.parseJson(req));
            Student student = new Student();
            student.setId(jo.get("id").getAsLong());
            student.setName(jo.get("name").getAsString());
            student.setLastName(jo.get("last_name").getAsString());
            student.setPhoneNumber(jo.get("phone_number").getAsString());
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            student.setBirthday(format.parse(jo.get("birthday").getAsString()));
            student.setEmail(jo.get("email").getAsString());
            studentDao.update(student);
            resp.sendRedirect("/view");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

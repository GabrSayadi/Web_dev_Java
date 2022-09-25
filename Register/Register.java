package com.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Register", value = "/Register")
public class Register extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        // DATA STRUCTURE OF USERS INFO
        List<String> usersNames = new ArrayList<>();
        List<String> passwords = new ArrayList<>();
        List<String> genders = new ArrayList<>();
        List<String> jobs = new ArrayList<>();

        // GET USERS INFO VARIABLES
        String userName = req.getParameter("username");
        String password = req.getParameter("password");
        String gender = req.getParameter("gender");
        String job = req.getParameter("job");

        // STORAGE USERS INFO TO DATA STRUCTURE
        usersNames.add(userName);
        passwords.add(password);
        if (gender == null) {
            genders.add("Unknown");
        } else {
            genders.add(gender);
        }
        jobs.add(job);

        // RESPONSE
        rep.setContentType("text/html; charset = UTF-8");

        PrintWriter show = rep.getWriter();

        // SHOW ALL USERS
        show.println("<html>");
        show.println("<head>");
        show.println("<title>USERS INFO</title>");
        show.println("</head>");
        show.println("<body>");
        show.println("<h1>USERS NAME:</h1>");

        for (int i = 0; i < usersNames.size(); i++) {
            show.println(
                    " <h3> USER NAME :  " + usersNames.get(i) + "</h3>" +
                            "<h3> PASSWORD  :" +
                            passwords.get(i).toString().replace(passwords.get(i), "*******") + "</h3>" +
                            "<h3> GENDER    : " + genders.get(i) + "</h3>" +
                            "<h3> JOB       :" + jobs.get(i) + "</h3>");
            show.println(" ");
        }
        show.println("</body>");
        show.println("</html>");
    }
}

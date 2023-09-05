package io.jio.todolist.controller;

import io.jio.todolist.dto.PersonLoginDto;
import io.jio.todolist.model.Person;
import io.jio.todolist.services.PersonService;
import jakarta.mvc.Controller;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@Controller
@RequiredArgsConstructor
@WebServlet(name = "signInServlet", value = "/sign-in")
public class SingInServlet extends HttpServlet {
    PersonService personService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        Person person = personService.singIn(PersonLoginDto
                .builder()
                .username(req.getParameter("username"))
                .password(req.getParameter("password"))
                .build());
        if (Objects.nonNull(person)) {
            req.setAttribute("person", person);
            req.getRequestDispatcher("to-do-list.jsp").forward(req, resp);
        } else {
            PrintWriter printWriter = resp.getWriter();
printWriter.println();
        }
    }

    public void destroy() {
    }
}

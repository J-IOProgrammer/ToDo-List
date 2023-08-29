package io.jio.todolist.controller;

import jakarta.mvc.Controller;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@WebServlet(name = "signInServlet" , value = "/sign-in")
public class SingInServlet extends HttpServlet {

}

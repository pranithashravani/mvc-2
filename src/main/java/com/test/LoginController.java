package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller

public class LoginController {
    @RequestMapping(value="/print",method = RequestMethod.POST)
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Printservice ps=new Printservice();
String name=request.getParameter("name");
String password=request.getParameter("password");
if(password.equals("stackroute"))
{
    ModelAndView modelAndView = new ModelAndView();
    String message1="Welcome " + name + " to stackroute ";


    modelAndView.addObject("result",message1);
 //return new ModelAndView("success","message",message1);
    modelAndView.setViewName("success");
    return modelAndView;
}
else
{
    return new ModelAndView("fail","message","Invalid username or password");
}



    }
}

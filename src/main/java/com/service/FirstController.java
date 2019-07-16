package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class FirstController {
@Autowired
    User user;
public ModelAndView add(HttpServletRequest request,HttpServletResponse response)
{
    ModelAndView mv=new ModelAndView();
mv.addObject("result",user.display());
    mv.setViewName("newindex");
    return mv;
}

}

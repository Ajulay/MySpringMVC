package com.ajulay.controller;

import com.ajulay.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "/index";
    }

    @RequestMapping(value = "employee", method = RequestMethod.GET)
    public ModelAndView employee() {
        return new ModelAndView("employee", "command", new Employee());
    }

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute("mvc-dispatcher") Employee employee,
                             ModelMap model) {

        model.addAttribute("name", employee.getName());
        model.addAttribute("sirname", employee.getSirname());
        model.addAttribute("position", employee.getPosition());

        return "result";
    }
}

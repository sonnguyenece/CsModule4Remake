package com.codegym.cms.controller;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.CustomerType;
//import com.codegym.cms.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

@Controller
public class CustomerController {

//    @Autowired
//    private CustomerService customerService;

    @GetMapping("/")
    public String getHomepage() {
        return "index";
    }

}

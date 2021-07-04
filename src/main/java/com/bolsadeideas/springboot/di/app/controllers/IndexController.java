package com.bolsadeideas.springboot.di.app.controllers;

import com.bolsadeideas.springboot.di.app.models.service.IService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    // @Qualifier("MySimpleService")
    private IService myService;

    /* public IndexController(IService service) {
        this.myService = service;
    } */

    @GetMapping({ "/", "", "/index" })
    public String index(Model model) {
        model.addAttribute("operation", myService.operation());
        return "index";
    }

    /*
     * @Autowired public void setIService(IService iService) { this.myService =
     * iService; }
     */

}

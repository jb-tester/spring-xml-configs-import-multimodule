package com.mytests.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
@RequestMapping("/")
public class MyController {

    @Autowired
    List<Object> web_list;
    @Autowired
    private WebModuleBean3 webModuleBean3_main;


    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("autowiredBean", webModuleBean3_main);
        model.addAttribute("web_list", web_list);
        return "index";
    }
}

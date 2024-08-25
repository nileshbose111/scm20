package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home Page Handler");
        model.addAttribute("name","Substring Technologies");
        model.addAttribute("youtubeChannel", "My Channel");
        model.addAttribute("githubRepo", "https://github.com/nileshbose");
        return "Home";
    }

    //About Page
    @RequestMapping("/about")
    public String aboutPage(Model model){
        model.addAttribute("isLogin", false);
        System.out.println("This is about page");
        return "About";
    }

    //Services Page
    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("This is service page");
        return "services";
    }
}

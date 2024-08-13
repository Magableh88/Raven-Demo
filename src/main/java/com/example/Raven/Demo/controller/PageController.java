package com.example.Raven.Demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * This controller class handles the requests to switch between html
 * @author Mohammad Makableh
 */
@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index"; // Returns the index.html page
    }

    @GetMapping("/about")
    public String about() {
        return "about"; // Returns the about.html page
    }

    @GetMapping("/services")
    public String services() {
        return "services"; // Returns the services.html page
    }

    @GetMapping("/order")
    public String order() {
        return "order"; // Returns the order.html page
    }

    @GetMapping("/zinvo")
    public String zinvo() {
        return "zinvo"; // Returns the zinvo.html page
    }

    @GetMapping("/tufina")
    public String tufina() {
        return "tufina"; // Returns the tufina.html page
    }

    @GetMapping("/venezianico")
    public String venezianico() {
        return "venezianico"; // Returns the venezianico.html page
    }

    @GetMapping("/paulrich")
    public String paulrich() {
        return "paulrich"; // Returns the paulrich.html page
    }

    
}

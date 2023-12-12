package com.example.urban_rug_finds.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.urban_rug_finds.rug.RugService;


@Controller
public class WebController {
    @Autowired
    private RugService rugService;

    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @GetMapping("/shop")
    public String shop(Model model) {
        model.addAttribute(rugService.getRugs());
        return "shop";
    }

    @GetMapping("/product") 
    public String product() { // add params for specific product
        return "product";
    }

    @GetMapping("/create") 
    public String create() { // add params for specific product
        return "new_product";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

}

package com.Assignment_Three.CRUD_API;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    
    @GetMapping({"","/","/home"})
    public String redirectToAnimals() {
        return "redirect:/animals";
    }
}

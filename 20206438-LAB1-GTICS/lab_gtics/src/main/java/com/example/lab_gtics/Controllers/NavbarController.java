package com.example.lab_gtics.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NavbarController {

    @RequestMapping(value="paginaprincipal",method= RequestMethod.GET)
    public String paginaPrincipal(){
        return "principal";
    }
}

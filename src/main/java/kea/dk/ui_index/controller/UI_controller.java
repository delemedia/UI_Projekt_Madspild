package kea.dk.ui_index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UI_controller {

@GetMapping("/")
    public String UI_index(){

    return "Home/index";

}

@GetMapping("/omMadspild")
public String omMadspild(){

    return "Home/omMadspild";

}


}

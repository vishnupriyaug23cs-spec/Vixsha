package com.example.Vixsha;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReactController {
    @RequestMapping(value = {"/","/about","/services","/courses","/contact","/project"})
    public String index(){
        return "forward:/index.html";
    }
}


package com.example.day2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//import org.springframework.web.bind.annotation.RestController;
@Controller //if we want only html file
//@ResponseBody//agar Controller ke saath hum responseBody use karenge to abb to text ke form mai le lega return wale ko
public class Day2 {
    @GetMapping("/")
    public String home(){
        return "home";// hum controller likhe hai isliye ye automatically index.html file lega usse text ke tarah nhi lega

    }
    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}
//annotators->@___ ke baad jo bhi likha ho usse annotator bolte hai
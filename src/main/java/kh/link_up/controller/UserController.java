package kh.link_up.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("login")
    public String home() {
        return "login";
    }
}

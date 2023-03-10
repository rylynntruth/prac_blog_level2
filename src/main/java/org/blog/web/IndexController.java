package org.blog.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    @GetMapping("/")
    public String login_page() {
        return "login/login_main";
    }

    @GetMapping("/signup")
    public String login_signup() {
        return "login/login_signup";
    }
}

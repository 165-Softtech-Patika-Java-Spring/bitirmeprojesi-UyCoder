package dev.ahmed.graduationproject.app.controller.frontendcontroller;

import dev.ahmed.graduationproject.app.dto.UserLoginDto;

import dev.ahmed.graduationproject.app.entity.Product;
import dev.ahmed.graduationproject.app.entity.User;
import dev.ahmed.graduationproject.app.service.entityservice.ProductEntityService;
import dev.ahmed.graduationproject.app.service.entityservice.UserEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Ahmed Bughra
 * @Created 3/21/2022 - 11:08 PM
 * @Project bitirmeprojesi-UyCoder
 */
@RequiredArgsConstructor
@Controller
public class IndexController {

    private final ProductEntityService productEntityService;
    private final UserEntityService userEntityService;

    @GetMapping(value = {"/", "/login"})
    public String logingPage() {
        return "login";
    }

    // userName ve password dogru oldugunda login page den main page'e gecicek
    @PostMapping("/login")
    public String main(UserLoginDto userLoginDto, HttpSession session, Model model) {
        if (userLoginDto.getUserName().equals("ahmed") && userLoginDto.getPassword().equals("123")) {
        session.setAttribute("loginUser", userLoginDto);
            return "redirect:main.html";
        } else {
            model.addAttribute("msg", "Wrong password!");
            return "login";
        }
    }

    // login yapmadan main.html e gitse login page'e dondurecek
    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model) {
        Object loginUser = session.getAttribute("loginUser");
        if (loginUser != null) {
            return "main";
        } else {
            model.addAttribute("msg", "");
            return "login";
        }
    }


    @GetMapping(value = {"/main"})
    public String mainPage(Model model) {
        List<Product> productList= productEntityService.findAll();

        model.addAttribute("products", productList);
        return "main";
    }
}

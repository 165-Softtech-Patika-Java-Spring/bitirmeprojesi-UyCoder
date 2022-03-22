package dev.ahmed.graduationproject.app.controller.frontendcontroller;

import dev.ahmed.graduationproject.app.dto.CategoryFindAllDetailsDto;
import dev.ahmed.graduationproject.app.entity.Category;
import dev.ahmed.graduationproject.app.entity.Product;
import dev.ahmed.graduationproject.app.entity.User;
import dev.ahmed.graduationproject.app.service.entityservice.CategoryEntityService;
import dev.ahmed.graduationproject.app.service.entityservice.UserEntityService;
import dev.ahmed.graduationproject.gen.dto.RestResponse;
import dev.ahmed.graduationproject.gen.exceptions.ItemNotFoundException;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.exceptions.TemplateInputException;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Optional;

/**
 * @Author Ahmed Bughra
 * @Created 3/22/2022 - 2:13 AM
 * @Project bitirmeprojesi-UyCoder
 */
@RequiredArgsConstructor
@Controller
public class TableController {

    private final CategoryEntityService categoryEntityService;
    private final UserEntityService userEntityService;

    @GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping("/signup")
    public String createUser(@ModelAttribute User user) {
        user = userEntityService.createUser(user);
        ResponseEntity.ok(user);
        return "redirect:/main.html";
    }


    @GetMapping("/updateuser")
    public String updateuser(Model model) {
        List<User> users = userEntityService.findAll();
        model.addAttribute("users", users);
        return "updateuser";
    }

    @GetMapping("/deleteuser")
    public String deleteuser() {
        return "deleteuser";
    }

    @GetMapping("/addproduct")
    public String addproduct() {
        return "addproduct";
    }

    @GetMapping("/updateproduct")
    public String updateproduct() {
        return "updateproduct";
    }

    @GetMapping("/updateprice")
    public String updateprice() {
        return "updateprice";
    }

    @GetMapping("/findbyprice")
    public String findbyprice() {
        return "findbyprice";
    }

    @GetMapping("/deleteproduct")
    public String deleteproduct() {
        return "deleteproduct";
    }


    // send category information to the details.html page
    @GetMapping("/details")
    public String details(Model model) {

        List<CategoryFindAllDetailsDto> categorydetails = new ArrayList<>();
        try {
            for (long id=1; id<categoryEntityService.getCategoryCount()+1; id++){
                categorydetails.add(categoryEntityService.findAllDetails(id));
            }
        } catch (Exception e){
        }
        model.addAttribute("categorydetails", categorydetails);
        return "details";
    }


    @GetMapping("/productsfromcategory")
    public String productsfromcategory() {
        return "productsfromcategory";
    }

    @GetMapping("/addcategory")
    public String addcategory() {
        return "addcategory";
    }

    @GetMapping("/updatekdv")
    public String updatekdv() {
        return "updatekdv";
    }

    @GetMapping("/deletecategory")
    public String deletecategory() {
        return "deletecategory";
    }


}

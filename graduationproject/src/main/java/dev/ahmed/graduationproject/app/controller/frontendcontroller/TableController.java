package dev.ahmed.graduationproject.app.controller.frontendcontroller;

import dev.ahmed.graduationproject.app.dto.CategoryFindAllDetailsDto;
import dev.ahmed.graduationproject.app.entity.Category;
import dev.ahmed.graduationproject.app.entity.Product;
import dev.ahmed.graduationproject.app.entity.User;
import dev.ahmed.graduationproject.app.service.entityservice.CategoryEntityService;
import dev.ahmed.graduationproject.app.service.entityservice.ProductEntityService;
import dev.ahmed.graduationproject.app.service.entityservice.UserEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    private final ProductEntityService productEntityService;

    // This get and post mapping will handle signup page to create new user
    @GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("user", new User());
        return "signup";}
    @PostMapping("/signup")
    public String createUser(@ModelAttribute User user) {
        user = userEntityService.createUser(user);
        ResponseEntity.ok(user);
        return "redirect:/main.html";}

    // This get and post mapping will handle addProduct page to create new product
    @GetMapping("/addproduct")
    public String addproductPage(Model model) {
        List<Category> categoryList = categoryEntityService.findAll();
        model.addAttribute("categories", categoryList);
        model.addAttribute("product", new Product());
        return "addproduct"; }
    @PostMapping("/addproduct")
    public String addproduct(@ModelAttribute Product product) {
        product = productEntityService.createProduct(product);
        System.out.println(product);
        ResponseEntity.ok(product);
        return "redirect:/main";}

    // This get and post mapping will handle addCategory page to create new category
    @GetMapping("/addcategory")
    public String addcategory(Model model) {
        model.addAttribute("category", new Category());
        return "addcategory";}
    @PostMapping("/addcategory")
    public String createCategory(@ModelAttribute Category category) {
        category = categoryEntityService.createCategory(category);
        ResponseEntity.ok(category);
        return "redirect:/main";}

    @GetMapping("/updateuser")
    public String updateuser(Model model) {
        List<User> users = userEntityService.findAll();
        model.addAttribute("users", users);
        return "updateuser";
    }




    // Go to update page and fill the current user info
    @GetMapping("/edituser/{id}")
    public String toEditPage(@PathVariable("id") Long id, Model model) {
        User userById = userEntityService.getUserById(id);
        model.addAttribute("user", userById);
        return "edituser";
    }
    @PostMapping(value = "/edituser" )
    public String editUserPage(@ModelAttribute User user) {
        user = userEntityService.saveUser(user.getId());
        ResponseEntity.ok(user);
        return "redirect:/updateuser";
    }


    @PostMapping(value = "/edituser/{id}")
    public String deleteuser(@PathVariable("id") Long id) {
        userEntityService.deleteUser(id);
        return "redirect:/updateuser";
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



    @GetMapping("/updatekdv")
    public String updatekdv() {
        return "updatekdv";
    }

    @GetMapping("/categories")
    public String categoriesfindAll(Model model) {
        List<Category> categoryList = categoryEntityService.findAll();
        model.addAttribute("categories", categoryList);
        return "categories";
    }
}
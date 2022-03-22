package dev.ahmed.graduationproject.app.controller.frontendcontroller;

import dev.ahmed.graduationproject.app.dto.CategoryFindAllDetailsDto;
import dev.ahmed.graduationproject.app.entity.Category;
import dev.ahmed.graduationproject.app.entity.Product;
import dev.ahmed.graduationproject.app.service.entityservice.CategoryEntityService;
import dev.ahmed.graduationproject.gen.dto.RestResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

    @GetMapping("/updateuser")
    public String updateuser() {
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
        for (long id=1; id<categoryEntityService.getCategoryCount(); id++){
            categorydetails.add(categoryEntityService.findAllDetails(id));
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

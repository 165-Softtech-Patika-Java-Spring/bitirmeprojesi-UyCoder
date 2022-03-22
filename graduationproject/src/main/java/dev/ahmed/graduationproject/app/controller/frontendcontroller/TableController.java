package dev.ahmed.graduationproject.app.controller.frontendcontroller;

import dev.ahmed.graduationproject.app.dto.CategoryFindAllDetailsDto;
import dev.ahmed.graduationproject.app.entity.Product;
import dev.ahmed.graduationproject.app.service.entityservice.CategoryEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

    @GetMapping("/details")
    public String details(Long id, Model model) {

        List<CategoryFindAllDetailsDto> categoryDitails = new ArrayList<>();

        for (id = Long.valueOf(1); id<7; id++){
            categoryDitails.add(categoryEntityService.findAllDetails(id));
        }

        model.addAttribute("categorydetails", categoryDitails);
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

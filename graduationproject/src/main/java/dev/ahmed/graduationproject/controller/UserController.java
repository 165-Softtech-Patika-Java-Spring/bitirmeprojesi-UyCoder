package dev.ahmed.graduationproject.controller;

import dev.ahmed.graduationproject.entity.User;
import dev.ahmed.graduationproject.service.entityservice.UserEntityService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Ahmed Bughra
 * @Created 3/12/2022 - 12:52 AM
 * @Project bitirmeprojesi-UyCoder
 */

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class UserController {

    private final UserEntityService userEntityService;

    @PostMapping("/user")
    public ResponseEntity save(@RequestBody User user){

        user = userEntityService.save(user);
        return ResponseEntity.ok(user);
    }

}

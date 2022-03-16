package dev.ahmed.graduationproject.app.controller;

import dev.ahmed.graduationproject.app.dto.UserDto;
import dev.ahmed.graduationproject.app.dto.UserSaveRequestDto;
import dev.ahmed.graduationproject.app.entity.User;
import dev.ahmed.graduationproject.app.service.entityservice.UserEntityService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import static org.springframework.http.HttpStatus.*;

/**
 * @Author Ahmed Bughra
 * @Created 3/12/2022 - 12:52 AM
 * @Project bitirmeprojesi-UyCoder
 */

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserEntityService userEntityService;


    // Sisteme yeni kullanıcı tanımlanabilir
    @PostMapping
    @Operation(tags = "User Controller", description = "Create New User", summary = "Create New User")
    public ResponseEntity createUser(@RequestBody User user) {
        user = userEntityService.createUser(user);
        return ResponseEntity.ok(user);
    }

    // kullanıcı güncellenebilir
    @PutMapping("/{id}")
    @Operation(tags = "User Controller", description = "Update User", summary = "Update User")
    public ResponseEntity<Void> updateUserById(@PathVariable Long id, @RequestBody UserSaveRequestDto userSaveRequestDto){
        userEntityService.updatesById(id, userSaveRequestDto);
        return new ResponseEntity<>(OK);
    }

    // kullanıcı silinebilir.
    @DeleteMapping("/{id}")
    @Operation(tags = "User Controller", description = "Delete User", summary = "Delete User")
    public ResponseEntity deleteUser(@PathVariable Long id){
        userEntityService.deleteUser(id);
        return ResponseEntity.ok(Void.TYPE);
    }

}

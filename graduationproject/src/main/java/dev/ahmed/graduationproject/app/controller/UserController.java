package dev.ahmed.graduationproject.app.controller;

import dev.ahmed.graduationproject.app.dto.UserDto;
import dev.ahmed.graduationproject.app.entity.User;
import dev.ahmed.graduationproject.app.service.entityservice.UserEntityService;
import dev.ahmed.graduationproject.app.dto.UserResponseDto;
import dev.ahmed.graduationproject.app.dto.UserSaveRequestDto;
import dev.ahmed.graduationproject.app.dto.UserUpdateRequestDto;
import dev.ahmed.graduationproject.gen.dto.RestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

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
    public ResponseEntity saveUser(@RequestBody User user) {
        user = userEntityService.save(user);
        return ResponseEntity.ok(user);
    }

    // kullanıcı güncellenebilir
    @PutMapping
    public ResponseEntity update(@RequestBody User user){
        user = userEntityService.update(user);
        return ResponseEntity.ok(RestResponse.of(user));
    }

    // kullanıcı silinebilir.
    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id){
        userEntityService.deleteUser(id);
        return ResponseEntity.ok(Void.TYPE);
    }

}

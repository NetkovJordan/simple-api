package com.example.webservice.web;

import com.example.webservice.model.MyUser;
import com.example.webservice.model.dto.UserDTO;
import com.example.webservice.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRestController {
    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Page<MyUser> listAll(Pageable pageable){
        return this.userService.listAll(pageable);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MyUser> findById(@PathVariable Long id){
        return this.userService.findUserById(id)
                .map(myUser -> ResponseEntity.ok().body(myUser))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PostMapping("/addUser")
    public ResponseEntity<MyUser> addUser(@RequestBody UserDTO userDTO){
        return this.userService.addUser(userDTO)
                .map(myUser -> ResponseEntity.ok().body(myUser))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }
    @PutMapping("/editUser/{id}")
    public ResponseEntity<MyUser> edit(@PathVariable Long id, @RequestBody UserDTO userDTO){
        return this.userService.editUser(id,userDTO)
                .map(myUser -> ResponseEntity.ok().body(myUser))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<MyUser> deleteById(@PathVariable Long id) {
        return this.userService.deleteUserById(id)
                .map(myUser -> ResponseEntity.ok().body(myUser))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}

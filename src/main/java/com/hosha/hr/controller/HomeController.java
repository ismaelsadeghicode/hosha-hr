package com.hosha.hr.controller;

import com.hosha.hr.domain.User;
import com.hosha.hr.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Esmaeil Sadeghi, 7/30/20 7:51 PM
 */
@RestController
@RequestMapping("/user")
public class HomeController {

    @Autowired // @Injection
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findName(){
        return ResponseEntity.ok(service.findUsers());
    }

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user){
        // save to database
        return ResponseEntity.ok(user);
    }

    // Todo

}

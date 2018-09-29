package com.cloud.authservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/users")
public class UserController {

    @RequestMapping("/current")
    public Principal getUser(Principal principal) {
        return principal;
    }
}

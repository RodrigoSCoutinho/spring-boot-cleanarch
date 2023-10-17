package br.com.rodrigoscoutinho.springbootcleanarch.controller;


import br.com.rodrigoscoutinho.springbootcleanarch.model.User;
import br.com.rodrigoscoutinho.springbootcleanarch.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    User create(@RequestBody User user){
        return userService.create(user);
    }
}

package br.com.rodrigoscoutinho.springbootcleanarch.infrastructure.controllers;


import br.com.rodrigoscoutinho.springbootcleanarch.application.usecases.CreateUserInteractor;
import br.com.rodrigoscoutinho.springbootcleanarch.model.User;
import br.com.rodrigoscoutinho.springbootcleanarch.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
    private CreateUserInteractor createUserInteractor;

    public UserController(CreateUserInteractor createUserInteractor) {
        this.createUserInteractor = createUserInteractor;
    }

    @PostMapping
    User create(@RequestBody User user){
        return userService.create(user);
    }
}

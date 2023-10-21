package br.com.rodrigoscoutinho.springbootcleanarch.controller;

import br.com.rodrigoscoutinho.springbootcleanarch.domain.entities.User;

public class UserDTOMapper {
    CreateUserResponse toResponse(User user) {
        return new CreateUserResponse(user.username(), user.email());
    }

    public User toUser(CreateUserRequest request) {
        return new User(request.username(), request.password(), request.email());
    }
}
package br.com.rodrigoscoutinho.springbootcleanarch.controller;

public record CreateUserRequest(String username, String password, String email){
}

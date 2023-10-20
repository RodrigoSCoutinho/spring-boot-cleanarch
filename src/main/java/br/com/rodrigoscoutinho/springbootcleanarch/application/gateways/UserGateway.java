package br.com.rodrigoscoutinho.springbootcleanarch.application.gateways;

import br.com.rodrigoscoutinho.springbootcleanarch.domain.entities.User;

public interface  UserGateway {
    User createUser(User user);
}

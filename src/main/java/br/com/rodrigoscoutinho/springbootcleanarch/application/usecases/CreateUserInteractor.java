package br.com.rodrigoscoutinho.springbootcleanarch.application.usecases;

import br.com.rodrigoscoutinho.springbootcleanarch.application.gateways.UserGateway;
import br.com.rodrigoscoutinho.springbootcleanarch.domain.entities.User;

public class CreateUserInteractor {
    private final UserGateway userGateway;

    public CreateUserInteractor(UserGateway createUser) {
        this.userGateway = createUser;
    }

    public User createUser(User user) {
        return userGateway.createUser(user);
    }
}

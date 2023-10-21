package br.com.rodrigoscoutinho.springbootcleanarch.infrastructure.gateways;

import br.com.rodrigoscoutinho.springbootcleanarch.application.gateways.UserGateway;
import br.com.rodrigoscoutinho.springbootcleanarch.domain.entities.User;
import br.com.rodrigoscoutinho.springbootcleanarch.infrastructure.persistence.UserEntity;
import br.com.rodrigoscoutinho.springbootcleanarch.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {
    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObj) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        UserEntity saveObj =  userRepository.save(userEntity);
        return userEntityMapper.toDomainObj(saveObj);
    }
}

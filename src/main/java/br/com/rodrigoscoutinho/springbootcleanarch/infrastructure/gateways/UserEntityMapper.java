package br.com.rodrigoscoutinho.springbootcleanarch.infrastructure.gateways;

import br.com.rodrigoscoutinho.springbootcleanarch.domain.entities.User;
import br.com.rodrigoscoutinho.springbootcleanarch.infrastructure.persistence.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity(User userDomainObj){
        return new UserEntity(userDomainObj.username(), userDomainObj.email(), userDomainObj.email());
    }

    User toDomainObj(UserEntity userEntity){
        return new User(userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail());
    }
}

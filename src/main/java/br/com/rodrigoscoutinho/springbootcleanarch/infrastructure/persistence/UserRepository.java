package br.com.rodrigoscoutinho.springbootcleanarch.infrastructure.persistence;

import br.com.rodrigoscoutinho.springbootcleanarch.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}

package br.com.rodrigoscoutinho.springbootcleanarch.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.rodrigoscoutinho.springbootcleanarch.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}

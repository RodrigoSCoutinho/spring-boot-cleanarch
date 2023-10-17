package br.com.rodrigoscoutinho.springbootcleanarch.service;


import br.com.rodrigoscoutinho.springbootcleanarch.model.User;
import br.com.rodrigoscoutinho.springbootcleanarch.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(User user){
        return userRepository.save(user);
    }
}

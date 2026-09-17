package br.edu.christus.backend.service;

import br.edu.christus.backend.domain.User;
import br.edu.christus.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User create(User entity){
        return repository.save(entity);
    }
    public List<User> findUsers(){
        return repository.findAll();
    }

}

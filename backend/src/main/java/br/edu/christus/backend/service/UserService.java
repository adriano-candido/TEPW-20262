package br.edu.christus.backend.service;

import br.edu.christus.backend.domain.model.User;
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

    public User update(User entity){
        if(entity.getId() == null){
            return null;
        }
        return repository.save(entity);
    }

    public List<User> findUsers(){
        return repository.findAll();
    }

    public void delete(Long id){
        repository.deleteById(id);
    }





}

package com.sda.javapoz11.hellospring.hellospring.service;

import com.sda.javapoz11.hellospring.hellospring.entity.User;
import com.sda.javapoz11.hellospring.hellospring.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService {

    private UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public User findById(long id) {
        return usersRepository.findById(id)
                .orElse(null);
    }

    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        usersRepository.findAll()
                .forEach(e->users.add(e));
        return users;
    }

    public List<User> findByLastName(String lastName) {
        return usersRepository.findByLastName(lastName);
    }

    @PostConstruct
    private void init() {
        usersRepository.save(User.builder().firstName("Harry").lastName("Potter").age(24).build());
        usersRepository.save(User.builder().firstName("Hermiona").lastName("Granger").age(25).build());
        usersRepository.save(User.builder().firstName("Ron").lastName("Weasley").age(23).build());
        usersRepository.save(User.builder().firstName("Fred").lastName("Weasley").age(33).build());
    }
}

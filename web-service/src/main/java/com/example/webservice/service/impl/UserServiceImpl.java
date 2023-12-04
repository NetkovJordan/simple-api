package com.example.webservice.service.impl;

import com.example.webservice.model.MyUser;
import com.example.webservice.model.dto.UserDTO;
import com.example.webservice.model.exception.UserNotFoundException;
import com.example.webservice.repository.UserRepository;
import com.example.webservice.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<MyUser> findUserById(Long id) {
        return Optional.of(this.userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id)));
    }


    @Override
    public Optional<MyUser> addUser(UserDTO userDTO) {
        MyUser myUser = new MyUser(userDTO.getName(), userDTO.getSurname(), userDTO.getAge(), userDTO.getIncome());
        this.userRepository.save(myUser);
        return Optional.of(myUser);
    }

    @Override
    public MyUser create(MyUser user) {
        return this.userRepository.save(user);
    }

    @Override
    public Optional<MyUser> editUser(Long id, UserDTO userDTO) {
        MyUser myUser = this.userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        myUser.setName(userDTO.getName());
        myUser.setSurname(userDTO.getSurname());
        myUser.setAge(userDTO.getAge());
        myUser.setIncome(myUser.getIncome());
        this.userRepository.save(myUser);
        return Optional.of(myUser);
    }

    @Override
    public Optional<MyUser> deleteUserById(Long id) {
        MyUser myUser = this.userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        this.userRepository.delete(myUser);
        return Optional.of(myUser);
    }

    @Override
    public Page<MyUser> listAll(Pageable pageable) {
        return this.userRepository.findAll(pageable);
    }
}

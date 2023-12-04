package com.example.webservice.service;

import com.example.webservice.model.MyUser;
import com.example.webservice.model.dto.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<MyUser> findUserById(Long id);
    //List<MyUser> listAll();

    Optional<MyUser> addUser(UserDTO userDTO);

    MyUser create (MyUser user);

    Optional<MyUser> editUser(Long id, UserDTO userDTO);

    Optional<MyUser> deleteUserById(Long id);

    Page<MyUser> listAll(Pageable pageable);
}

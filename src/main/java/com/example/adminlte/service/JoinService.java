package com.example.adminlte.service;

import com.example.adminlte.dto.JoinDTO;
import com.example.adminlte.entity.UserEntity;
import com.example.adminlte.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

    private final UserRepository userRepository;


    public JoinService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void joinProcess(JoinDTO joinDTO) {
        boolean isUser = userRepository.existsByUsername(joinDTO.getUsername());
        if (isUser) {
            return;
        }
        UserEntity data = new UserEntity();

        data.setUsername(joinDTO.getUsername());
        data.setPassword(joinDTO.getPassword());
        data.setRole("ROLE_ADMIN");

        userRepository.save(data);
    }
}


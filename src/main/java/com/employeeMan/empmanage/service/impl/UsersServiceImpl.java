package com.employeeMan.empmanage.service.impl;

import com.employeeMan.empmanage.dto.UsersDTO;
import com.employeeMan.empmanage.entity.Users;
import com.employeeMan.empmanage.repository.UsersRepository;
import com.employeeMan.empmanage.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<Users> getAllVisitor() {
        return usersRepository.findAll();
    }

    @Override
    public Users getVisitorByEmail(String email) {
        return usersRepository.findByEmail(email);
    }

    @Override
    public Users addVisitor(UsersDTO usersDTO) {
        Users existingUsers = usersRepository.findByEmail(usersDTO.email());
        if (existingUsers != null) {
            throw new IllegalArgumentException("Email already in use.");
        }
        Users users = new Users(
                usersDTO.firstname(),
                usersDTO.lastname(),
                usersDTO.email(),
                usersDTO.password()
        );
        usersRepository.save(users);
        return users;
    }
}

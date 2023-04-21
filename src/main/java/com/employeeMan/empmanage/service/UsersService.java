package com.employeeMan.empmanage.service;

import com.employeeMan.empmanage.dto.UsersDTO;
import com.employeeMan.empmanage.entity.Users;

import java.util.List;

public interface UsersService {
    Users getVisitorByEmail(String email);

    Users addVisitor(UsersDTO usersDTO);

    List<Users> getAllVisitor();
}

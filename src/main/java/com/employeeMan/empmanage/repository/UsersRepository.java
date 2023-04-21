package com.employeeMan.empmanage.repository;

import com.employeeMan.empmanage.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Users findByEmail(String email);
}

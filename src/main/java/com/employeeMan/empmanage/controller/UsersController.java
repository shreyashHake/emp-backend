package com.employeeMan.empmanage.controller;

import com.employeeMan.empmanage.dto.UsersDTO;
import com.employeeMan.empmanage.entity.Users;
import com.employeeMan.empmanage.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/visitor")
@CrossOrigin(origins = "http://localhost:4200")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping()
    public List<Users> getAllVisitors() {
        return usersService.getAllVisitor();
    }

    @GetMapping("/get/{email}")
    public Users getVisitorByEmail(@PathVariable String email) {
        return usersService.getVisitorByEmail(email);
    }

    @PostMapping("/register")
    public Users addVisitor(@RequestBody UsersDTO user) {
        return usersService.addVisitor(user);
    }
}

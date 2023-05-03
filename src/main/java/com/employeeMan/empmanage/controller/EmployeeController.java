package com.employeeMan.empmanage.controller;

import com.employeeMan.empmanage.dto.EmployeeRequest;
import com.employeeMan.empmanage.entity.Employee;
import com.employeeMan.empmanage.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee")
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/save")
    public Employee saveEmployee(
            @RequestBody EmployeeRequest employeeRequest
    ) {
        return employeeService.saveEmployee(employeeRequest);
    }

}

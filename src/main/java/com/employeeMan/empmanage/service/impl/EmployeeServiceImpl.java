package com.employeeMan.empmanage.service.impl;

import com.employeeMan.empmanage.dto.EmployeeRequest;
import com.employeeMan.empmanage.entity.Employee;
import com.employeeMan.empmanage.repository.EmployeeRepository;
import com.employeeMan.empmanage.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmployee(EmployeeRequest employeeRequest) {
        Employee employee = new Employee(
                employeeRequest.firstname(),
                employeeRequest.lastname(),
                employeeRequest.email(),
                employeeRequest.phone()
        );
        employeeRepository.save(employee);
        return employee;
    }
}

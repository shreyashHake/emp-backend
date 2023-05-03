package com.employeeMan.empmanage.service;

import com.employeeMan.empmanage.dto.EmployeeRequest;
import com.employeeMan.empmanage.entity.Employee;

public interface EmployeeService {
    Employee saveEmployee(EmployeeRequest employeeRequest);
}

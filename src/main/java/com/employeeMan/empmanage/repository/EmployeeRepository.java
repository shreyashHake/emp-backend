package com.employeeMan.empmanage.repository;

import com.employeeMan.empmanage.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

package com.employeeMan.empmanage.dto;

import java.util.Date;

public record EmployeeRequest(
        String firstname,
        String lastname,
        String email,
        String phone
//        String address,
//        Date dob,
//        String gender,
//        String department,
//        Date hireDate,
//        String jobTitle,
//        Long salary,
//        String manager
) {
}

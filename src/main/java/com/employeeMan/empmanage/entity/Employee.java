package com.employeeMan.empmanage.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.lang.NonNull;

import java.util.Date;

/**
 * ID: A unique identifier for each employee.
 * First Name: The employee's first name.
 * Last Name: The employee's last name.
 * Email: The employee's email address.
 * Phone: The employee's phone number.
 * Address: The employee's address.
 * City: The employee's city of residence.
 * State/Province: The employee's state or province of residence.
 * Zip/Postal Code: The employee's zip or postal code.
 * Country: The employee's country of residence.
 * Date of Birth: The employee's date of birth.
 * Gender: The employee's gender.
 * Hire Date: The date the employee was hired.
 * Department: The department the employee works in.
 * Job Title: The employee's job title.
 * Salary: The employee's salary.
 * Manager: The employee's manager.
 * Employment Status: Whether the employee is full-time, part-time, or a contractor.
 * Start Date: The date the employee started working.
 * End Date: The date the employee stopped working.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;

//    private String address;
//    private String city;
//    private String state;
//    private String zip;
//    private String country;
//    private Date dob;
//    private String gender;
//    private String department; // to change . .
//    private Date hireDate;
//    private String jobTitle;
//    private Long salary;
//    private String manager; // to change . .


    public Employee(String firstname, String lastname, String email, String phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
    }
}

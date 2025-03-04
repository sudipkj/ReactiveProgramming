package com.weblfux.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Employee {
    Integer empId;
    String name;

    public Employee(Integer i, String empName) {
    }
}

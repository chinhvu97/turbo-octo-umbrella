package com.example.dummy.employee;

import java.util.List;

public interface EmployeeRepositoryCustom {
    List<Employee> findByNameAndAge(String name, Integer age);
}

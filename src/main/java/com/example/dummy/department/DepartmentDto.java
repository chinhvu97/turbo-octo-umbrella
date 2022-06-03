package com.example.dummy.department;

import com.example.dummy.employee.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {
    private long id;

    private String name;

    private String location;

    private List<Employee> employees;
}

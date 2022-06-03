package com.example.dummy.employee;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    Employee toEntity(EmployeeDto employeeDto);

    EmployeeDto toDto(Employee employee);

    List<EmployeeDto> toDtoList(List<Employee> employeeList);
}

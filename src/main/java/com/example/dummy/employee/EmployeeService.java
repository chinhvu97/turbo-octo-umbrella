package com.example.dummy.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeMapper employeeMapper;

    private final EmployeeRepositoryCustom employeeRepositoryCustom;
    public List<EmployeeDto> getAllByPositionAndDepartment(String position, String department) {
        return null;
    }

//    public EmployeeDto getById(Long id) {
//        return employeeMapper.toDto(employeeRepository.getReferenceById(id));
//    }

    public List<EmployeeDto> getAllByNameAndAge(String name, Integer age) {
        return employeeMapper.toDtoList(employeeRepositoryCustom.findByNameAndAge(name, age));
    }
}

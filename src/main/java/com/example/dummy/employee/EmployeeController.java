package com.example.dummy.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

//    @GetMapping("/{id}")
//    public ResponseEntity<EmployeeDto> getById(@PathVariable Long id) {
//        return new ResponseEntity<>(employeeService.getById(id), HttpStatus.OK);
//    }

    @GetMapping("/position/{position}/department/{department}")
    public ResponseEntity<List<EmployeeDto>> getAllByPositionAndDepartment(
            @PathVariable String position, @PathVariable String department) {
        return new ResponseEntity<>(employeeService.getAllByPositionAndDepartment(position, department), HttpStatus.OK);
    }

    @GetMapping("/name/{name}/age/{age}")
    public ResponseEntity<List<EmployeeDto>> getAllByNameAndAge (@PathVariable String name, @PathVariable Integer age ) {
        return new ResponseEntity<>(employeeService.getAllByNameAndAge(name, age), HttpStatus.OK);
    }
}

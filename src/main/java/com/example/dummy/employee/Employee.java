package com.example.dummy.employee;

import com.example.dummy.department.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "employee", schema = "app_db")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    private String address;
    private Integer age;
    private Long salary;
    @Column(name = "title")
    @Enumerated(EnumType.STRING)
    private ETitle title;
    @Column(name = "department_id")
    private Long departmentId;
}

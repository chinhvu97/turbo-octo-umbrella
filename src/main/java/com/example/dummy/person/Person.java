package com.example.dummy.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "person")
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    // id, name, email
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;
}

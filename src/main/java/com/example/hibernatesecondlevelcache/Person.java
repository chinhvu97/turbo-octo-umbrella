package com.example.hibernatesecondlevelcache;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

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
    private String name;
    private String email;
}

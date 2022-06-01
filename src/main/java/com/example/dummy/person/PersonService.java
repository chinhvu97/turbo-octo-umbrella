package com.example.dummy.person;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public Person findById(Long id) {
        Optional<Person> oPerson = personRepository.findById(id);
        if (oPerson.isPresent()) {
            return oPerson.get();
        } else {
            throw new RuntimeException("user not found");
        }
    }
}

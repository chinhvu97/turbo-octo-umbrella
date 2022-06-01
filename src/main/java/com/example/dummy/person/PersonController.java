package com.example.dummy.person;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    // Get method user by id
    @RequestMapping("/{id}")
    public Person getOne(@PathVariable Long id) {
        return personService.findById(id);
    }

}

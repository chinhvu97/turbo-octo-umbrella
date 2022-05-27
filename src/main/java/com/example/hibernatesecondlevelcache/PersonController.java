package com.example.hibernatesecondlevelcache;

import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    private final SessionFactory sessionFactory;
    // Get method user by id
    @RequestMapping("/{id}")
    public Person getOne(@PathVariable Long id) {
        return personService.findById(id);
    }

    @GetMapping("/statistics")
    public String getStatistics() {
        return sessionFactory.getStatistics().toString();
    }
}

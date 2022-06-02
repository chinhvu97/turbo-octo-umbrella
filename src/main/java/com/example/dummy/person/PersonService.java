package com.example.dummy.person;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class PersonService {
    private final PersonRepository personRepository;

    public final PersonMapper personMapper;

    public PersonDto findById(Long id) {
        Optional<Person> oPerson = personRepository.findById(id);
        if (oPerson.isEmpty()) {
            log.info("Can not find person by id :{}", id);
            return null;
        } else {
            log.info("Found person by id:{}", id);
            return personMapper.toDto(oPerson.get());
        }
    }

    public PersonDto create(PersonDto personDto) {
        Person toCreate = personMapper.toEntity(personDto);
        return personMapper.toDto(
                personRepository.save(toCreate)
        );
    }
}
